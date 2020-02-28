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

interface Irectangulo{
    int calculararea();
}

class retangulo implements Irectangulo{
    
    int x;
    int y;
    
    public retangulo(int a,int b){
        this.x = a;
        this.y = b;
    }
    
    @Override
    public int calculararea(){
        return x*y;
    }
            
}

class square implements Irectangulo{    
    
    public square(int x){
        
    }
            
            
    
    @Override        
    public int calculararea() {
        
    }
}

public class ejemplo2 {
    
}
