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
    
    //metodo para insertar al final de la lista, recibe como parametro el elemento
    
    public void addFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        }else
            inicio = fin = new Nodo(elemento);                    
    }
    
    
    //metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if(inicio == null){
            return true; 
        }
        return false;
    }
    
    
    //metodo para agregar nodo al inicio de la lista
    public void addInicio(int elemento){//recibe un elemento de tipo entero
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null)//preguntamos si hay o no hay nodos
            fin = inicio;// y el fin lo apuntamos al inicio                                        
    }
    
    
    public int removeInicio(){
        int elemento = inicio.dato;
        if(inicio == fin)//si solo hay un nodo
            inicio = fin = null;    
        else{
            inicio = inicio.siguiente;
        }
        return elemento;
    }
    
    public int removeFinal(){
        int elemento = fin.dato;
        if(inicio == fin)
            inicio = fin = null;
        else{
            Nodo temp = inicio;
            while(temp.siguiente != fin){//para rrecorrer 
                temp = temp.siguiente;
            }
            fin = temp = fin.siguiente = null;
        }
        return elemento;
    }
    
    
    //metodo para mostrar los datos
    public void imprimirLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("{ "+aux.dato+" }---->");
            aux = aux.siguiente;//para que no se quede siempre apuntando al mismo 
            System.out.println();
        }
    }
    
}
