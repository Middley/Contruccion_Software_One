/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_cola;

import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class PilasYColas {
    public static void main(String[] args) {
        
        
        
        Funciones fun = new Funciones();
        
        while(true){
            
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu  de Pilas Colas\n"+"1.- Agregar\n2.- Imprimir Pila\n"
                + "3.- Imprimir Cola\n Otro numero para salir"));
            
            switch(opcion){
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                Nodo  nodoPila = new Nodo();
                nodoPila.nombre = nombre;                
                fun.pila(nodoPila);
        
                Nodo nodC = new Nodo();
                nodC.nombre = nombre;
                fun.cola(nodC);
                break;
                
            case 2:
                System.out.println("Impresion por Pila");
                fun.imprimirPila();
                break;
            
            case 3:
                System.out.println("Imprimir Cola: ");
                fun.imprimirCola();
                break;
            default:
                System.exit(0);
                break;
        }
            
        }
        
        
        
                
        
        
        
        
        
    }
}
