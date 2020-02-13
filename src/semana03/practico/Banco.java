/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Banco {
    
    private final Cliente clientes[];
    
    public Banco(){
         clientes = new Cliente[3];                
        System.out.print("Nombre del Cliente 1 :");
        clientes[0] = new Cliente(sc().nextLine());
        System.out.print("Nombre del Cliente 2 :");
        clientes[1] = new Cliente(sc().nextLine());
        System.out.print("Nombre del Cliente 3 :");
        clientes[2] = new Cliente(sc().nextLine());
    }
    
    public void Operar(){
        System.out.print("Deposito cliente 1: ");      
        clientes[0].depositar(sc().nextDouble());//similar al anonimo??
        System.out.print("Deposito cliente 2: ");      
        clientes[1].depositar(sc().nextDouble());//similar al anonimo??
        System.out.print("Deposito cliente 3: ");      
        clientes[2].depositar(sc().nextDouble());//similar al anonimo??        
    }
    
    public void depositosGenerales(){
        double alm=0;
        for (Cliente cliente : clientes)
            alm += cliente.retornarMonto();
                
        System.out.println("Dinero Total en el banco:" + alm);
        System.out.println(clientes[0].print());        
        System.out.println(clientes[1].print());
        System.out.println(clientes[2].print());       
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    
    public static void main(String[] args) {
        Banco bcp = new Banco();
        bcp.Operar();
        bcp.depositosGenerales();
        
    }
    
}
