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
        
        Evento evento1 = new Evento("Narnia",12, 2, 4, false,p1.getExpositor());       
        //as.add(new Asistente("123","aasda","luis","Peres","123456","av. raymondi"));        
                                
        evento1.Discounts('v');        
        //evento1.setAsistentes(as);//agrego un asistente al array de asistentes         
        System.out.println(evento1.toString());
            
        
    }
    
    
}
