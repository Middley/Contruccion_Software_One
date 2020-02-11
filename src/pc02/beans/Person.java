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

/*
RUC, nombre de la tienda,dirección, correo y teléfono de contacto
DNI, nombres, paterno, materno,   teléfono, correo y dirección.  
*/
public abstract class Person {
    
    protected String direccion;
    protected String correo;
    protected String telefono;
    
    
    public Person(String direccion,String correo,long telefono){
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = ""+telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono+="" + telefono;
    }
    
    //public abstract int tipoProducto();
    
        
    
}
