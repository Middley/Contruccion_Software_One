/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

import java.util.Scanner;

public class Ejercicio13 {
            
    
    public void salarioSemanal(){
        
        int horasSemanales = 0;
        double sueldo=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas de trabajo: ");
        horasSemanales = sc.nextInt();
        
        if(horasSemanales<=40){
            sueldo+=20*horasSemanales;            
        }else if(horasSemanales>40){
            int horas = horasSemanales-40;
            int extras = (horas*45);
            double sueldoNormal = 40*20;
            sueldo+=extras+sueldoNormal;
        }
        
        System.out.println("el sueldo semanal del trabajador es: "+sueldo);
        
    }
    
    public static void main(String[] args) {
        Ejercicio13 ej = new Ejercicio13();
        ej.salarioSemanal();
    }
    
    
}
