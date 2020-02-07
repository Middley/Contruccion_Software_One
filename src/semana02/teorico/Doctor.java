/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Doctor {
    
    private int id;
    private String name;
    
    public Doctor(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return " Id: "+this.id+", Name: "+this.name;
    }
    
}
