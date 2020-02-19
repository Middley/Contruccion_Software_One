/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejectuable {
    public static void main(String[] args) {
        ciudadano c1 = new ciudadano("123","luis"," Salazar");
        System.out.println(c1.toStringC());
    }
}

class humano{
    
    protected String nombre;
    protected String apellido;

    public humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }       
    
    public String nombreCompleto(){
        return this.apellido+" , "+this.nombre;
    }
    
    public String identificacion(){
        return this.nombreCompleto();
    }

    @Override
    public String toString() {
        return "humano{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
        
}

class ciudadano extends humano{
    
    private String documento;
    
    public ciudadano(String documento,String nombre,String apellido){
        super(nombre, apellido);
        this.documento = documento;
    }

    
    public String toStringC() {
        return this.toString()+"ciudadano{" + "documento=" + documento + '}';
    }
    
    
}

