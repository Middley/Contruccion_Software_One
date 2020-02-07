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
public class ejercicio29 {
    
    public int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public void opciones(){
        System.out.println("Code 1: A Favor");
        System.out.println("Code 2: En Contra");
        System.out.println("Code 3: Se Abstiene");
    }
            
    public void diputados(){
        System.out.println("------ VOTACIONES LIBRE COMERCIO ------");
        int nDiputados=0;
        System.out.println(" -- ingrese el numero de Diputados -- ");        
        nDiputados = sc().nextInt();
        
        int aleatorio = 0;
        
        int favor = 0;
        int contra = 0;
        int abs = 0;
        
        final int n = 100;
        
        int pf = 0;
        int pc = 0;
        int pa = 0;
        
        int suma = 0;
        
        opciones();
        for(int i=0;i<nDiputados;i++){            
            aleatorio = aleatorio(0, 2);
            if(aleatorio==0)
                favor++;        
            if(aleatorio==1)
                contra++;           
            if(aleatorio==2)
                abs++;                                             
        }        
        suma = favor+contra+abs;        
        pf = (favor*n)/suma;
        pc = (contra*n)/suma;
        pa = (abs*n)/suma;        
        System.out.println("--- RESULTADOS DE LAS VOTACIONES ---");
        System.out.println("Al favor: "+pf +" %,"+" con "+favor+" votos");
        System.out.println("en Contra: "+pc +" %,"+" con "+contra+" votos");
        System.out.println("Se Abstiene: "+pa +" %,"+" con "+abs+" votos");
                        
    }
    
    public static void main(String[] args) {
        ejercicio29 ej = new ejercicio29();
        ej.diputados();
    }
    
}
