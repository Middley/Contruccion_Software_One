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
public class ejercicio42 {
    
    public int aleatorio(int min,int max){
        return (int)((max - min +1)*Math.random()+min);
    }
    
    public void separarVotos(){
        
        int candUno = 0;
        int candDOs = 0;
        int candTres = 0;
        
        int voto = 0;//punto al candidato
        
        for(int i=1;i<=250000;i++){
            voto = aleatorio(1, 3);            
            if(voto==1)
                candUno++;            
            if(voto==2)
                candDOs++;            
            if(voto==3)
                candTres++;
        }
        System.out.println("Votos Candidato 1: "+candUno+
                "\nVotos Candidato 2: "+candDOs+"\n"
                        + "Votos Candidato 3: "+candTres);
        
        int mayor = 0;
        int guarda = 0;
        if(candUno>candDOs){
            if(candUno>candTres){
                mayor = 1;
                guarda = candUno;
            }else if(candTres>candDOs){
                mayor = 3;
                guarda = candTres;
            }else{
                mayor = 2;
                guarda = candDOs;
            }
        }else if(candDOs>candTres){
            mayor=2;
            guarda = candDOs;
        }
        
        System.out.println("EL candidato Ganador es el Nro " + mayor);
        System.out.println("Con cantidad de Votos de: " + guarda);
        
    }
    
    public static void main(String[] args) {
        ejercicio42 ej = new ejercicio42();
        ej.separarVotos();
    }
    
}
