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
public class ejercicio17 {
    
    
    public void inversion(double inversion){
        
        double interes = 0.02;        
        double gananciaMensual=0;
        double gananciaAnual=0;
        double nuevoMonto=inversion;
        for(int i=0;i<12;i++){            
            gananciaMensual+=(nuevoMonto*interes);
            gananciaAnual+=gananciaMensual;
            nuevoMonto+=gananciaAnual;
        }        
        System.out.println("La ganancia Anual será: "+gananciaAnual);        
    }
    
    public static void main(String[] args) {
        ejercicio17 ej = new ejercicio17();
        ej.inversion(100);
    }
    
}
