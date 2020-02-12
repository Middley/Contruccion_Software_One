/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

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
    // ========================================================================
    
    public int pedidoCantidad(String t,int cantidad){
        int can=0;
        setTipo(tipo);
        switch (ban) {
            case 0:
                Queso.stockQueso-=can;
                can = can*100;
                precioCompra=Queso.stockQueso*100;
                return can;
            case 1:
                Leche.stockMilk-=can;
                Leche.stockMilk-=can;
                can = can*100;
                return can;
            case 2:
                Mantequilla.stockMante-=can;
                can = can*100;
                Mantequilla.stockMante-=can;
                return can;
            default:
                return can;
        }
    }
        
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
    
