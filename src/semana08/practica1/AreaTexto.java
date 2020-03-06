/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class AreaTexto extends JFrame{
    int x = 500;
    int y = 280;
    public AreaTexto(){
        super(" AREA TEXTO ");
        setSize(500,380);
        setBounds(400, 300, x, y);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        JTextArea comentarios = new JTextArea(8,40);
//        FlowLayout dis = new FlowLayout();//alinea los componentes, derecha, izquierda,centro;
//        setLayout(dis);
        setLayout(new FlowLayout());
        add(comentarios);   
        setVisible(true);        
    }
    
    public static void main(String[] args) {
        AreaTexto at = new AreaTexto();
    }
    
}
