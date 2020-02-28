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


interface aa{
    
}

interface bb{
    
}

interface cc{
    
}

class p implements aa,bb,cc{
    
}

interface pnatalla{
    //se asume que todas las variables son constantes y los metodos abstractos
    double PI = 3.1416;
    void ingresar();
    void mostrar();
}

public abstract class ejemplo3 {
    
    final double PI = 3.141516;
    
    abstract void ingresar();
    abstract void mostrar();
}

interface hola<t> extends Iterable<t>{
    
}

