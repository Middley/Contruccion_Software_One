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
public class ejercicio14 {
    
    public void cantidadIndividual(int personas){
        
        int contM=0;
        int contF=0;        
        String vector[] = new String[personas];
        
        for(int i=0;i<personas;i++){
            System.out.println("Sexo de la persona Nro: "+i);
            vector[i] = sexo();
        }        
        for(int i=0;i<personas;i++){
            if(vector[i].equalsIgnoreCase("m")){
                contM++;
            }
            if(vector[i].equalsIgnoreCase("f")){
                contF++;
            }        
        }
        
        System.out.println("Hay "+contF+" Mujeres");
        System.out.println("Hay "+contM+" Hombres");
        
    }    
    
    public String sexo(){
        String sexo;                
        Scanner sc = new Scanner(System.in);        
        sexo =sc.nextLine();                            
        return sexo;
    }
    
    
    public static void main(String[] args) {
        ejercicio14 ej = new ejercicio14();
        ej.cantidadIndividual(3);
    }
    
    
    
}
