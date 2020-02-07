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
public class ejercicio32 {
    
    public int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public void jefeCasilla(){
        
        String vector[] = {"norte","sur","centro"};        
        
        int norte = 0;
        int sur = 0;
        int centro = 0;        
        int pobTotal = 0;
        
        String seccion="";
        
        int mayor = 0;
        System.out.println("------ Ingrese el total de Personas -------");
        Scanner sc = new Scanner(System.in);
        pobTotal = sc.nextInt();                
        
        for(int i=0;i<pobTotal;i++){
            int pos = aleatorio(0, 2);
            if(pos==0){
                norte++;
            }
            if(pos==1){
                sur++;
            }
            if(pos==2){
                centro++;
            }            
        }
        
        int votos[] = {norte,sur,centro};        
        int pos=0;
        if(norte>sur){
            if(norte>centro){
                pos = 0;
                mayor = norte;                
            }else if(centro>sur){
                pos = 2;
                mayor = centro;                
            }else{
                pos = 1;
                mayor = sur;                
            }
        }else if(sur>centro){
            pos = 1;
            mayor = sur;            
        }                        
        if(pos==0)
            seccion="Norte";
        if(pos==1)
            seccion="Sur";
        if(pos==2)
            seccion="Centro";
        
        System.out.println("------ ASISTENCIA A LAS VOTACIONES -------");
        System.out.println("Norte: "+votos[0]+"\nSur: "+votos[1]+
                "\nCentro: "+votos[2]);
        System.out.println("Seccion de mayor votos: "+seccion+" con "+mayor);
    }
    
    public static void main(String[] args) {
        ejercicio32 ej = new ejercicio32();
        ej.jefeCasilla();
    }
    
    
}
