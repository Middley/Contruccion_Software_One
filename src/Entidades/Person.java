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
public abstract class Person {
    
    private String code;
    private String correo;    
    protected final String name;
    protected final String lastName;

    public Person(String code, String correo, String name, String lastName) {
        this.code = code;
        this.correo = correo;
        this.name = name;
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getName() {
        return name;
    }
   

    public String getLastName() {
        return lastName;
    }

    //public abstract boolean disponibilidad();
    
    public String mostrar() {
        return  "code: " + code + ", correo: " + correo + ", name: " + name + ", lastName: " + lastName ;
    }
    
    
    
}
