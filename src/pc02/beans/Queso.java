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
    
    private static final int stockQueso = 8000;
    
    public Queso(int code, String description) {
        super(code, description,stockQueso, 10.0);
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Queso q = new Queso(123,"perecible");
        q.stock--;
        System.out.println("el codigo del producto: "+q.getCode()+" stock es: "+q.getStock());
        
    }
    
}
