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
public class Digitos {    
    
    public static Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void num_digitos(int numero){        
        String cadena = String.valueOf(numero);                
        int suma = 0;        
        for(int i=0;i<cadena.length();i++){            
            suma+=Integer.parseInt(""+cadena.charAt(i));            
        }
        System.out.println("la suma es: "+suma);        
    }
    
    
    public static void main(String[] args) {       
        Digitos d = new Digitos();        
        System.out.print("Ingrese un numero: ");
        int num = sc().nextInt();
        d.num_digitos(num);        
    }
    
    
    
    
}
