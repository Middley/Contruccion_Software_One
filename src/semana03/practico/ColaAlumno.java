/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ColaAlumno {
    
    public static void main(String[] args) {
        
    }
    
}


class nodoo{
    
    Alumno alumno;
    public nodoo sig;
    
    public nodoo(){
        this.sig = null;
    }
    public nodoo(Alumno alumno){
        this.alumno = alumno;
        this.sig = null;
    }
    
    public nodoo(Alumno alumno,nodoo n){
        this.alumno = alumno;
        this.sig = n;
    }        
    
}


class funciones{
        
    protected static nodoo cola;
    protected static nodoo fin;
    
    public funciones(){
        cola = null;
        fin = null;
    }
    
    
    public void addCola(Alumno alumno){
        cola = new nodoo(alumno,cola);
        if(fin==null)
            fin = cola;
    }
    
        
    public Alumno removeCola(){
        Alumno alumno = cola.alumno;
        if(cola == fin)
            cola = fin = null;
        else
            cola = cola.sig;
        return alumno;
    }
    
    
    
     public void imprimirCola(){
        nodoo aux = cola;
        while(aux != null){
            System.out.println(aux.alumno.toString());
            aux = aux.sig;
        }
    }

}


