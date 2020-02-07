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
public class Estructura_repetitiva {
       
    
    public static Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void promedios(){
        //Scanner sc = new Scanner(System.in);
        double alamacena=0;
        double numero=0.0;
        int contador = 0;
        System.out.println("Ingrese los numeros: ");
        do{            
            numero = sc().nextDouble();        
            if(numero>=0){
                alamacena+=numero;
                contador++;
            }                               
        }while(numero>=-1);        
        double promedio = alamacena/contador;        
        System.out.println("El promedio general es: "+promedio);
    }
   
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Estructura_repetitiva er = new Estructura_repetitiva();
        //er.promedios();
        //Ejercicio4 tm = new Ejercicio4();
        //tm.tabla(21);
        
        
    }
}





class 





//--------------------------------------------------------------------------------------------
//-------------------------- tabla de multiplicar ------------------------------------------
//--------------------------------------------------------------------------------------------
// EJERCICIO 4
class Ejercicio4{
    
    
    public void tabla(int numero){
        int iter = 0;
        int rpta = 0;
        System.out.println("Tabla de multiplicar del Nro: "+numero);
        for(int i=0;i<numero;i++){
            iter=i+1;
            rpta = iter*numero;
            System.out.println(numero+" x "+iter+" = "+rpta);
            rpta = 0;
        }
    }
    
    
    
}


//--------------------------------------------------------------------------------------------
//-------------------------- tabla de multiplicar ------------------------------------------
//--------------------------------------------------------------------------------------------
// EJERCICIO 16

















