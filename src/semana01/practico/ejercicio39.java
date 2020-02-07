/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio39 {
    
    public int aleatorio(int min, int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public void calificaciones(){
        
        int vector[] = new int[50];
        int contador = 0;
        int porcentajeD=0;
        int iter = 0;
        
        
        System.out.println(" CALIFICACIONES DE LOS ALUMNOS \n");
        for(int i=0;i<vector.length;i++){
            iter = i+1;
            vector[i] = aleatorio(0,100);
            System.out.println("Alumno Nro: ["+iter+"], "
                    + "Calificacion: "+vector[i]);
            System.out.print("");
        }
        
        for(int i=0;i<vector.length;i++){
            if(vector[i]<70){
                contador++;
            }
        }
        
        porcentajeD = (contador*10)/5;
        
        System.out.println("El porcentaje de desaprobados es: "+porcentajeD+" %");
        
    }
    
    
    public static void main(String[] args) {
        ejercicio39 ej = new ejercicio39();
        ej.calificaciones();
    }
    
}
