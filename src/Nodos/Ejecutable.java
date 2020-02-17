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
 * 
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion = 0,el;
        
        do{                        
            try {                    
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar un elemento al inicio de la lista\n"
                +"2.- Agregar un elemento al Final de la lista\n"+"3.- Mostrar  datos de la lista\n4.- Salir"));
                
                switch(opcion){
                    case 1:
                        
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ","Insertando al inicio",3));
                            lista.addInicio(el);//agregando al nodo
                            
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null,"Error : "+n.getMessage());
                    }                        
                        break;
                    case 2:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ","Insertando al Final",3));
                            lista.addFinal(el);//agregando al nodo
                            
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null,"Error : "+n.getMessage());
                    }   
                        break;                        
                    case 3:
                        lista.imprimirLista();                                                
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"fnalizando programa");
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
            }
            
        }while(opcion!=4);
        
    }
    
}
