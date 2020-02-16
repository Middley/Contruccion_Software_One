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
public class Lista {
    
    protected Nodo inicio,fin; // punteros, uno apunta al incio y el otro al fin
    
    public Lista(){
        inicio = null;
        fin = null;        
    }
    
    //metodo para agregar nodo al inicio de la lista
    public void addInicio(int elemento){//recibe un elemento de tipo entero
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null)//preguntamos si hay o no hay nodos
            fin = inicio;// y el fin lo apuntamos al inicio
                                        
    }
    
    
    //metodo para mostrar los datos
    public void imprimirLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.println("{ "+aux.dato+" }---->");
            aux = aux.siguiente;//para que no se quede siempre apuntando al mismo 
        }
    }
    
}
