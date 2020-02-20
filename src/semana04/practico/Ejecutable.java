/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        
        int opcion =0;
        ListMultimedia<Valor> ListaDiscos = new ListMultimedia(20);
        
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Opciones\n1.- Agregar Disco\n2.- Mostrar lista Discos"
                        + "\n3.- Salir"));
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null," Valor Incorrecto: " + e);
            }
            
            switch(opcion){
                //String titulo, String autor,String formato,int pos,double value
                case 1:
//                    String titulo = JOptionPane.showInputDialog(null,"Ingrese Titulo");
//                    String autor = JOptionPane.showInputDialog(null,"Ingrese Autor");
//                    String formato = JOptionPane.showInputDialog(null,"Ingrese Formato");
//                    int genero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese genero"));
//                    if("".equals(formato))
//                        formato = "null";
                    
                    Valor valor = new Valor(                            
                            JOptionPane.showInputDialog(null,"Ingrese Titulo"),
                            JOptionPane.showInputDialog(null,"Ingrese Autor"),
                            JOptionPane.showInputDialog(null,"Ingrese Formato"),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese genero")),
                            Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Valor"))                                                         
                            );
                    ListaDiscos.add(valor);
                    break;                                        
                                        
                case 2:
                    System.out.println("---------- LISTA DE DISCOS ------------");
                    for(Valor lista: ListaDiscos)
                        System.out.println(lista.mostrarV());
                    System.out.println("\n");
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null," Opcion Incorrecta ");                        
            }                        
        }while(opcion!=3);
    }            
}

class disco{
    
    protected String titulo;
    protected String autor;
    
    public disco(String titulo, String autor){        
        this.titulo = titulo;
        this.autor = autor;
    }    
    
    public String mostrar() {
        return "disco{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }    
}

class Formato extends disco{
    
    protected String formato;//balada,etc
    
    public Formato(String formato,String titulo, String autor) {
        super(titulo, autor);
        this.formato = formato;
    }
   
    
    public String mostrarF() {
        return super.mostrar() + "\nFormato{" + "formato=" + formato + '}';
    }
            
}


class Genero extends Formato{
    
    protected final String CONST[]={"MP3","MP4","MP5"}; 
    private String genero;
    
    public Genero(int pos,String formato, String titulo, String autor) {
        super(formato, titulo, autor);
        this.genero = CONST[pos];
    }
    public String mostrarG() {
        return super.mostrarF()+"\nGenero{" + "GENEROS=" + genero + '}';
    }               
}

class Valor extends Genero{
    
    private double valor;
    
    public Valor(String titulo, String autor,String formato,int pos,double value) {
        super(pos, formato, titulo, autor);
        this.valor = value;
    }
    
    public String mostrarV() {
       return super.mostrarG()+"\nValor{" + "valor=" + valor + '}';
    }                
}



class ListMultimedia<t> implements Iterable<t>{
    
    private ArrayList<t> lista = new ArrayList<>();
    private int tope;
    
    public  ListMultimedia(int tope){
        super();
        this.tope = tope;
    }
    
    public void add(t obj){
        if(lista.size()<=tope){
            lista.add(obj);
        }else
            throw  new RuntimeException("Alcanzo el limite de almacenamiento");
    }
      
    @Override
    public Iterator<t> iterator() {
        return lista.iterator();
    }            
    
}

