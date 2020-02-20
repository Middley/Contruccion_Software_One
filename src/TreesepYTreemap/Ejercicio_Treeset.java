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
        
//        TreeSet<String> ordenaPersona = new TreeSet<>();
//        
//        ordenaPersona.add("Luis");
//        ordenaPersona.add("Sandra");
//        ordenaPersona.add("Pedro");
//        
//        //orden por defecto alfabetico
//        for (String s : ordenaPersona) {
//            System.out.println(s);
//        }

          Articulo primero = new Articulo(1, "Primer articulo");
          Articulo segundo = new Articulo(4, "Segundo articulo");
          Articulo tercero = new Articulo(3, "tercer articulo");
          
          TreeSet<Articulo> ordenaArticulos = new TreeSet<>();
          ordenaArticulos.add(tercero);
          ordenaArticulos.add(primero);
          ordenaArticulos.add(segundo);
          
          for(Articulo art: ordenaArticulos)
              System.out.println(art.getDescripcion());
    }        
    
}


class Articulo implements Comparable<Articulo>{
    
    private int num_articulo;
    private String descripcion;
    
    
    public Articulo(int num,String desc){
        this.num_articulo = num;
        this.descripcion = desc;
    }
                
    public String getDescripcion(){
        return descripcion;
    }    
    
    @Override
    public int compareTo(Articulo o) {
        return num_articulo - o.num_articulo;//ordenado por numero de articulo
    }
    
}