/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historial;

import Clases.Variables;
import MySQL.Funcion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author zero-vivanco
 */
public class Historial {

    public static String[][] historial, lista_url;
    static Statement st, st2;
    static ResultSet Comando;

    public static void Consultar_Historial() {
        Connection conexion = null;
        Statement consulta = null;
        int contador, contador_dos, tamano, numero_dominios = 0, numero_visitas = 1, plazo = 0, x = 0;
        BD conex = new BD();

        try {
            PreparedStatement pstm = (PreparedStatement) conex.getConnection().prepareStatement("SELECT plazo_eliminación FROM configuración;");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                plazo = Integer.parseInt(res.getString("plazo_eliminación"));
            }
            System.out.println(plazo);
        } catch (Exception i) {
        }

        Date fecha_Actual = new Date(System.currentTimeMillis());
        Date fecha_Limite = new Date(fecha_Actual.getTime() - plazo * 24 * 3600 * 1000);
        System.out.println(fecha_Actual);
        System.out.println(fecha_Limite);

        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:/home/ezero/.config/google-chrome/Default/History");
            conexion.setAutoCommit(false);
            consulta = conexion.createStatement();

            ResultSet resultado = consulta.executeQuery("SELECT COUNT(*) FROM urls;");
            tamano = Integer.valueOf(resultado.getString(1));
            lista_url = new String[tamano][3];

            resultado = consulta.executeQuery("SELECT * FROM urls;");
            while (resultado.next()) {
                String url = resultado.getString("url");

                java.math.BigInteger hora = new java.math.BigInteger(resultado.getString("last_visit_time"));
                java.math.BigInteger micro = new java.math.BigInteger("11644473600000000");
                java.math.BigInteger million = new java.math.BigInteger("1000000");
                java.math.BigInteger result = (hora.subtract(micro)).divide(million);
                Date fecha = new Date(Long.parseLong(result.toString()) * 1000);

                String[] arrString = url.split("/");
                String dominio = arrString[2];

                lista_url[x][0] = dominio;
                lista_url[x][1] = fecha.toString();
                x++;
            }

            for (contador = 0; contador < lista_url.length - 1; contador++) {
                if (fecha_Limite.before(Date.valueOf(lista_url[contador][1])) && lista_url[contador][0] != "0") {
                    numero_dominios++;
                    for (contador_dos = contador + 1; contador_dos < lista_url.length; contador_dos++) {
                        if (lista_url[contador][0].equals(lista_url[contador_dos][0]) && lista_url[contador][1].equals(lista_url[contador_dos][1])) {
                            lista_url[contador_dos][0] = "0";
                            numero_visitas++;
                        }
                    }
                    lista_url[contador][2] = String.valueOf(numero_visitas);
                    numero_visitas = 1;
                } else {
                    lista_url[contador][0] = "0";
                }
            }
            if (lista_url[lista_url.length - 1][0] != "0") {
                lista_url[lista_url.length - 1][2] = "1";
                numero_dominios++;
            }

            historial = new String[numero_dominios][3];
            contador_dos = 0;

            for (contador = 0; contador < lista_url.length; contador++) {
                if (lista_url[contador][0] != "0") {
                    historial[contador_dos][0] = lista_url[contador][0];
                    historial[contador_dos][1] = lista_url[contador][1];
                    historial[contador_dos][2] = lista_url[contador][2];
                    contador_dos++;
                }
            }

            for (contador = 0; contador < historial.length; contador++) {
                System.out.println("\nURL: " + historial[contador][0] + "\nFECHA: " + historial[contador][1] + "\nVISITAS: " + historial[contador][2]);
            }

            resultado.close();
            consulta.close();
            conexion.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void Actualizar_Registro(String dominio, String visitas, String Usuario) {
        String actualizacion;
        actualizacion = "UPDATE registros SET"
                + " numero_visitas = " + visitas
                + " WHERE nombre_usuario = '" + Usuario + "' AND dominio = '" + dominio + "';";
        Funcion.Update(st2, actualizacion);
    }

    public static void Agregar_Registro(String nombre, String area, String dominio, String dia, String numeroVisitas) {
        String insercion;
        insercion = "INSERT INTO registros VALUES ('"
                + nombre + "','" //nombre
                + area + "','" //area
                + dominio + "','" //dominio
                + dia + "','" //dia visita
                + numeroVisitas + "'); "; //numero visitas
        Funcion.Update(st2, insercion);
    }

    public static void Guardar_Registros() throws SQLException {
        String id_Usuario = "", nombre_Usuario = "", area_Usuario = "";
        int contador;
        Boolean existente = false;
         id_Usuario = String.valueOf(Variables.getIdUsuario());
         try {
         Comando = Funcion.Select(st, "SELECT * FROM usuario_secundario WHERE id = " + id_Usuario + ";");
         while (Comando.next()) {
         nombre_Usuario = (String.valueOf(Comando.getObject("nombre_usuario")));
         area_Usuario = (String.valueOf(Comando.getObject("area_usuario")));
         }
         } catch (Exception e) {
         System.out.println(e);
         }
        for (contador = 0; contador < historial.length; contador++) {
            existente = false;
            try {
                Comando = Funcion.Select(st, "SELECT *FROM registros WHERE nombre_Usuario = '" + nombre_Usuario + "';");
                while (Comando.next()) {
                    String dominio = String.valueOf(Comando.getObject("dominio"));
                    String dia_visita = String.valueOf(Comando.getObject("dia_visita"));
                    if (historial[contador][0].equals(dominio) && historial[contador][1].equals(dia_visita)) {
                        Actualizar_Registro(historial[contador][0], historial[contador][2], nombre_Usuario);
                        existente = true;
                        break;
                    }
                }
                if(existente == false){
                    Agregar_Registro(nombre_Usuario, area_Usuario, historial[contador][0], historial[contador][1], historial[contador][2]);
                    existente = false;
                }
            } catch (Exception i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Funcion.CrearConexion();
        st = Funcion.conexion();
        st2 = Funcion.conexion();
        Consultar_Historial();
        Guardar_Registros();
    }
}
