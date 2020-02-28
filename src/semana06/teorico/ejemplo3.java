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

interface Ipadre{
    abstract void c();
}

abstract class padre implements Ipadre{
    abstract void a();
    abstract void b();
    
}

//hija solo necesita el metodo c
class hija implements Ipadre{

    @Override
    public void c() {
        
    }
    
}

public class ejemplo3 {
    
}
