/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ventana2 extends JFrame implements ActionListener,ItemListener{
    Ventana1 v1 = new Ventana1();
    JLabel lblModif;
    JLabel lblId;
    JLabel lblNombre;
    JLabel lblApellido;
    
    JTextField txtId;
    JTextField txtNombre;
    JTextField txtApellido;
    
    JTextField txtIdModificar;
    JButton btnAgregar;
    JButton btnBuscar;
    JButton btnMenu;
    
    
    public Ventana2(){
        int x=0,y=0;        
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.lightGray); 
  
        setTitle("Agregar");
        setBounds(400,300,250,250);
        
        lblModif = new JLabel("Id Modificar: ");
        lblModif.setBounds(20, 20, 100,23);
        add(lblModif);
        lblModif.setVisible(false);
        
        txtIdModificar = new JTextField();
        txtIdModificar.setBounds(105, 20, 100,23);
        add(txtIdModificar);
        txtIdModificar.setVisible(false);
      
        x=20;
        y=20;        
        lblId = new JLabel("Id: ");        
        lblId.setBounds(x, y, 100, 23);
        add(lblId);
     
        y+=30;
        lblNombre = new JLabel("Nombre: ");        
        lblNombre.setBounds(x, y, 100, 23);
        add(lblNombre);
        
        y+=30;
        lblApellido = new JLabel("Apellido: ");    
        lblApellido.setBounds(x, y, 100, 23);
        add(lblApellido);
        
        x=80;
        y=20;
        txtId = new JTextField();
        txtId.setBounds(x, y,100,23);
        add(txtId);
        
        y+=30;
        txtNombre = new JTextField();
        txtNombre.setBounds(x, y,100,23);
        add(txtNombre);
        
        y+=30;
        txtApellido = new JTextField();
        txtApellido.setBounds(x, y,100,23);
        add(txtApellido);
        
        x=80;
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(x-40, y+40,80,23);
        btnAgregar.addActionListener(this);
        add(btnAgregar);
                        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(x-40, y+40,80,23);
        btnBuscar.addActionListener(this);
        add(btnBuscar);
        btnBuscar.setVisible(false);
        
        btnMenu = new JButton("Menu");
        btnMenu.setBounds(x+40, y+40,80,23);
        btnMenu.addActionListener(this);
        add(btnMenu);
        
        setVisible(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void VistaAntes(){
        this.lblModif.setVisible(true);
        this.txtIdModificar.setVisible(true);
        this.btnBuscar.setVisible(true);
        
        this.lblId.setVisible(false);
        this.lblNombre.setVisible(false);
        this.lblApellido.setVisible(false);
        
        this.txtId.setVisible(false);
        this.txtNombre.setVisible(false);
        this.txtApellido.setVisible(false);        
        this.btnAgregar.setVisible(false);
                    
    }    
    
    private void VistaDespues(){
        this.lblModif.setVisible(false);
        this.txtIdModificar.setVisible(false);
        this.btnBuscar.setVisible(true);
        
        this.lblId.setVisible(true);
        this.lblNombre.setVisible(true);
        this.lblApellido.setVisible(true);
        
        this.txtId.setVisible(true);
        this.txtNombre.setVisible(true);
        this.txtApellido.setVisible(true);
        this.btnAgregar.setVisible(true);
        
        
    }
    
    public void uno(){
               
        Alumno al = v1.buscar(this.txtIdModificar.getText());
        int indice = v1.buscarIndice(this.txtIdModificar.getText());
        
        if(al!=null){
            System.out.println("---- entra 2 ----");
            VistaDespues();
            
            this.txtId.setText(al.getId());//lo mostramos en Jtextfield para modificarlos
            this.txtNombre.setText(al.getNombre());
            this.txtApellido.setText(al.getApellido());
            
            al.setId(this.txtId.getText());//reemplazamos lo que habia antes en el id
            al.setNombre(this.txtNombre.getText());//reemplazamos lo que habia en el nombre
            al.setApellido(this.txtApellido.getText());// reemplazamos lo que habia en el apellido            
            
            v1.getListaAlumnos().set(indice,al);//reemplazamos los datos en la misma posicion de antes
            
        }else
            JOptionPane.showMessageDialog(null,"ID no encontrado");   
    }
    
    public void limpia(){                
        this.txtId.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");        
    }
    
    public void addAlumno(){
        
        String id = this.txtId.getText();
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        v1.addAlumnos(new Alumno(id, nombre, apellido));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==btnAgregar){            
            addAlumno();
            limpia();            
        }
        else if(e.getSource()==btnBuscar){             
            uno();
            this.txtIdModificar.setText("");
        }
        
        if(e.getSource() == btnMenu){
            v1.setVisible(true);
            this.setVisible(false);
        }
            
            
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
      
    public static void main(String[] args) {
        Ventana2 v = new Ventana2();
        v.setVisible(true);
    }
}
