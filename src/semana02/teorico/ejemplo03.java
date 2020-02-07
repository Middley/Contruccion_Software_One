/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejemplo03 {
    
    public static void main(String[] args) {
        ArrayList<String> misCadenas = new ArrayList<>();
        
        misCadenas.add("Martha");
        misCadenas.add("Pablo");
        misCadenas.add("Middley");
        misCadenas.add("kelly");
                
        Iterator it = misCadenas.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
