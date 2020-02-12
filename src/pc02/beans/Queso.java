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
public class Queso extends Product{
    
    public static int STOCKQUESO = 8000;
    static final String tipo = "Queso";
    
    public Queso(int code, String description) {
        super(code, description,STOCKQUESO, 10.0,tipo);        
    }
        
        
    
}
