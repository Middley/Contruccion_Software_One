/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

class Bolsa implements Iterable<Object>{
        
    ArrayList<Object> lista = new ArrayList<>();
    int tope;
    
    public Bolsa(int x){
        super();
        this.tope = x;
    }
    
    public void add(Object obj){
        if(lista.size()<=tope){
            lista.add(obj);
        }else{
            throw new RuntimeException("No cabe mas");
        }
    }
    
    @Override
    public Iterator iterator() {        
        return lista.iterator();
    }        
}



public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Bolsa bolsa = new Bolsa(5);
        
        Chocolatina choco1 = new Chocolatina("Fast");
        Chocolatina choco2 = new Chocolatina("Golden");
        Chocolatina choco3 = new Chocolatina("Barr");
        Golosina g1 = new Golosina("Chikle");
        Golosina g2 = new Golosina("Caramelo");
        
        bolsa.add(choco1);
        bolsa.add(choco2);
        bolsa.add(choco3);
        bolsa.add(g1);
        bolsa.add(g2);
        
        for (Object object : bolsa) {
            if(object instanceof Chocolatina)//para identificar la clase !!!!!
                
                System.out.println("Chocolatina de Nombre: "+ ((Chocolatina) object).getName());
            else
                System.out.println("Golosina: "+((Golosina)object).getMarca());
        }
    }
    
}
