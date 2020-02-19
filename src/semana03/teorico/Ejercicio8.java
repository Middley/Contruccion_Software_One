/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

class bag<T> implements Iterable<T>{
    
    ArrayList<T> lista = new ArrayList<>();
    int tope;
    
    public bag(int x){
        super();
        this.tope = x;
    }
    
    public void add(T clase){
        if(lista.size()<=tope){
            lista.add(clase);
        }else{
            throw new RuntimeException("No cabe mas");
        }
    }
            
    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
    
}



public class Ejercicio8 {
        
    public static void main(String[] args) {
        
        bag<Golosina> bolsita1 = new bag(5);
        bag<Chocolatina> bolsita2 = new bag(5);
        
        Chocolatina choco1 = new Chocolatina("Fast");
        Chocolatina choco2 = new Chocolatina("Golden");
        Chocolatina choco3 = new Chocolatina("Barr");
        Golosina g1 = new Golosina("Chikle");
        Golosina g2 = new Golosina("Caramelo");
        
        bolsita1.add(g1);
        bolsita1.add(g2);
        bolsita2.add(choco1);
        bolsita2.add(choco2);
        bolsita2.add(choco3);
        
        for (Chocolatina chocolatina : bolsita2) {
            System.out.println("Chocolatina: "+ ((Chocolatina) chocolatina).getName());
        }
        for (Golosina golosina : bolsita1) {
            System.out.println("Golosina: "+ ((Golosina) golosina).getMarca());
        }
        
        
    }
}
