/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class NewClass {
    ArrayList<Alumno> listaArrayList;
    public NewClass(){
        listaArrayList = new ArrayList<>(); 
    }

    public ArrayList<Alumno> getListaArrayList() {
        return listaArrayList;
    }

    public void add(Alumno al){
        this.listaArrayList.add(al);
    }
    
    
    
}
