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


interface daddy{    
    void c();
    void d();
    int e();
    float f();
    
}

interface Ison{
    void a();
    void b();
            
}

class pantalla implements daddy,Ison{
    
    @Override
    public void a() {
       
    }
    
    @Override
    public void b() {
    }
    @Override
    public void c() {        
    }
    @Override
    public void d() {        
    }
    @Override
    public int e() {        
        return 0;
    }
    @Override
    public float f() {        
        return 0.0f;
    }
    
}




public class ejemplo4 {
    
}
