/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Util.MisConstantes;
import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Evento {
        
    private final String titulo;
    private int duracion;
    private Expositor expositor;
    private int hora_ingreso;
    private int hora_salida;
    private boolean temporada;
    private static int aviso = 0;//aviso para saber la ubicacion
    private double costo;
    private ArrayList<Asistente> asistentes;        

    public Evento(String titulo, int duracion, int ingreso,int salida,boolean temp,Expositor expositor){
                
        this.titulo = titulo;
        this.duracion = duracion;
        this.hora_ingreso = ingreso;
        this.hora_salida = salida;
        this.temporada = temp;
        this.expositor = expositor;
        asistentes = new ArrayList<>();
    }
          
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }

    public int getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(int hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public boolean isTemporada() {
        return temporada;
    }

    public void setTemporada(boolean temporada) {
        this.temporada = temporada;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistente asistentes) {
        this.asistentes.add(asistentes);
    }    

    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public double getCosto(){
        return costo;
    }
    
    // ----------------------------------------------------------
    // ------------------ METODOS PROPIOS -----------------------
    // ----------------------------------------------------------
    
    
    public double entranceFee(char cod){//costo de entrada
        String aux = ""+cod;
        if(aux.equalsIgnoreCase("p")){
            aviso = 0;
            return MisConstantes.ubicacion[0];
        }            
        else if(aux.equalsIgnoreCase("g")){
            aviso = 1;
            return MisConstantes.ubicacion[1];
        }                
        else if(aux.equalsIgnoreCase("v")){
            aviso = 2;
            return MisConstantes.ubicacion[2];
        }            
        else 
            return 0;
    }
    
    public double totalPayIGV(char cod){// total a pagar incluyendo igv
        return entranceFee(cod)*MisConstantes.IGV + entranceFee(cod);
    }
    
    public void Discounts(char c){// descuento de 5% y 10%
        
        double a = 0.0;
        if(temporada)        
            setCosto(totalPayIGV(c)-totalPayIGV(c)*0.1);            
        else if(!temporada)            
            setCosto(totalPayIGV(c)-totalPayIGV(c)*0.05);          
    }   
    
    @Override
    public String toString() {
        return "Event{" + "\nUbicacion: " + MisConstantes.Ubicacion(aviso) + "\nCosto: "+getCosto()+", \nTitulo: " + titulo + ", \nduracion: " + duracion + ", \nExpositor: " 
                + expositor.toString() + ", \nhora_ingreso: " + hora_ingreso + ", \nhora_salida: " + hora_salida 
                + ", \nTemporada: " + temporada + ", \nAsistentes: " + asistentes.toString() + '}';
    }
                
    
}
