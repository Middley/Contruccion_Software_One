/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;



import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio2 {
    
    public static int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    
    public static void main(String[] args) {
        
        llenando l = new llenando(15);
        l.mostrarNumeros();
        l.sinRepetir();
        l.mostrar();
        
    }
    
                         
}

class llenando{
    
    private Integer numeros[];
    private int tope;
    private TreeSet<Integer> lista;
    
    
    public llenando(int tope){
        this.tope = tope;
        this.numeros = new Integer[tope];
        lista = new TreeSet<>();
    }            
    private void add(int pos){
        if(numeros.length<=tope){
            numeros[pos] = aleatorio(0, 100);
        }else
            throw new RuntimeException("limite superado");
    }
    
    private int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }              
    
    private void llenado(){        
        for(int i=0;i<numeros.length;i++)
            add(i);
    }
    
    
    public void mostrarNumeros(){
        llenado();
        System.out.println(" --- Todos los numeros ---");
        for(Integer integer: numeros)
            System.out.println(integer);
    }
    
    private void pasoArray(){        
        lista.addAll(Arrays.asList(numeros));        
    }
    
    public void sinRepetir(){
        pasoArray();
        System.out.println("--- Numeros sin Repetir ---");
        lista.forEach((i) -> {
            System.out.println(i);
        });
    }
    
    public void mostrar(){
        System.out.println("------- numeros sin repetir de la lista -------");
        lista.forEach((integer) -> {
            System.out.println(integer);
        });
    }
        
}