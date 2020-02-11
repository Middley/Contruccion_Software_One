/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class pJuridica extends Person{
    
    private String ruc;
    public String nameTienda;           
    private int cantidad;
    
    private String tipo;
    
    public int ban;
    
    //private String tipo;
    
    //private Queso queso;
    
    public pJuridica(long ruc,String nameTienda,String direccion, String correo, long telefono) {
        super(direccion, correo, telefono);
        this.ruc=ruc+"";
        this.nameTienda = nameTienda;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNameTienda() {
        return nameTienda;
    }

    public void setNameTienda(String nameTienda) {
        this.nameTienda = nameTienda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("Queso")){
            ban = 0;
            this.tipo = tipo;
        }else if(tipo.equalsIgnoreCase("Leche")){
            ban = 1;
            this.tipo = tipo;
        }else if(tipo.equalsIgnoreCase("Mantequilla")){
            ban = 2;
            this.tipo = tipo;
        }else{
            System.out.println("No exites mas productos");            
        }        
    }
    
    
    
    
    // ========================================================================
    // =================== un tipo de producto al mes =========================
    
    public void ReduceStockQueso(int cantidad){
        try {
            if(Queso.stockQueso>0){
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Stock insuficiente: "+e);
        }        
    }
    
    
    public int pedidoCantidad(int cantidad){
        if(ban==0){
            Queso.stockQueso-=cantidad;
        }else if(ban==1){
            Leche.stockMilk-=cantidad;
        }else if(ban==2){
            Mantequilla.stockMante-=cantidad;
        }else
            return -1;
            
    }
    
    
    
    
    
}
    
