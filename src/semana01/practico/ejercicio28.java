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
public class ejercicio28 {
    
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    //promedio de calidad de las n gallinas, n==100%
    public double calidad(){
        double pesoG;
        double alturaG;
        int nHuevos;
        System.out.println("Peso Gallina: "); pesoG = sc().nextDouble();
        System.out.println("Altura Gallina: ");alturaG = sc().nextDouble();
        System.out.println("Nro huevos Pones: "); nHuevos = sc().nextInt();
        
        return (pesoG*alturaG)/(double)nHuevos;
    }
    
    public void costoKilo(){
        
        int gallinas=0;
        System.out.println("-------- VENTAS DE HUEVOS POR CALIDAD --------");
        System.out.print("\nIngrese la cantidad de Gallinas: ");
        gallinas = sc().nextInt();
        
        double calidad=0;
//        double pesoGallina=0;
//        double alturaGallina=0;
//        int nHuevos=0;
        double promedioGeneral = 0;
        
        double pesoKilo1 = 0;
        double pesoKilo2 = 0;
        double pesoKilo3 = 0;        
                
        double PrecioKilo = 0;
        
        //promedio de calidad de una sola gallina
        calidad = calidad();
        System.out.println("calidad "+calidad);
        
        //promedio general de calidad
        pesoKilo1 = 1.2*calidad;
        pesoKilo2 = 1.00*calidad;
        pesoKilo3 = 0.80*calidad;        
        
        if(calidad>=15){
            PrecioKilo = pesoKilo1;
        }if(calidad>8 || calidad<15){
            PrecioKilo = pesoKilo2;
        }if(calidad<8){
            PrecioKilo = pesoKilo3;
        }
        double promedio = gallinas*calidad;
        System.out.println("Promedio de las "+gallinas+" es: "+promedio);
        System.out.println("EL precio por Kilo es: "+PrecioKilo);
        
        
    }
    
    public static void main(String[] args) {
        ejercicio28 ej = new ejercicio28();
        ej.costoKilo();
    }
    
}

