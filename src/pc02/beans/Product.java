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
public abstract class Product {
    
    protected static String tipo;
    protected int code;
    protected String description;
    protected int stock;
    protected  static double precio;
    //protected final static double[] precio = {10.0,8.0,3.0};    
    public Product(int code, String description, int stock, double precio,String tipo) {
        this.code = code;
        this.description = description;
        this.stock = stock;
        this.precio = precio;
        Product.tipo = tipo;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Product.tipo = tipo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }
       
    public static double getPrecio() {
        return precio;
    }

//    public static void setPrecio(double precio) {
//        Product.precio = precio;
//    }
    
    
    
                            
}
