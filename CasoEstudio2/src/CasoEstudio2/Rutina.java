/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoEstudio2;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author fernandafajardo
 */
public class Rutina extends Conexion {
    
public boolean registrar(ClubFutbol club) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO ClubFutbol(id, nombre, ubicacion, numerocamisa, ligaprofesional) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, club.getId());
            ps.setString(2, club.getNombre());
            ps.setString(3, club.getUbicacion());
            ps.setInt(4, club.getNumeroCamisa());
            ps.setString(5, club.getLigaProfesional());
            ps.execute();
            club.mostrarInfo();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(ClubFutbol club) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM ClubFutbol WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, club.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                club.setNombre(rs.getString("nombre"));
                club.setUbicacion(rs.getString("ubicacion"));
                club.setNumeroCamisa(rs.getInt("numerocamisa"));
                club.setLigaProfesional(rs.getString("ligaprofesional"));

                club.encontrado();
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public ClubFutbol[] obtenerDatos() {
        Connection con = getConexion();
        Statement st = null;
        ResultSet rs = null;
        ClubFutbol[] clubes = new ClubFutbol[100]; //100 inscripciones 
        int contador = 0;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT id, nombre, ubicacion, numerocamisa, ligaprofesional FROM ClubFutbol");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String ubicacion = rs.getString("ubicacion");
                int numeroCamisa = rs.getInt("numerocamisa");
                String ligaProfesional = rs.getString("ligaprofesional");

                ClubFutbol club = new ClubFutbol(numeroCamisa, id, ligaProfesional, nombre, ubicacion);
                clubes[contador] = club;
                contador++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Se crear un array del tamaño exacto con los elementos encontrados
        ClubFutbol[] clubesFinal = new ClubFutbol[contador];
        System.arraycopy(clubes, 0, clubesFinal, 0, contador);
        return clubesFinal;
    }
    
}
