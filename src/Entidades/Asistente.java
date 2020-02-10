/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Asistente extends Person{
     
    private String telefono;
    private String direccion;

    public Asistente(String code, String correo, String name, String lastName,String telefono, String direccion) {
        super(code, correo, name, lastName);
        this.telefono = telefono;
        this.direccion = direccion;        
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Asistente{"+mostrar() + "telefono=" + telefono + ", direccion=" + direccion + '}';
    }
   

    
    
    
}
