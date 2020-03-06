/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import javax.swing.JFrame;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class CursoVideotutoriales extends JFrame{
    
    int x = 350;
    int y = 100;    
    
    public CursoVideotutoriales(){
        super("Curso videotutoriales de java");        
        //setSize(x,y);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setVisible(true);
        setBounds(400,300, x, y);
    }
    
    public static void main(String[] args) {
        CursoVideotutoriales cv = new CursoVideotutoriales();
    }
    
    
}
