/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoEstudio2;
import java.sql.*;

/**
 *
 * @author fernandafajardo
 */
public class Conexion {
    
    Connection con = null;
    String basedatos = "instituciondeportiva"; // nombre de la BD
    String url = "jdbc:mysql://localhost:3306/" + basedatos; // dirección, puerto y nombre de BD
    String usuario = "root";
    String password = "";
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario,password);
        }catch(ClassNotFoundException | SQLException e){
            System.err.println();
        }
        return con;
    }
}
