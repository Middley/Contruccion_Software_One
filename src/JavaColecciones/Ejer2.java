/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.TreeSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejer2 {
    public static Integer aleatorio(int max,int min){
        return (int)((max+min-1)*Math.random()+1);
    }
    public static void main(String[] args) {
         TreeSet<Integer>aleatorios=new TreeSet<>();
         for(int i=0;i<100;i++){
            aleatorios.add(aleatorio(1,100));
             
         }
          System.out.println(aleatorios);
     
     }
}
