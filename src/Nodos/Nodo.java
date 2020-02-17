/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Nodo {
    
    public int dato;
    public Nodo siguiente;
    
    public Nodo(int dato){// al final de la lista simplemente enlazada
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Nodo(int dato,Nodo n){// constructor para insertar al inicio
        this.dato = dato;
        this.siguiente = n;
    }
    
    
}
