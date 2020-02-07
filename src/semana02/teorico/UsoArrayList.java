/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class UsoArrayList {
    
    public static void main(String[] args) {
        
        // palabras que terminar en y
        ArrayList<String> misCadenas = new ArrayList<>();
        
        misCadenas.add("Martha");
        misCadenas.add("Pablo");
        misCadenas.add("Middley");
        misCadenas.add("kelly");
        
        int contador = 0;
        
        for (int i = 0; i < misCadenas.size(); i++) {
            String cadenas = misCadenas.get(i);
            System.out.println(cadenas);
            if(cadenas.endsWith("y")){                
                contador++;
            }
        }
        System.out.println(contador);
        
    }
    
}
