/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio4 {
    public static void main(String args[]) {
        
        WUR f = new WUR("holaaa   cOmom  q");
        f.sacanPalabras();
        
        for(int i=0;i<f.todos.size();i++){
            System.out.print("Palabra: nro"+i+" : ");
            System.out.println(f.todos.get(i));
        }
        
    }
}


class WUR{
    
    private String frase;
    
    ArrayList<String> todos;
    ArrayList<String> Pduplicadas;
    TreeSet<String> Punicas;
    
    String cad;
    
    public WUR(String frase){
        this.frase = frase;
        this.Pduplicadas = new ArrayList<>();
        this.Punicas = new TreeSet<>();
        this.todos = new ArrayList<>();
        this.cad = "";
    }
    
    
    private boolean letraMayus(char a){
        for(char c = 'a';c<='z';c++)
            if(a==c)
                return true;
        return false;
    }
    
    private boolean letraMinus(char a){
        for(char c = 'A';c<='Z';c++)
            if(a==c)
                return true;
        return false;
    }
    
    private String letra(int pos){        
        return ""+frase.charAt(pos);
    }
    
    //frase " hola "
    public void sacanPalabras(){
        boolean ban = false;
        int tam = frase.length();
        for(int i=0;i<frase.length();i++){
            if(letraMayus(frase.charAt(i))){
                cad+=letra(i);
                ban = false;
            }else if(letraMinus(frase.charAt(i))){
                cad+=letra(i);
                ban = false;
            }else if(letra(i).equals("")){
                ban=true;
            }
            
            if(ban){
                System.out.println("cad: "+cad);
                todos.add(cad);                    
                cad="";
                ban = false;
            }            
            if(i==tam-1){
                todos.add(cad);
                cad="";
                break;
            }
                        
        }                
    }
    
    public void AsignacionPalabras(){
        int tam = todos.size()-1;
        for(int i=0;i<todos.size();i++){
            for(int j=0;j<i;j++){                
                if(todos.get(j).equals(todos.get(i))){
                    Pduplicadas.add(todos.get(j));
                }else if(j==tam-1)
                    Punicas.add(todos.get(j));
            }
        }                
    }
    
    
    
}

