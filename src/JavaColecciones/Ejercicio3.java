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
class CuentaW {
    
    private String cadena;
    
    public CuentaW(String cadena){
        this.cadena = cadena;
    }
    
    public void setCadena(String cadena){
        this.cadena = cadena;
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
    
    public int NumLetras(){
        int contLetras = 0;
        String caracter = "";
        for(int i=0;i<cadena.length();i++)            
            if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))
                contLetras++;        
        return contLetras;
    }
                
    public int NumPalabras(){
        int contPalabras = 0;        
        for (int i = 0; i < cadena.length(); i++){
            if(i <= cadena.length()-1){  
                if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))                
                    if(!letrasMayus(cadena.charAt(i-1)) && !letrasMinus(cadena.charAt(i-1)))
                        contPalabras++;
            }            
        }            
        return contPalabras;
    }           
}

public class Ejercicio3{
    public static void main(String[] args) {
        CuentaW c = new CuentaW("        Raquela q");
        System.out.println("Numero de letras que hay : "+c.NumLetras());
        System.out.println("Numero de palabras que hay : "+c.NumPalabras());
    }    
}
