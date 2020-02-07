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
public class ejemplo02 {
    public static void main(String[] args) {
        
        // palabras que terminar en y
        ArrayList<String> misCadenas = new ArrayList<String>();
        
        misCadenas.add("Martha");
        misCadenas.add("Pablo");
        misCadenas.add("Middley");
        misCadenas.add("kelly");
                        
        for (Object misCadena : misCadenas) {
            System.out.println(misCadena);
        }
        
    }
}
