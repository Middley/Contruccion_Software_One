/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Util.MisConstantes;
import java.util.ArrayList;
/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Prueba1 {
    
    
    public ArrayList ListaAsistentes(){        
        ArrayList<Asistente> asistentes = new ArrayList<>();        
        Asistente as1 = new Asistente("c","io@gmail.com", "luis","cantares","213454","Av. Raimondi 234");                        
        asistentes.add(as1);                       
        return asistentes;
    }
    
    public MisConstantes constantes(char c){        
        MisConstantes a = new MisConstantes(c);        
        return a;
    }
    
    public ArrayList ListaExpositores(){
        ArrayList<Expositor> expositores = new ArrayList<>();
        Expositor ex1 = new Expositor("123","no tiene ","Pablo","Ibarra");
//        Expositor ex2 = new Expositor("321","no tiene ","Santiago","Perez");
//        Expositor ex3 = new Expositor("000","no tiene ","Pedro","Peres");
                
        expositores.add(ex1);
//        expositores.add(ex2);
//        expositores.add(ex3);
        
        return expositores;
    }
    
    public Expositor expositor(){
        Expositor exp = new Expositor("123","asdasd","carlos","FLores");
        return exp;
    }
    
    
    public void ejecutable(){
        Evento ev = new Evento(constantes('c'),"Narnia", 1, 2, 3, true,expositor());
        ev.setAsistentes(ListaAsistentes());
//        Evento ev1 = new Evento(constantes('c'),"Narnia", 3, 2, 3, true,);
//        Evento ev2 = new Evento(constantes('c'),"Narnia", 4, 0, 3, true,);
        System.out.println(ev.toString());
        System.out.println(ev.getAsistentes().get(0).lastName);
    }
    
    public static void main(String[] args) {
        Prueba1 p = new Prueba1();
        p.ejecutable();
    }
    
}
