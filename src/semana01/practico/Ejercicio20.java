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
public class Ejercicio20 {
    
    
    
    public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    
    public int mayorNumero(int numeros){
        
        System.out.println("Los numeros: ");
        
        int vector[] = new int[numeros];
        for(int i=0;i<vector.length;i++){
            vector[i] = aleatorio(0, 99);
            System.out.println(vector[i]);
        }
        
        int aux = 0;
        int menor = 0;
        System.out.println("EL numero mayor es: ");
        for(int i=0;i<vector.length;i++){
            for(int j=1;j<i;j++){
                if(vector[i]<=vector[j])
                aux = vector[j];
                vector[j] = vector[i];
                vector[i] = aux;
                
            }
            aux = vector[i];
            
        }
        return aux;
    }
    
    public static void main(String[] args) {
        Ejercicio20 ej = new Ejercicio20();
        System.out.println(ej.mayorNumero(15));
    }
    
    
    
}
