/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

import java.util.ArrayList;
/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class testDoctor {
    
    public static void main(String[] args) {
        
        ArrayList<Doctor> listaDoctor = new ArrayList<>();
        
        listaDoctor.add(new Doctor(3,"luis"));// new Doctor(a,b) instancias anonimas
        listaDoctor.add(new Doctor(5,"Carlos"));
        listaDoctor.add(new Doctor(7,"Maria"));
        listaDoctor.add(new Doctor(0,"Juan"));
        
        for (Doctor doctor : listaDoctor) {
            System.out.println(doctor.toString());
        }
                                
    }
    
}
