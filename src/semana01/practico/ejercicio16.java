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
class ejercicio16{
       
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public void calificacion(){
        
        int alumnos[];
        
        int quantity =0;
        System.out.println("Ingrese el numero de alumnos");
        quantity = sc().nextInt();
        alumnos = new int[quantity];
        
        
        double suma=0;        
        int iter = 1;
        
        for(int i=0;i<alumnos.length;i++){            
            System.out.print("Nota del alumno Nro "+iter+": ");
            alumnos[i] = aleatorio(0, 20);
            System.out.println(alumnos[i]);
            iter++;
        }
        
        for(int i=0;i<alumnos.length;i++){
            suma+=alumnos[i];
        }
        
        double promedio = suma/quantity;
        System.out.println("El promedio es: "+promedio);
    }
        
     
    public static void main(String[] args) {
        ejercicio16 ej = new ejercicio16();
        ej.calificacion();
    }
    
    
}

