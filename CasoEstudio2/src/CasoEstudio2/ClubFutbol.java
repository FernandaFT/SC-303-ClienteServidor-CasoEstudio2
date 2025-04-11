/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoEstudio2;

import javax.swing.JOptionPane;

/**
 *
 * @author fernandafajardo
 */
public class ClubFutbol extends InstitucionDeportiva {
    
   private int numeroCamisa;
    private int id;
    private String ligaProfesional;

    public ClubFutbol(int numeroCamisa, int id, String ligaProfesional, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.numeroCamisa = numeroCamisa;
        this.id = id;
        this.ligaProfesional = ligaProfesional;
    }

    public ClubFutbol(int numeroCamisa, String ligaProfesional, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.numeroCamisa = numeroCamisa;
        this.ligaProfesional = ligaProfesional;
    }

    public ClubFutbol(int id, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getLigaProfesional() {
        return ligaProfesional;
    }

    public void setLigaProfesional(String ligaProfesional) {
        this.ligaProfesional = ligaProfesional;
    }
    
    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,"Inscripción Correcta " + getNombre(),"Confirmación",JOptionPane.INFORMATION_MESSAGE);
    }   
    
   @Override
    public void encontrado(){
        String mensaje = "ID encontrado: \nLa persona es " + getNombre() +
             "\nCon camisa número " + getNumeroCamisa() +
             "\nDe la liga " + getLigaProfesional() +
             "\nSu posición " + getUbicacion() + ".";
            
        JOptionPane.showMessageDialog(null, mensaje, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    }
}
