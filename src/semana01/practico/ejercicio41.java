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
public class ejercicio41 {
    
    public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public void excluidos(){
        
        double matriz[] = new double[5];
        double vector[] = new double[40];
        
        //si nota es menor a 8, no examen de nivelacion        
        double acum = 0;
        int iter = 0;
        int cantidad = 0;
        
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[j] = aleatorio(0, 20);
                acum+=matriz[j];
            }
            vector[i]=(double)acum/5;
            acum=0;
        }
        
        System.out.println("NOTAS");
        for (int i = 0; i < vector.length; i++) {
            iter = i+1;
            System.out.println("["+iter+"]"+" Notas: "+vector[i]);
        }
                        
        System.out.println("\n");
        for (int i = 0; i < vector.length; i++) {
            iter = i+1;
            if(vector[i]<=7){
                System.out.println("El alumno Nro: "+iter+
                        " NO Dara examen");
                cantidad++;                
            }            
        }
        System.out.println("\nNo daran examen de Nivelacion "+
                cantidad+" alumnos");
        
    }
    
    
    public static void main(String[] args) {
        ejercicio41 ej = new ejercicio41();
        ej.excluidos();
    }
    
    
}
