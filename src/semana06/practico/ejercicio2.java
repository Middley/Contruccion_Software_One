/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio2 {
    public static void main(String[] args) {
        
        double x= 12.1;
        double y= 0.0;
        try {
            if(y!=0.0){
                double res = x/y;
                System.out.println("division es: "+res);
            }                        
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero"+e);
        }
        finally{
            
        }
        
        
        
        
    }
}


