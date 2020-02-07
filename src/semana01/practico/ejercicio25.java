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
public class ejercicio25 {
    
    public int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
       
    public void gamaProductos(){
        System.out.println("----- GAMA DE PRODUCTOS -----");
        System.out.println("Arroz, Costo Kilo: s/.  1");
        System.out.println("Azucar, Costo Kilo: s/.  0.5");
        System.out.println("leche, Costo por unidad: s/. 1.5 ");
        System.out.println("Maiz, Costo Kilo: s/.  1.2");
        System.out.println("Aceite, Costo litro: s/.  4.5");
        System.out.println("Cebolla, Costo Kilo: s/.  2");
        System.out.println("Pollos, Costo Kilo: s/.   9.5");
    }
    
    public void carrito(){
        System.out.println("------- AMA DE CASA --------");        
        String productos[] = {"Arroz","Azucar","leche","Maiz",
            "Aceite","Cebolla","Pollos"};
        
        String producto = "";
        
        double acumulado = 0.0;
        int kilos=0;        
        double totalP = 0.0;
        
        String vaComprando = "";
        String terminar = "";
        do{
            gamaProductos();
            
            System.out.println("\nAgrega un producto al carrito: ");
            producto = sc().nextLine();
            
            if(producto.equalsIgnoreCase(productos[0])){
                System.out.println("Cuantos Kilos: ");//Arroz
                kilos = sc().nextInt();                
                totalP = (1*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" kilos de: "+productos[0]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[1])){
                System.out.println("Cuantos Kilos: ");//Azucar
                kilos = sc().nextInt();
                totalP = 0.5*kilos;
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" kilos de: "+productos[1]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[2])){
                System.out.println("Cuantas Unidades: ");//leche
                kilos = sc().nextInt();                
                totalP = (1.5*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" Unidades de: "+productos[2]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[3])){
                System.out.println("Cuantos Kilos: ");//maiz
                kilos = sc().nextInt();                
                totalP = (1.2*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" Kilos de: "+productos[3]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[4])){
                System.out.println("Cuantos Litros: ");//aceite
                kilos = sc().nextInt();                
                totalP = (4.5*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" Litros de: "+productos[4]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[5])){
                System.out.println("Cuantos Kilos: ");//Cebollas
                kilos = sc().nextInt();                
                totalP = (2*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" Kilos de: "+productos[5]+", Coste: "+totalP;
            }
            if(producto.equalsIgnoreCase(productos[6])){
                System.out.println("Cuantos kilos: ");
                kilos = sc().nextInt();                
                totalP = (9.5*kilos);
                acumulado+=totalP;
                vaComprando+="\n"+kilos+" Kilos de: "+productos[6]+", Coste: "+totalP;
            }
            System.out.println("-ENTER: continuar compras\n-ESPACIO: terminar compras");
            terminar = sc().nextLine();
            
        }while(!terminar.equals(" "));
        
        System.out.println("---- IMPORTE DE COMPRAS ----");
        System.out.println(vaComprando);
        System.out.println("Coste de Compras: "+acumulado);
        
    }
    
    
    public static void main(String[] args) {
         ejercicio25 ej = new ejercicio25();
         ej.carrito();
    }
}
