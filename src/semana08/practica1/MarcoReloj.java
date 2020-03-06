/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class MarcoReloj extends JFrame{
    
    int x = 350;
    int y = 100;
    
    public MarcoReloj(){
        super("Marco Reloj");
        setBounds(400, 300,x, y);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        PanelReloj tiempo= new PanelReloj();
        add(tiempo);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        MarcoReloj reloj = new MarcoReloj();
    }
    
}
