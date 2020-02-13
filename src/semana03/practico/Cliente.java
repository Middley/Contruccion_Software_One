/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Cliente {
    
    private String nombre;
    private double monto;
    
    public Cliente(String nombre){
        this.nombre = nombre;
        this.monto = 0.0;
    }
    
    public void depositar(double monto){
        this.monto = monto;
    }
    
    public void extraer(int montoEx){
        monto-=montoEx;
    }
    
    public double retornarMonto(){
        return monto;
    }
    
    public String print(){
        return "Nombre: "+ nombre+", Monto Depositado: "+monto;
    }
}
