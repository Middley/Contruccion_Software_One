/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ComboBoxes extends JFrame{
    
    int x = 345;
    int y = 120;
    
    public ComboBoxes(){        
        super("Combo boxes");
        
        //setSize(x,y);
        setBounds(400, 300, x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComboBox curso = new JComboBox();
        FlowLayout dis = new FlowLayout();
        
        curso.addItem("Curso de Java");//agregar los items, a cada campo del comboBox
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de flash");
        curso.addItem("Curso de JavaScript");
        
        setLayout(dis);
        add(curso);//agregamos al Jframe el comboBox
        setVisible(true);
                                                
    }
    
    
    public static void main(String[] args) {
        ComboBoxes cb = new ComboBoxes();
    }
}
