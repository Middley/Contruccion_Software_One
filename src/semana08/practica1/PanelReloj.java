/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class PanelReloj extends JPanel{
    
    public PanelReloj(){
        super();
        String tiempoActual = getTiempo();//salida en string del tiempo
        JLabel tiempo = new JLabel("Fecha: ");//creacion de JLabel 
        JLabel actual = new JLabel(tiempoActual);//ingreso la salida de tiempo al JLabel
        add(tiempo);// agrego el Jlabel
        add(actual);
    }
    
    
    String getTiempo() {
        String tiempo;
        // obtener fecha y hora actual
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto= ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int year = ahora.get(Calendar.YEAR);

        String nombreMes = "";
        switch (mes) {
            case (1):
                nombreMes = "Enero";
                break;
            case (2):
                nombreMes = "Febrero";
                break;
            case (3):
                nombreMes = "Marzo";
                break;
            case (4):
                nombreMes = "Abril";
                break;
            case (5):
                nombreMes = "Mayo";
                break;
            case (6):
                nombreMes = "Junio";
                break;
            case (7):
                nombreMes = "Julio";
                break;
            case (8):
                nombreMes = "Agosto";
                break;
            case (9):
                nombreMes = "Septiembre";
                break;
            case (10):
                nombreMes = "Octubre";
                break;
            case (11):
                nombreMes = "Noviembre";
                break;
            case (12):
                nombreMes = "Diciembre";
        }
        tiempo = dia + " de " + nombreMes + " de "  + year + ".  " + " Hora:  "
            + hora + ":" + minuto;
        return tiempo;
    }
    
}
