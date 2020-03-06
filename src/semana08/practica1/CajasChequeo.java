/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class CajasChequeo extends JFrame{
    
    int x = 345;
    int y = 120;
    
    public CajasChequeo(){
        
        super(" Caja Chequeo ");        
        //setSize(x,y);
        setBounds(400, 300, x, y);//setBounds centra toda la ventana, con cuatro parametros
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cuando se preciona x termine la ejecusion
        
        JCheckBox cursoJava = new JCheckBox("Curso de Java",true);//el true, false, es para que el check salga por defecto en ellos
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash",true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP",true);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby",true);
        
        FlowLayout dis = new FlowLayout();
        ButtonGroup cursos = new ButtonGroup();
        
        cursos.add(cursoJava);//para agregar al ButtonGroup.
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        
        setLayout(dis);
        
        add(cursoJava);//agrega al JFrame el JCheckBox
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        
        setVisible(true);//para hacer visible al Frame
                
    }
    
    public static void main(String[] args) {
        CajasChequeo cj = new CajasChequeo();
    }
    
}
