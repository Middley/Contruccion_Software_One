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
public class Mantequilla extends Product{
    
    public static int STOCKMANTE = 12000;
    public static final String tipo = "Mantequilla";
    
    public Mantequilla(int code, String description) {
        super(code, description, STOCKMANTE, 3.0,tipo);
    }
    
     
    
}
