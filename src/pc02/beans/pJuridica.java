/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

public class pJuridica extends Person{
    
    private String ruc;
    public String nameTienda;           
    private int cantidad;
    public double precioCompra;
    private String tipo;
            
    public int bandera;
    
    //private String tipo;
    
    //private Queso queso;
    
    public pJuridica(long ruc,String nameTienda,String direccion, String correo, long telefono) {
        super(direccion, correo, telefono);
        this.ruc=ruc+"";
        this.nameTienda = nameTienda;
    }
    
//    private pJuridica(String nameTienda,String direccion, String correo, long telefono) {
//        super(direccion, correo, telefono);
//        this.ruc=ruc+"";
//        this.nameTienda = nameTienda;
//    }

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

//    public void setTipo(String tipo) {
//        if(tipo.equalsIgnoreCase("Queso")){
//            bandera = 0;            
//        }else if(tipo.equalsIgnoreCase("Leche")){
//            bandera = 1;           
//        }else if(tipo.equalsIgnoreCase("Mantequilla")){
//            bandera = 2;            
//        }else{
//            System.out.println("No exites mas productos");            
//        }
//        this.tipo = tipo;
//    }
    
          
    public boolean Restric100(int cantidad){
        int cientos = cantidad*100;
        if(tipo.equalsIgnoreCase("Queso")){
            if(cientos>Queso.STOCKQUESO){
                return false;
            }
            return true;
        }else if(tipo.equalsIgnoreCase("Leche")){
            if(cientos>Leche.STOCKMILK){
                return false;
            }
            return true;
        }else if(tipo.equalsIgnoreCase("Mantequilla")){
            if(cientos>Mantequilla.STOCKMANTE){
                return false;
            }
            return true;
        }
        return false;        
    }
    
    
    public boolean disponibilidadStock(int cantidad,String tipo){        
        if(!Restric100(cantidad))// para ver si supera la 100 ventas
            return false;
        
        if(tipo.equalsIgnoreCase("Queso")){// si es que se compra de tipo queso
            if(disponibilidadQueso(cantidad)){                
                if(cantidad>Queso.STOCKQUESO){
                    return false;
                }
                bandera = 0;// bariable para saber de que tipo se esta vendiendo
                return true;
            }
            
            return true;
                            
        }else if(tipo.equalsIgnoreCase("Leche")){// si es que se compra de tipo queso
            if(disponibilidadLeche(cantidad)){
                if(cantidad>Leche.STOCKMILK){
                   return false;
                }
            }
            bandera = 1;
            return true;
        }
        
        else if(tipo.equalsIgnoreCase("Mantequilla")){// si es que se compra de tipo queso 
            if(disponibilidadMantequilla(cantidad)){
                if(cantidad>Mantequilla.STOCKMANTE)
                    return false;
            }           
            bandera = 2;
            return true;
        }
        else 
            return false;
    }
    
    // ========================================================================
    // =================== un tipo de producto al mes =========================
    // ========================================================================                            
        
    public boolean disponibilidadQueso(int cantidad){
        if(cantidad<100){                        
            return true;
        }else{
            System.out.println("Stock insuficiente");
            return false;
        }        
    }
    
    public boolean disponibilidadLeche(int cantidad){
        if(cantidad<100){                        
            return true;
        }else{            
            return false;
        }        
    }
    
    public boolean disponibilidadMantequilla(int cantidad){
        if(cantidad<100){                        
            return true;
        }else{            
            return false;
        }        
    }
    
    
    
    
}
    
