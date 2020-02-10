/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class MisConstantes {
    
    //private char code;
    
//    public final double Platinum=250.50;
//    public final double Gold = 150.50;
//    public final double VIP = 95.0;

    public static double ubicacion[] = {250.50,150.50,95.0}; // no van a cambiar never
    public static final double IGV = 0.18;
    
    public static String Ubicacion(int ubicacion){
        switch (ubicacion) {
            case 0:
                return "Platinum";                
            case 1:
                return "Gold";
            case 2:
                return "VIP";
            default:
                return "sin Ubicacion: ";
        }
    }
}
