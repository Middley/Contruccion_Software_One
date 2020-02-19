/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        ale<Integer> miLista = new ale(25);
        for(int i=0;i<miLista.topeArr;i++){
            miLista.add(ale.aleatorio(0, 100));
        }
        
        Iterator it = miLista.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString()+ " , ");
        }
        miLista.NoseRepiten();        
        
        TreeSet<ale> al = new TreeSet<>();
        al.add(miLista);
        
        al.forEach((object) -> {
            System.out.println(object);
        });
        
    }
    
}

class ale<tipo> implements Iterable<tipo>{
    
    ArrayList<tipo> lista = new ArrayList<>();
    int topeArr = 0;
    
    public ale(int tope){
        super();
        this.topeArr = tope;
    }
    
    public void add(tipo number){
        if(lista.size()<=topeArr)
            lista.add(number);
        else
            throw new RuntimeException("Lista no da mas");
    }
    
    
    public static int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
        
    
    public ArrayList NoseRepiten(){
        System.out.println("\n---- NUMEROS QUE NO SE REPITEN -----");
        ArrayList<tipo> aux = new ArrayList<>();
        int cont;
        for(int i=1;i<lista.size()-1;i++){ 
            cont = 0;
           for(int j=0;j<lista.size();j++){               
               //System.out.println("j vale: "+j);
               //System.out.println("compara: "+lista.get(i)+ " con " +lista.get(j));
               if(lista.get(i)==lista.get(j)){                   
                   cont++;
                   //System.out.println("cont vale: "+cont);
                   if(cont==2)
                       break;                                      
               }else if(j==lista.size()-1 && cont!=2)
                   aux.add(lista.get(i));               
           }
            //System.out.println("");            
        }                
        for (int k = 0; k < aux.size(); k++) {
            System.out.println(aux.get(k));
        }
        return aux;
    }
      
    
    @Override
    public Iterator<tipo> iterator() {
        return lista.iterator();
    }

    
    
    
}