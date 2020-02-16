/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_cola;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Funciones {
    
    private static Nodo cola;
    private static Nodo pila;
    
    public void pila(Nodo elemento){
        
        if(pila == null){
            pila = new Nodo();
            pila = elemento;
        }else{
            Nodo nodoAux = pila;
            pila = elemento;
            pila.sig = nodoAux;
        }
        
    }
    
    public void imprimirPila(){
        
        Nodo aux = pila;
        while(aux != null){
            System.out.println(aux.nombre);
            aux = aux.sig;
        }                
    }
    
    public void imprimirCola(){
        Nodo aux = cola;
        while(aux != null){
            System.out.println(aux.nombre);
            aux = aux.sig;
        }
    }
    
    
    public void cola(Nodo elemento){
        
        if(cola == null){
            cola = new Nodo();
            cola = elemento;            
        }else{
            Nodo aux = cola;
            while(aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = elemento;
        }        
    }
    
    
    
}

