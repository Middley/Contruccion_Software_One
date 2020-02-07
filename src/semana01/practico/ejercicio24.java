/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio24 {
        
    public int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void tienda(){
        System.out.println(" ------- TIENDA DESCUENTO ------- ");
        System.out.println("Concurrencia de personas: ");
        int tam = 0; 
        tam = sc().nextInt();
        int iter=0;
        
        int bolita = 0;
        double importeP = 0;
        
        double personas[] = new double[tam];//sin descuento
        double aux[] = new double[tam];//con descuento
        double vec[] = new double[tam];
        double descuento=0;
        double auxImp = 0;
        
        for(int i=0;i<personas.length;i++){            
            personas[i] = aleatorio(0, 10000);//compras
            aux[i] = aleatorio(0,2);            
        }        
        for(int i=0;i<aux.length;i++){
            if(aux[i]==0){
                descuento = personas[i]*0.4;
                vec[i] = descuento;
            }
            if(aux[i]==1){
                descuento = personas[i]*0.25;
                vec[i] = descuento;
            }
            if(aux[i]==2){
                descuento = personas[i];
                vec[i] = descuento;
            }
        }        
        
        for(int i=0;i<vec.length;i++){
            iter = i+1;
            System.out.println("Persona Nro: ["+iter+"], Precio Normal: "+personas[i]+", Bolita nuevo precio: "+vec[i]);
            System.out.println("Color de bolita: ");
        }
        
    }
    
    
    public static void main(String[] args) {
        ejercicio24 ej = new ejercicio24();
        ej.tienda();
    }
    
}
