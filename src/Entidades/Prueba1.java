/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Util.MisConstantes;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Prueba1 {
    
    
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
//    public MisConstantes getConsantes(){
//        MisConstantes cons = new MisConstantes();
//        return cons;
//    }
//    
    public Expositor getExpositor(){
        System.out.println(" ---- AGREGANDO UN EXPOSITOR -----");
        System.out.println("Ingrese codigo: ");
        String code = sc().nextLine();
        System.out.println("Ingrese Correo: ");
        String correo = sc().nextLine();
        System.out.println("Ingrese Nombre: ");
        String name = sc().nextLine();
        System.out.println("Ingrese Apellido: ");
        String lastName = sc().nextLine();
        Expositor ex = new Expositor(code, correo, name, lastName);
        return ex;
    }
    
    public Asistente getAsistentes(){
        System.out.println(" ---- AGREGANDO UN ASISTENTE -----");
        System.out.println("Ingrese codigo: ");
        String code = sc().nextLine();
        System.out.println("Ingrese Correo: ");
        String email = sc().nextLine();
        System.out.println("Ingrese Nombre: ");
        String name = sc().nextLine();
        System.out.println("Ingrese Apellido: ");
        String lastName = sc().nextLine();
        System.out.println("Ingrese telefono: ");
        String phoneNumber = sc().nextLine();
        System.out.println("Ingrese Direccion: ");
        String Address = sc().nextLine();        
        Asistente as = new Asistente(code, email, name, lastName, phoneNumber, Address);
        return as;
    }
      
            
        
    public static void main(String[] args) {
        Prueba1 p1 = new Prueba1();
        
        ArrayList<Asistente> as = new ArrayList<>();
        ArrayList<Evento> event = new ArrayList<>();
        
        Evento evento1 = new Evento("Narnia",12, 2, 4, true,p1.getExpositor());        
        
        as.add(p1.getAsistentes());
        as.add(p1.getAsistentes());
        as.add(p1.getAsistentes());
        as.add(p1.getAsistentes());
        as.add(p1.getAsistentes());
        
        evento1.setAsistentes(as);
        event.add(evento1);
        
        
        
        
        System.out.println(evento1.toString());
        
    }
    
    
}
