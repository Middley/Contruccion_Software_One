/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;


/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicioTres {
        
        
    public void factorial(int n){
        int temp=1;
        double suma=0;        
        double div = 0;
        for(int i=1;i<=n;i++){                            
            temp*=i;            
            div=1/(double)temp;
            suma+=div;                       
        }                        
        System.out.println("Rpta: "+temp);                
        System.out.println("La suma es: " + suma);
    }
                  
    public static void main(String[] args) {
        ejercicioTres ej = new ejercicioTres();
        ej.factorial(3);
    }
    
}
