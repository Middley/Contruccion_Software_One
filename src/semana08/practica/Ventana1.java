/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ventana1 extends JFrame implements ActionListener{
    
    private final JButton btnRegistrar;
    private JButton btnModificar;
    private JTextArea txaAreaMuestra;       
    private ArrayList<Alumno> listaAlumnos;
    private JButton btnMostrar;
        
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }                 
    
    public Ventana1(){
        
        listaAlumnos = new ArrayList<>();
        
        int x=0,y=0;
        
        getContentPane().setLayout(null);
        
        setTitle("Ventana 1");
        setBounds(400, 300,400,400);
        
        x=270;
        y=20;        
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(x,y, 100, 23);        
        btnRegistrar.addActionListener(this);       
        add(btnRegistrar);        
        
        
        y=60;
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(x, y,100,23);        
        btnModificar.addActionListener(this);                
        add(btnModificar);
        
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(x,y+40,100,23);
        btnMostrar.addActionListener(this);
        add(btnMostrar);
        
        x = 20;
        y = 20;
        txaAreaMuestra = new JTextArea();
        txaAreaMuestra.setFont(new Font("courier", Font.PLAIN, 12)); 
        txaAreaMuestra.setBounds(x, y,x+225,300);       
        txaAreaMuestra.setLayout(null);
        add(txaAreaMuestra);
        
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
            
    
    public void addAlumnos(Alumno al){
        listaAlumnos.add(al);
    }
               
    public Alumno buscar(String id){
        for(int i=0;i<listaAlumnos.size();i++)
            if(id.equalsIgnoreCase(listaAlumnos.get(i).getId()))
                return listaAlumnos.get(i);            
        return null;        
    }
    
    public int buscarIndice(String id){
        for(int i=0;i<listaAlumnos.size();i++)
            if(id.equals(listaAlumnos.get(i).getId()))
                return i;
        return -1;        
    }
    
    public String muestraAlumnos(){
        String cad = "";
        for(Alumno al: listaAlumnos)
            cad+=al.toString()+"\n";
        return cad;        
    }    
     
    public void addAl(){
        Ventana2 v2 = new Ventana2();
        String id = v2.txtId.getText();
        String nombre = v2.txtNombre.getText();
        String apellido = v2.txtApellido.getText();        
        listaAlumnos.add(new Alumno(id, nombre, apellido));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        Ventana2 v2 = new Ventana2();
        if(e.getSource() == btnRegistrar){
            if(listaAlumnos!=null){
                System.out.println("tamaño de la lista: "+listaAlumnos.size());
                v2.setVisible(true);
                this.setVisible(false);
            }                        
        }
        
        else if(e.getSource() == btnModificar){            
            v2.setVisible(true);
            v2.VistaAntes();
            this.setVisible(false);
        }
        
        else if(e.getSource()==btnMostrar){
            System.out.println(muestraAlumnos());
            this.txaAreaMuestra.setText(muestraAlumnos());
        }
    }
    
    public static void main(String[] args) {
        Ventana1 v = new Ventana1();
        v.setVisible(true);
    }
    
}
