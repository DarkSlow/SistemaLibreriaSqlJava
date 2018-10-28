/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon_PC
 */
public class Conexion 
{
  Connection con;
    String usuario = "sa";
    String contraseña = "simon98ty";
    

    public Conexion() {
        try {
            /*
            Class.forName : se encarga de cargar el driver que usaremos para
            realizar la conexion
            */ 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            /*
            Ahora con la varialble declara de conexion obtendremos la ruta en donde se 
            encuentra alojada nuestra base de datos especificando el usuario y contraseña
            */
            con = DriverManager.getConnection("jdbc:sqlserver://Simon:1433;databaseName=BDLibreria", usuario, contraseña);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar", "Mensaje", 0);
        }
    }

    public Connection getConnection() {
        /*
        Metodo de la Clase Conexion para retornar la conexion
        */
        return con;
    }
}


