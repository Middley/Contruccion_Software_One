/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaColecciones;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        int opcion = 0;
        palabra p = new palabra();
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"-- Menu Opciones\n1.- Agregar Palabra\n2.- palabras mismo tamaño"
                        + "\n3.-salir"));
                
            } catch (Exception e) {
            }
            switch(opcion){
                
                case 1: 
                    String nombre = JOptionPane.showInputDialog(null,"agrega palabra");
                    p.add(nombre);
                    break;
                case 2:
                    int longitud = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese longitud"));
                    p.igualLongitud(longitud);
                    JOptionPane.showMessageDialog(null,p.ListaOrdenada());
                    
                    break;
                case 3: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"opcion incorrecta");
            }
            
        }while(opcion!=3);
        
    }
}


class palabra{
        
    private ArrayList<String> listaPal;
    private ArrayList<String> conjunto;
    public palabra(){        
         listaPal = new ArrayList<>();
         conjunto = new ArrayList<>();
    }
    
    public void add(String cad){
        listaPal.add(cad);
    }
            
    public void igualLongitud(int longitud){
        for(int i=0;i<listaPal.size();i++){
            if(longitud==listaPal.get(i).length()){
                conjunto.add(listaPal.get(i));
            }
        }
    }
    
    public String ListaOrdenada(){
        String cad = "";
        Collections.sort(conjunto);
        for(String s: conjunto)
            cad+=s+"\n";
        conjunto.clear();
        return cad;
    }
    
    
}