package Clases;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MySQL.Funcion;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Verificar {

    static Statement st;

    public static boolean validarUsuario(String elUsr, String elPw) {
        try {
            Funcion.CrearConexion();
            st = Funcion.conexion();
            boolean estaValidado = false;
            //Verificando si es un usuario existente
            ResultSet resultadosConsultaSecundarios = Funcion.Select(st, "SELECT *FROM usuario_secundario WHERE apodo_usuario='" + elUsr + "' AND contrasena_usuario='" + elPw + "'");
            if (resultadosConsultaSecundarios.first()) {        // si es valido el primer reg. hay una fila, entonces el usuario y su pw existen
                Variables.setIdUsuario(resultadosConsultaSecundarios.getInt("id"));
                Variables.setIdUsuario(resultadosConsultaSecundarios.getInt("id"));
                Variables.setTipoUsuario("Secundario");
                return true;        //usuario validado correctamente

            } else {
                estaValidado =  false;        //usuario validado incorrectamente
            }
            
            return estaValidado;
            
        } catch (Exception e) {
            return false;
        }

    }
}
