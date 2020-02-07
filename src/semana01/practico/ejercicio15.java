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


public class ejercicio15 {
    
    public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void colorVehiculo(){
        
        int amarillo = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;
                
        int numV=0;
        int vector[]; 
        String aux[];
        
        System.out.println("Cantidad de autos entrando: ");
        numV = sc().nextInt();
        
        vector = new int[numV];
        aux = new String[numV];        
        
        for(int i=0;i<vector.length;i++){
            vector[i] = aleatorio(1000,10000); //llenado de vector          
            aux[i] =""+vector[i];//paso a cadema
        }        
        System.out.println("Los numeros son:");
        for(int i=0;i<aux.length;i++){
            System.out.println(aux[i]);            
        }        
        
        for(int i=0;i<aux.length;i++){                        
            int tam = aux[i].length()-1;
                
            String digito = ""+aux[i].charAt(tam);
                
            if(digito.equals("2") || digito.equals("1")){
                amarillo++;
            }
            if(digito.equals("3") || digito.equals("4")){
                rosa++;
            }                
            if(digito.equals("5") || digito.equals("6")){
                roja++;
            }                
            if(digito.equals("7") || digito.equals("8")){
                verde++;
            }
            if(digito.equals("9") || digito.equals("0")){
                azul++;
            }                                            
        }
        
        System.out.println("Autos Amarillo: "+amarillo+"\n"+
                "Autos Rosas: "+rosa+"\nAutos Rojos: "+roja+
                "\nAutos Verdes: "+verde+"\nAutos Azules: "+azul);
        
    }
    
    public static void main(String[] args) {
        ejercicio15 ej = new ejercicio15();
        ej.colorVehiculo();
    }
    
}
