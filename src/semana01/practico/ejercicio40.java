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
public class ejercicio40 {
    
    public int aleatorio(int min,int max){
        return (int)((max - min + 1)*Math.random()+min);
    }
    
    public void Alumno(){
        
        double matriz[][] = new double[40][5];
        double vector[] = new double[40];                
        double vecaux[]= new double[40];
        double acum = 0;
        int iter = 0;        
        
        System.out.println("NOTAS DE CADA ALUMNO");
        for(int i=0;i<vector.length;i++){
            iter = i+1;
            System.out.print("Alumno Nro:"+"["+iter+"], Notas: ");
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = aleatorio(0, 20);                
                System.out.print(" "+(int)matriz[i][j]);
                acum+=matriz[i][j];
            }            
            vector[i]=(double)acum/5;
            vecaux[i] = vector[i];//guarda el vector para poder buscar
            System.out.print(" ,          Promedio: "+vector[i]+"\n");
            acum=0;
        }
        
        double aux = 0;
        
        for(int i=0;i<vector.length;i++){                       
            for(int j=1;j<i;j++){           
                if(vector[i]<=vector[j]){                    
                    aux =vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;                    
                }                               
            }            
        }
        
        for(int i=0;i<vecaux.length;i++){
            if(aux == vecaux[i]){
                iter=i+1;
            }
        }

        System.out.println("Nota Mayor: "+aux+" Alumno ["+iter+"]");
    }
    
    public static void main(String[] args) {
        ejercicio40 ej = new ejercicio40();
        ej.Alumno();
    }
    
}
