/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

class empresa{
    int a,b;
    empleado p;
    
    public empresa(empleado c){
        this.p = c;// agregacion, porque se esta pasando como argumento un variable de referencia
    }    
}

class empleado{
    int a,b;
}


public class ejemplo2 {
    public static void main(String[] args) {
        empresa em = new empresa(new empleado());
    }
}
