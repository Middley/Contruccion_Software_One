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
public class ejemplo1 {
    
}

interface padre{
    
    int CAD = 14;// se sobreentiende que tiene un final, LAS CONSTANTES SON MAYUSCULAS
    // interface metodos abstractos y vairables constantes    
    void dormir();
    int comer(int a);    
    int comer(int p, double y);
}

class perro extends canino{

    @Override
    void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


abstract class canino{// se crea clases abstractas para comportarse como superClases
    abstract void comer();    
}