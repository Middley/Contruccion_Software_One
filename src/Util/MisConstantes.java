/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class MisConstantes {
    
    private char code;
    
    public final double Platinum=250.50;
    public final double Gold = 150.50;
    public final double VIP = 95.0;
    
    public MisConstantes(char c){
        this.code = c;
    }
        
    public double getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }
    
    
    
    
}
