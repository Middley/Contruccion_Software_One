/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Leche extends Product{
        
    public static int stockMilk = 10200;
    public static final String tipo = "Leche";
    
    public Leche(int code, String description) {
        super(code, description, stockMilk, 8.0,tipo);
    }
      
    
}
