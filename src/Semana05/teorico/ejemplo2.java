/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana05.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejemplo2 {
    public static void main(String[] args) {
        //uno de los principos de livcof
        padre p = new hijas();//podemos acceder al padre a travez de la hijas
        System.out.println(p.saludar());
    }
}

abstract class padre{
    int x;
    int y;
    String saludar(){
        return "buenos dias";
    }    
    
    abstract void cortePelo();
}
class hijas extends padre{
    
    String saludar(){
        return "Good Morning";
    }
    
    @Override
    void cortePelo() {
        
    }
    
}