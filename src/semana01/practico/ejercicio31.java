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
public class ejercicio31 {
    
    public int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void encuestas(){        
        int personas = 0;        
        
        int ge = 0;
        int op = 0;
        int cantidad = 1;
        
        int primaria = 0;
        int secundaria = 0;
        int tecnico = 0;
        int profesional = 0;
        int posgrado = 0;
        
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
                
        
        int suma = 0;
        int por = 100;
        
        System.out.println("----------- GRADO DE ESTUDIOS --------");
       
        for(int i=0;i<cantidad;){
            System.out.println("1: ingresar persona\n2: Guardar y Salir ");
            op = sc().nextInt();
            ge = aleatorio(0, 4);
            if(op==1){
                if(ge==0){
                    System.out.println("Grado de E: Primaria");
                    primaria++;
                }if(ge==1){
                    System.out.println("Grado de E: Secundaria");
                    secundaria++;
                }if(ge==2){
                    System.out.println("Grado de E: Tecnico");
                    tecnico++;
                }if(ge==3){
                    System.out.println("Grado de E: Profesional");
                    profesional++;
                }if(ge==4){
                    System.out.println("Grado de E: Posgrado");
                    posgrado++;
                }
                personas++;
            }
            else if(op==2){
                System.out.println("Saliendo del Programa");
                break;
            }
        }        
        suma = (primaria+secundaria+tecnico+profesional+posgrado);        
        a =(primaria*por)/suma;
        b =(secundaria*por)/suma;
        c =(tecnico*por)/suma;
        d =(profesional*por)/suma;
        e =(posgrado*por)/suma;
        
        System.out.println(" ------ LOS PORCENTAJES DE ESTUDIO ------");
        System.out.println("Total de Personas Encuentadas: "+personas);
        System.out.println("Primaria: "+a+" %"
        +"\nSecundaria: "+b+" %"+"\nTecnicos: "+c+" %"
        +"\nProfesionales: "+d+" %"+"\nPosgrado: "+e+" %");
                        
    }
    
    public static void main(String[] args) {
        ejercicio31 ej = new ejercicio31();
        ej.encuestas();
    }
    
}
