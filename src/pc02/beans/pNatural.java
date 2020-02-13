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

public class pNatural extends Person{
                    
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;
    
    private int bandera = 0;

    public pNatural(long dni,String nombre,String paterno,String materno,String direccion, String correo, long telefono) {
        super(direccion, correo, telefono);
        this.dni = dni+"";
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPaterno() {
        return paterno;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    
    public String getMaterno() {
        return materno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
        
    
    
    // =======================================================================
    
    
    
    public boolean Restric100(int cantidad,String tipo){
        
        if(cantidad<=100)
            return true;
        else
            return false;
    }
    
    
    
    public boolean disponibilidadStock(int cantidad,String tipo){
        
        if(!Restric100(cantidad, tipo))// para ver si supera la 100 ventas
            return false;
        
        if(tipo.equalsIgnoreCase("Queso")){// si es que se compra de tipo queso
            bandera = 0;// bariable para saber de que tipo se esta vendiendo
            if(cantidad>Queso.STOCKQUESO){
                return false;
            }
            return true;
                            
        }else if(tipo.equalsIgnoreCase("Leche")){// si es que se compra de tipo queso
            bandera = 1;
            if(cantidad>Leche.STOCKMILK){
                return false;
            }
            return true;
        }
        else if(tipo.equalsIgnoreCase("Mantequilla")){// si es que se compra de tipo queso
            bandera = 2;
            if(cantidad>Mantequilla.STOCKMANTE)
                return false;
            else
                return true;
        }
        else 
            return false;
    }
    
    
    
    public double RealizandoVenta(int cantidad, String tipo){
        double venta = 0.0;
        if(disponibilidadStock(cantidad, tipo)){
            switch (bandera) {
                case 0:
                    Queso.STOCKQUESO-=cantidad;
                    venta = cantidad*10.0;
                    break;
                case 1:
                    Leche.STOCKMILK-=cantidad;
                    venta = cantidad*8.0;
                    break;
                case 2:
                    Mantequilla.STOCKMANTE-=cantidad;
                    venta = cantidad*3.0;
                    break;
                default:            
                    venta = 0.0;
                    break;
            }
        }else
            System.out.println("Stock insuficiente");
        return venta;
    }
    
    
    
    
    
    
}

















