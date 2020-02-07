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

//38) Calcular la suma siguiente:  100 + 98 + 96 + 94 + . . . + 0 en este orden 

public class Ejercicio38 {
    
    public void suma100(){
        int suma=0;
        for(int i=100;i>=0;){
            suma+=i;
            i-=2;
        }
        System.out.println("La suma es: "+suma);
    }
    
    public static void main(String[] args) {
        Ejercicio38 ej = new Ejercicio38();
        ej.suma100();
    }
}
