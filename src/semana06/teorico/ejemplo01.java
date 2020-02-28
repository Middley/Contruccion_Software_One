/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejemplo01 {
    public static void main(String[] args) {
//        Animal animal = new tortuga();
//        animal.correr();

          Ianimal a = new Animal();
          Ianimal b = new tortuga();
          
    }
}

interface Ianimal{// puede tener el comportamiento de Animal o tortuga
    
}
class Animal implements Ianimal{    
    void correr(){        
    }
}
class tortuga implements Ianimal{

//    @Override
//    void correr() {
//        throw new RuntimeException(" La totuga no corre");
//    }            
}