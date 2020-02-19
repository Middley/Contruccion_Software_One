/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ColaAlumno {
    
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public static Alumno getAlumno(){        
            
            Alumno alumno = new Alumno(JOptionPane.showInputDialog("Ingrese Nombre Alumno"), 
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")));
            return alumno;
    }        
    
    
    public static void main(String[] args) {
        funciones fun = new funciones();
        int opcion = 0;
        do{            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu  de Colas\n"+"1.- Agregar \n2.- Sacar"                    
                        + "\n3.- Imprimir Cola\n4.- Salir"));
            
            switch(opcion){
                
                case 1: // agregar un elemento 
                    nodoo colaNodo = new nodoo();
                    colaNodo.alumno = ColaAlumno.getAlumno();
                    fun.addCola(ColaAlumno.getAlumno());
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre para eliminar");
                    Alumno al = fun.removeColaa(nombre);                    
                    JOptionPane.showMessageDialog(null,"el Alumno eliminado es: "+al.getName()+" edad: "+al.getEdad());
                    break;
                case 3:
                    fun.imprimirCola();
                    break;
                case 4:
                    break;
                default:
                    
            }
        }
        while(opcion !=4);
        
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
    
        
    public Alumno removeCola(Alumno elemento){
        elemento = cola.alumno;
        if(cola == fin)
            cola = fin = null;
        else
            cola = cola.sig;
        return elemento;
    }
    
    public Alumno removeColaa(String nombre){
        Alumno al = null;
        if(cola == fin)
            cola = fin = null;
        else{
            while(true){
                if(nombre.equalsIgnoreCase(cola.alumno.getName())){
                    al = cola.alumno;
                    cola = cola.sig;                    
                    break;
                }
            }
        }        
        return al;
    }
    
    
    
     public void imprimirCola(){
        nodoo aux = cola;
        while(aux != null){
            System.out.println(aux.alumno.toString());
            aux = aux.sig;
        }
    }

}


