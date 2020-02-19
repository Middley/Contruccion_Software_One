/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio4 {
    
//    public static void main(String[] args) {
//        int opcion = 0;
//        WUR wr = new WUR("hola amigo como estas estas hola");
//        do{
//            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Opcion \n1.- Mostrar Palabras Unicas\n2.- Mostrar palabras Duplicadas"
//                    + "\n 3.- Salir"));
//            switch(opcion){
//                
//                case 1:
//                    wr.mostrar();
//                    JOptionPane.showMessageDialog(null,"Las palabras Unicas de la oracion\n");
//                    System.out.println(wr.palabrasUnico());
//                    break;
//                case 2:
//                    JOptionPane.showMessageDialog(null,"Las palabras duplicadas de la oracion\n");   
//                    System.out.println(wr.palabrasDuplicadas());
//                    break;
//                case 3: break;
//                
//                default:
//                    JOptionPane.showMessageDialog(null," Opcion incorrecta ");
//            }
//            
//            
//            
//        }while(opcion!=3);
//        
//    }
    
    public static void main(String[] args) {
        WUR wr = new WUR("hola");
        wr.SacarPalabra();
        
            
        }
    }
    
}


class WUR{
    
    private String frase;    
    private final ArrayList<String> palabras;
    
    public WUR(String frase){
        this.frase = frase;
        palabras = new ArrayList<>();
    }
    
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    
    private boolean letrasMinus(char i){
        for(char c = 'a';c<='z';c++){
            if(i==c)
                return true;
        }
        return false;
    }
    
    private boolean letrasMayus(char i){
        for(char c = 'A';c<='Z';c++)
            if(i==c)
                return true;           
        return false;
    }
    
    private String cadena(char i){        
        return ""+frase.charAt(i);
    }       
        
    
    public void SacarPalabra(){       
        String concatena = "";
        String unir = "";
        System.out.println(frase.charAt(0));
        for (int i = 0; i <= frase.length(); i++){
            if(i<=frase.length()-1){
                System.out.println("entra");
                if(letrasMayus(frase.charAt(i))){
                    if(letrasMayus(frase.charAt(i+1))){                       
                        unir=""+cadena((char) i);
                        concatena+=unir;
                    }    
                                          
                        
                }else if(letrasMinus(frase.charAt(i))){
                    
                }    
                                                
            }        
        }
        System.out.println(concatena);
    }
       
    
    public String palabrasUnico(){        
        String devuelve="";
        for(int i=0;i<palabras.size();i++){
            String cad = palabras.get(i);
            for(int j=i;j<i;j++){
                if(cad.equalsIgnoreCase(palabras.get(j))){
                    devuelve+=cad;
                }
            }
        }
        return devuelve;
    }
    
     public String palabrasDuplicadas(){        
        String devuelve="";
        for(int i=0;i<palabras.size();i++){
            String cad = palabras.get(i);
            for(int j=i;j<i;j++){
                if(cad.equalsIgnoreCase(palabras.get(j)))
                    devuelve+=cad + " , ";                
            }
        }
        return devuelve;
    }     
    
}