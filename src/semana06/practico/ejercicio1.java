/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.practico;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

interface Ipersisten{
    public void save(Object obj);
    
}


class persona{
    String nombre;
    double sueldo;
    
}

class ServicioPadron{
    ArrayList<persona> personas;
    
    Ipersisten persisten;
    
    public void salida(Ipersisten persis){
        this.persisten = persis;        
    }
    public void asigna(){
        personas.add(impresion)
    }
    
    public void mostrarImpreso(){
        for(int i=0;i<personas.size();i++){
            persisten.save(personas.get(i));
        }
    }
}       

class impresion  {
    
    Ipersisten ipersisten;
    void setIpersisten(Ipersisten ipersisten){//pasa tinta,laser o termica
        this.ipersisten = ipersisten;
    }
    public void savePerson(persona p){                
        return ipersisten.save(p);
    }    
            
}

class tinta implements Ipersisten{

    @Override
    public void save(Object obj) {
        if(obj instanceof persona){
            System.out.println("Imprimiendo por tinta");
        }
    }
    
    
}

class ILase implements Ipersisten{
    @Override
    public void save(Object obj) {
        if(obj instanceof persona)
            System.out.println("Imprimiendo por lacer");    
    }    
    
}
class ITermica implements Ipersisten{
    @Override
    public void save(Object obj) {
        if(obj instanceof persona)
            System.out.println("Imprimiendo por Termica");        
    }       
    
}


public class ejercicio1 {
    
    public static void main(String[] args) {
        Ipersisten ip = new ILase();
        Ipersisten ip2 = new ITermica();
        ServicioPadron sp = new ServicioPadron();
        sp.salida(ip);
        sp.salida(ip2);
        sp.mostrarImpreso();
        
        
        
    }
}
