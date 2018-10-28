
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

    String user;
    String password;
    Connection conexion;
    public Conexion()
    {
        user="root";
        password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdlibreria", user, password);
//            if (conexion!=null) {
//                JOptionPane.showMessageDialog(null, "Conectado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//            }
        } catch (ClassNotFoundException |SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar", "Mensaje", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
        }
    }
    public Conexion(String user, String password){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdlibreria", user, password);
//            if (conexion!=null) {
//                JOptionPane.showMessageDialog(null, "Conectado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//            }
        } catch (ClassNotFoundException |SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar", "Mensaje", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return conexion;
    }
}
