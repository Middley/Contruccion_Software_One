/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class DosMarcos extends JFrame{
    
    int x = 350;
    int y = 100;
    
    public DosMarcos(){
        super("Primer Marco");
        setBounds(400, 300,x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra todos los frames existentes
       
        //SecondMarco sm = new SecondMarco();//instanciamos SecondMarco para usarlo, verlo, etc     
        setVisible(true);
        //sm.setVisible(true);        
    }
    
    
    public static void main(String[] args) {
        DosMarcos dm = new DosMarcos();
        SecondMarco sm = new SecondMarco();//instanciamos SecondMarco para usarlo, verlo, etc     
        //sm.setVisible(true);
    }
}

class SecondMarco extends JFrame{
    
    int x = 150;
    int y = 80;
    
    public SecondMarco() {
        super("Segundo Marco");
        setBounds(400, 300,x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    
}