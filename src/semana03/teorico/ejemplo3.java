/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.teorico;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */


class business{    
    ArrayList<empleado> lista = new ArrayList<>();//composicion    
    
}

class employee{
    int a,b;        
}


public class ejemplo3 {
    
    public static void main(String[] args) {
        business b = new business();// composicion por que no creamos el empleado, solo la empresa
    }
    
}
