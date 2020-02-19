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
public class Ejercicio_Treeset {
    
    public static void main(String[] args) {
        
        TreeSet<String> ordenaPersona = new TreeSet<>();
        
        ordenaPersona.add("Luis");
        ordenaPersona.add("Sandra");
        ordenaPersona.add("Pedro");
        
        //orden por defecto alfabetico
        for (String s : ordenaPersona) {
            System.out.println(s);
        }
        
    }
    
    
    
}
