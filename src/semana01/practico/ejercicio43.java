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
public class ejercicio43 {
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void compras(double vector[],int i){
        System.out.println("Ingrese total de compras del cliente: "+i);
        double montoTotal = sc().nextDouble();
        vector[i] = montoTotal;
    }
    
    public void ventalFinales(){
        
        double ventasDia=0;
        int seguir=1;        
        
        double vector[];
        int tam=1;
        vector = new double[tam];
        while(seguir==1){                        
            for(int i=0;i<vector.length;i++){
                vector = new double[tam];
                compras(vector, i);                
                System.out.println("Ingresar Nueva venta: 1\n salir: 0");
                seguir = sc().nextInt();
                if(seguir==0){
                    break;
                }
                tam++;
            }                
        }
               
        for(int i=0;i<vector.length;i++){
            ventasDia+=vector[i];            
        }
        
        System.out.println("Ventas del DIa: "+ventasDia);
        System.out.println("Clientes Atendidos: "+vector.length);
        
    }
    
    public static void main(String[] args) {
        ejercicio43 ej = new ejercicio43();
        ej.ventalFinales();
    }
    
}
