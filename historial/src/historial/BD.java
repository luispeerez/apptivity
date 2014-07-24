/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package historial;

import java.sql.*;

/**
 *
 * @author zero-vivanco
 */
public class BD{
    Connection conn = null;
    public BD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apptivity","root","");
            if (conn!=null){
                System.out.println("Conectado a base de datos.");
            }
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    //llama  la conexion....
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
    }
}