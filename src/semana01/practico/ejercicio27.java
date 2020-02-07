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
public class ejercicio27 {
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
     public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public double pagosExtras(int num,double salarioHora) {
        int horas = num-8;
        if(num<=8){            
            return num*(salarioHora*2);
        }else if(horas>8){            
            double ochoP = 0;
            ochoP = num*(salarioHora*2);
            return (horas*(salarioHora*3))+ochoP;
        }else{
            return 0;
        }                
    }
     
    public void salarioSemanal(){
        
        System.out.println(" ------ SALARIO SEMANAL DE CADA OBRERO ------");
        
        int numObreros = 0;
        double salarioH = 0;
        
        System.out.print("Ingrese el numero de obreros: ");
        numObreros = sc().nextInt();
        System.out.println("ingrese salario por Hora: ");
        salarioH = sc().nextDouble();
        
        int horasT = 0;
        int iter = 0;
        int difHoras = 0;
        double pagoObrero = 0;
        
        int vector[] = new int[numObreros];
        double pagos[] = new double[numObreros];
        
        for(int i=0;i<vector.length;i++){
            horasT = aleatorio(20,70);//limite de 70
            vector[i] = horasT;            
        }
        
        for(int i=0;i<vector.length;i++){
            if(vector[i]>40){
                if(vector[i]>48){
                    difHoras = vector[i]-40;
                    pagoObrero =40*salarioH + pagosExtras(difHoras, salarioH);
                    pagos[i] = pagoObrero;
                }                
                difHoras = vector[i]-40;
                pagoObrero =40*salarioH + pagosExtras(difHoras, salarioH);
                pagos[i] = pagoObrero;                               
            }
            if(vector[i]<=40){                
                pagoObrero =vector[i]*salarioH;
                pagos[i] = pagoObrero;
            }
        }        
        System.out.println("--- Horas de trabajo de los obreros ---");        
        for(int i=0;i<vector.length;i++){
            iter = i+1;
            System.out.println("Horas de Trabajo: "+vector[i]+", Obrero Nro: ["+iter+"]; Pago: "+pagos[i]);
        }               
    }        
    public static void main(String[] args) {
        ejercicio27 ej = new ejercicio27();
        ej.salarioSemanal();
    }
    
}
