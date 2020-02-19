/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesepYTreemap;

import java.util.*;


/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class TreeMap {
    
    public static void main(String[] args) {
        
        TreeMap treeMap = new TreeMap();
                
        persona juan = new persona(8, "Juan");
        persona victor = new persona(9, "Victor");
        persona marisa = new persona(10, "Marisa");
        
        treeMap.put(1,juan);
        treeMap.put(2,victor);
        treeMap.put(3,marisa);
        
        
        Collection c = treeMap.values();
        Iterator itr = c.iterator();
        
        Collection d = treeMap.entrySet();
        Iterator itra = d.iterator();
        
        System.out.println("----------------------------");
        persona objPerson = new persona(0,"Temporal");
        System.out.println("Codigo nombre");
        
        while(itr.hasNext()){
            objPerson = (persona)itr.next();
            System.out.println(""+objPerson.getId()+"              "+objPerson.getNombre());
        }
        
    }

    private void put(int i, persona victor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Collection values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Collection entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}



class persona {
    
    int id;
    String nombre;

    public persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
           
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}