/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.*;
import javax.swing.*;

public class CampoTexto extends JFrame{
    
    static int x = 480;
    static int y = 100;
    
    public CampoTexto(){
        super(" Campo Texto ");
        //setSize(x,y);
        setBounds(400, 300, x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel etiquetaPagina = new JLabel("Direccion pagina web: ",JLabel.RIGHT);//descricion y ubicacion del JLabel
        JTextField direccionPagina = new JTextField("Escribe aqui: ",30);//texto por defecto y el tamaño del JtextField,         
        
        
        
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);         
    }
    
    public static void main(String[] args) {
        CampoTexto apli = new CampoTexto();
    }
    
    
}
