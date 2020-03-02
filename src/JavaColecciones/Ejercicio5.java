/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        PaLinea pl = new PaLinea("hola mundo");
        pl.infoLetras();
        pl.mostrar();
    }
    
    
}

class PaLinea{
    
    private String frase;
    private ArrayList<String> letras;
    
    
    public PaLinea(String cadena){
        this.frase = cadena;
        letras = new ArrayList<>();
    }
    
    public void setCadena(String cadena){
        this.frase = cadena;
    }
    
    private boolean letrasMinus(char i){
        for(char c = 'a';c<='z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    private boolean letrasMayus(char i){
        for(char c = 'A';c<='Z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    public String letraString(int pos){
        return ""+frase.charAt(pos);
    }
    
    private String dimeLetra(int pos){
        return letras.get(pos);
    }
    
    public void infoLetras(){
        
        for(int i=0;i<frase.length();i++){
            if(letrasMayus(frase.charAt(i))){
                letras.add(letraString(i));                
            }else if(letrasMinus(frase.charAt(i))){
                letras.add(letraString(i));                
            }else{
                letras.add(null);
            }
        }        
    }
    
    public void mostrar(){
        for (int i = 0; i < letras.size(); i++) {
            System.out.println("Letra: "+dimeLetra(i)+" , posicion: "+i);
        }
    }
    
    
    
}
