/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class figura {
                    
    public int lados;
    
    public static void main(String[] args) {
        
    }
}

class nodo{
    
    public figura lados;
    public nodo sig;
    //public nodo anterior;
    
    public nodo(figura lados){
        this.lados = lados;
        this.sig = null;
    }
    
    public nodo(figura lados,nodo n){
        this.lados = lados;
        this.sig = n;
    }
    
    public nodo(){
        this.sig = null;
    }
    
}

class fuctions{
    
    public static nodo inicio;
    public static nodo fin;
    
    public fuctions(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void addPila(figura elemento){
        if(!estaVacia()){
            fin.sig = new nodo(elemento);
            fin = fin.sig;
        }else
            inicio = fin = new nodo(elemento);
    }           
    
    public void removePila(){
        figura elemento = fin.lados;
        if(inicio == null)
            inicio = fin = null;
        else{
            nodo temp = inicio;
            while(temp.sig != fin){
                temp = temp.sig;
            }
            fin = temp = fin.sig = null;
        }
    }
    
        
    public void imprimirPila(){
        
        nodo aux = inicio;
        while(aux != null){
            System.out.println(aux.lados.toString());
            aux = aux.sig;
        }
        
    }
    
    
}