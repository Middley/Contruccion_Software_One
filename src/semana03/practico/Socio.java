/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Socio {
    
    private String nombre;
    private int antiguedad;
    
//    public Socio(String nombre,int antiguedad){
//        this.nombre = nombre;
//        this.antiguedad = antiguedad;
//    }
//    
    
    public Socio(){
        System.out.print("Nombre Socio: ");
        this.nombre = sc().nextLine();
        System.out.print("Años de antiguedad: ");
        this.antiguedad = sc().nextInt();
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setAntiguedad(int años){
        this.antiguedad = años;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }        
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
        
}
