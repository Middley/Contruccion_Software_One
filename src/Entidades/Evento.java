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
    
    public MisConstantes costos;
    private String titulo;
    private int duracion;
    private Expositor expositor;
    private int hora_ingreso;
    private int hora_salida;
    private boolean temporada;
    
    private ArrayList<Asistente> asistentes;    
    //private ArrayList<Expositor> expositores;

    public Evento(MisConstantes costos, String titulo, int duracion, int ingreso,int salida,boolean temp,Expositor expositor){
        
        this.costos = costos;
        this.titulo = titulo;
        this.duracion = duracion;
        this.hora_ingreso = ingreso;
        this.hora_salida = salida;
        this.temporada = temp;
        this.expositor = expositor;
        asistentes = new ArrayList<>();
    }

    public MisConstantes getCostos() {
        return costos;
    }

    public void setCostos(MisConstantes costos) {
        this.costos = costos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    
    
    
    

    
    
    
    
    public double costoIngreso(char codigo){
        String cad = ""+codigo;
        if(cad.equalsIgnoreCase("p"))
            return costos.Platinum;
        else if(cad.equalsIgnoreCase("g"))
            return costos.Gold;
        else if(cad.equalsIgnoreCase("v"))
            return costos.VIP;
        else
            return 0;
    }
    
    
    public double montoIGV(char codigo,double igv){
        return costoIngreso(codigo)+igv;
    }
    
    public double montoDescuento(char codigo,double igv){
        if(temporada)
            return montoIGV(codigo, igv)*0.1;
        else if(!temporada)
            return montoIGV(codigo, igv)*0.05;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Evento{" + "costos=" + costos.getCode() + ", titulo=" + titulo + ", duracion=" + duracion + ", expositor=" + expositor.lastName + ", hora_ingreso=" + hora_ingreso + ", hora_salida=" + hora_salida + ", temporada=" + temporada + ", asistentes=" + asistentes + '}';
    }

    
    
    
    
    
    
}
