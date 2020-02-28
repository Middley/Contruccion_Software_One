/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio5 {
    
    
    
}

class PaLinea{
    
    private String frase;
    
    public PaLinea(String cadena){
        this.frase = cadena;
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
    
    public String letra(int pos){
        return ""+frase.charAt(pos);
    }
    
    public int NumLetras(){
        int contLetras = 0;
        String caracter = "";
        for(int i=0;i<frase.length();i++)            
            if(letrasMayus(frase.charAt(i)) || letrasMinus(frase.charAt(i)))
                    contLetras++;
        return contLetras;
    }
    
    
}
