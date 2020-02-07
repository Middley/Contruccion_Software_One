/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio05 {
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    
    public void primos(){
        int n=0;
        System.out.println("Ingrese n: ");
        n = sc().nextInt();
        int vector[] = new int[n];
        for(int i=1;i<n;i++){            
            if(i%2!=0 && i/i==1){
                vector[i] = i;
            }
            
        }
        
        for(int i=0;i<vector.length;i++){
            System.out.println("Es primo: "+vector[i]);
        }
        
        
    }
    
    public static void main(String[] args) {
        ejercicio05 ej = new ejercicio05();
        ej.primos();
    }
    
}
