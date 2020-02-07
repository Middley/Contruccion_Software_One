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
public class ejercicio23 {
    
    public int aleatorio(int min, int max){
        return(int)((max-min+1)*Math.random()+min);
    }
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public int alumnos(int i){
        int al = 0;
        int iter = i+1;
        System.out.println("Alumnos del Grupo: "+iter);
        al = sc().nextInt();
        return al;
    }
    
    public int materias(int j){
        int materias = 0;
        int iter = j+1;
        System.out.println("Materias del Alumno Nro: "+iter);
        materias = sc().nextInt();
        return materias;
    }
    
    
    
    public void promedios(){
        System.out.println("--- PROMEDIOS DE G,A,M ---");
        
        int nGrupos = 0;
        int nAlumnos = 0;
        int nMaterias = 0;
        
        System.out.println("Ingrese el numero de Grupos: ");
        nGrupos = sc().nextInt();        
        
        int vectorG[] = new int[nGrupos];
        int vectorA[]=null ;// new int[nGrupos][nMaterias];
        int vectorM[]= null;
        
        int nota1=0;
        int nota2=0;
        int nota3=0;
        double promedio = 0;
        
        int iter = 0;
        int iter2 = 0;
        
        for(int i=0;i<nGrupos;i++){
            
            vectorG[i] = alumnos(i);
            vectorA = new int[vectorG[i]];// tamaño del vector alumno, dinamico, cambia por cada grupo
            
            for(int j=0;j<vectorA.length;j++){
                
                iter = j+1;
                vectorA[i] = materias(j);
                vectorM = new int[vectorA[j]];
                
                for(int k=0;k<vectorM.length;k++){                    
                    
                    iter2 = k+1;
                    nota1 = aleatorio(0, 20);
                    nota2 = aleatorio(0, 20);
                    nota3 = aleatorio(0, 20);
                    
                    vectorM[k] = (nota1+nota2+nota3)/3;
                    
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Promedio: "+vectorM[k]+" de la Materia Nro: "+iter2+
                            " del Alumno Nro: "+iter);
                }
            }
        }                               
    }
    
    public static void main(String[] args) {
        ejercicio23 ej = new ejercicio23();
        ej.promedios();
    }
    
    
}
