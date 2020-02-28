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
// principio solid 5
interface data{
    
}

class mysql implements data{
    String cadena;
}

class connect extends mysql{
    
}

class recusql extends mysql{
    
}

class oracle implements data{
    
}

class recusOracle implements data{
    
}

class save{
    public save(){
        connect c = new connect();// debe haver un tipo de dependencia
        recusql re = new recusql();
    }
}


public class ejemplo5 {
    
}
