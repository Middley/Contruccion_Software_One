/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class PlayBack extends JFrame{
    
    int x = 255;
    int y = 80;
    
    public PlayBack(){
        super(" PlayBack ");       
        setBounds(400, 200,x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        
        JButton btnPlay = new JButton("Play");
        JButton btnStop = new JButton("Stop");
        JButton btnPausa = new JButton("Pausa");
        
        add(btnPlay);
        add(btnStop);
        add(btnPausa);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PlayBack pb = new PlayBack();
    }
    
}
