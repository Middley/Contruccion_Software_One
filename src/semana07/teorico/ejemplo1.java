/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.teorico;

import java.util.HashSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejemplo1 {
    
    public static void main(String[] args) {
        HashSet<Integer> listanum = new HashSet<>();
        
        listanum.add(2);
        listanum.add(2);
        listanum.add(2);
        listanum.add(2);
        System.out.println(listanum.size());
        
        for(Integer i: listanum)
            System.out.println(i);
    }
    
}
