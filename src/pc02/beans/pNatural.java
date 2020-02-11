/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

public class pNatural extends Person{
    
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;

    public pNatural(long dni,String nombre,String paterno,String materno,String direccion, String correo, long telefono) {
        super(direccion, correo, telefono);
        this.dni = dni+"";
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPaterno() {
        return paterno;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    
    public String getMaterno() {
        return materno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
        
    
    
    
    
}
