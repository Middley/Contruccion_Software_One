/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        
        int opcion = 0,el;
        
        do{
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar un elemento al inicio de la lista\n"
                +"2.- Mostrar  datos de la lista\n3.- Salir"));
                
                switch(opcion){
                    case 1:
                        
                        
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                
            } catch (Exception e) {
                
            }
            
        }while();
        
    }
    
}
