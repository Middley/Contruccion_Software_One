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
public class Ejercicio2 {
    
    double interesAcumulado;
    //double interesA[] = new double[];
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void prestamista(){
        
        double vectorI[];
        //int i[];
        
        int cuotas=0;       
        
        double montoP = 0.0;
        double montoD = 0;
        
        int interes = 0;
        double pagado = 0;
               
        System.out.print("Monto a prestar: ");
        montoP = sc().nextDouble();
        
        System.out.print("Ingrese monto a devolver cada Mes: ");    
        montoD = sc().nextDouble();        
        
        System.out.println("Ingrese la tasa de interes del prestamo");
        interes = sc().nextInt();
        
        cuotas =(int)(montoP/montoD);
        System.out.println("cuotas resptantes: "+cuotas);
        
        vectorI = new double[cuotas];
        
        for (int i = 0; i < cuotas; i++) {
            vectorI[i] = interesMomento(montoD, interes);//a
            
            
        }                        
    }
    
    public double interesMomento(double montoD,int interes){        
        double aux = montoD*(interes/100);
        interesAcumulado+=aux;//almacena los interes acumulados hasta ese mes
        
    }
        
    
    public double PagoNeto(double pagoMes,double interesMomento){
        return (pagoMes-interesMomento);
    }
    
     
    
    
    public static void main(String[] args) {
        Ejercicio2 ej = new Ejercicio2();
        ej.prestamista();
    }
    
}
