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

public class Alumno {
    
    private String name;
    private int edad;
    
    public Alumno(String name, int edad){
        this.name = name;
        this.edad = edad;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }    
            
    
    public String mayorMenor(){
        if(edad>=18)
            return name+" es MAYOR de Edad";
        else if(edad<18){
            if(edad<=0)
            return " No exite esa edad";
            return name+" es MENOR de Edad";
        }
        else         
            return null;
    }                       
    
    
    
//    public static void main(String[] args) {
//        Alumno alumno1 = new Alumno("Pablo", 1);
//        System.out.println(alumno1.mayorMenor());
//    }
//    

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", edad=" + edad + '}';
    }
}
