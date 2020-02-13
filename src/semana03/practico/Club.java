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
public class Club {
    
    private Socio socios[];
    
    public Club(){
        socios = new Socio[3];
        System.out.println("--- Socio 1 ---");
        socios[0] = new Socio();
        System.out.println("--- Socio 2 ---");
        socios[1] = new Socio();
        System.out.println("--- Socio 3 ---");
        socios[2] = new Socio();
    }
    
    public void resposabilidad(){
        if(socios[0].getAntiguedad()>socios[1].getAntiguedad()){
            if(socios[0].getAntiguedad()>socios[2].getAntiguedad()){
                System.out.println("Socio Con Mayor antiguedad: "+socios[0].getNombre());
            }else
                System.out.println("Socio Con Mayor antiguedad: "+socios[2].getNombre());
        }
        else if(socios[1].getAntiguedad()>socios[2].getAntiguedad())
            System.out.println("Socio Con Mayor antiguedad: "+socios[1].getNombre());
        else
            System.out.println("Socio Con Mayor antiguedad: "+socios[2].getNombre());                    
    }
    
    public static void main(String[] args) {
        Club club1 = new Club();
        club1.resposabilidad();        
    }
    
    
}
