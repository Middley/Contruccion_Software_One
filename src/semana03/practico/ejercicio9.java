/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Iterator;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio9 {
    
}

class student implements Iterable<alumno>{
    
    
    
    
    
    @Override
    public Iterator<alumno> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class alumno{
    
    
    private String nombre;
    private String dni;
    
    public alumno(String name, String dni){
        this.nombre = name;
        this.dni = dni;
    }
    
    
    
    
}
