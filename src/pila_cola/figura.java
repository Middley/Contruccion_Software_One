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
public class figura {
        
    
}

class nodo{
    
    public int lados;
    public nodo sig;
    public nodo anterior;
    
}

class fuctions{
    
    private static nodo pila;
        
    
    public void ingresar(nodo elemento){
        
        if(pila == null){
            pila = new nodo();
            pila = elemento;
        }else{
            nodo nodoAux = pila;
            pila = elemento;
            pila.sig = nodoAux;
        }
        
    }
    
    public void imprimirPila(){
        
        nodo aux = pila;
        while(aux != null){
            System.out.println(aux.lados);
            aux = aux.sig;
        }                
    }
    
    public int sacar(nodo elemento){
        
        if()
    }
    
    
}