/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
//8) Al cerrar un expendio de naranjas, 15 clientes que aun no han pagado recibirán un 15% 
// de descuento si compran mas de 10 kilos. Determinar cuanto pagara cada cliente y cuanto 
// percibirá la tienda por esas compras. 

public class ejercicio6 {
    
    public void ventaGas(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los galones que llevara! ");
        double nGal = sc.nextDouble();
        
        double pay=0;
        double galon = 3.785;
        double llevar = galon*nGal;
        do{
            if(tipo().equalsIgnoreCase("a")){
                double litro = 50;
                pay = litro*llevar;
                System.out.println("Vendido, monto a pagar: "+pay);
            }
            if(tipo().equalsIgnoreCase("b")){
                double litro = 55;
                pay = litro*llevar;
                System.out.println("Vendido, monto a pagar: "+pay);
            }
            if(tipo().equalsIgnoreCase("c")){
                double litro = 60;
                pay = litro*llevar;
                System.out.println("Vendido, monto a pagar: "+pay);
            }
        }while(!tipo().equalsIgnoreCase("d"));
        System.out.println("Saliendo de la venta");
        
                
         
    }
    
    public String tipo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Tipo A,B,C o D para salir");
        String tipo = sc.nextLine();
        return tipo;
    }
    
    public static void main(String[] args) {
        
        ejercicio6 ej = new ejercicio6();
        ej.ventaGas();
        
    }
    
    
}
