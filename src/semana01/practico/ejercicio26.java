/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio26 {
    
     public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
     
    public int control(){
        int edad = 0;
        System.out.print("Ingrese edad: ");
        edad = sc().nextInt();
        while(edad<4 || edad>100){
            System.out.println("Edad mayor a 5 y menor a 70");
            System.out.print("Ingrese edad: ");
            edad = sc().nextInt();
        }
        return edad;
    }     
      
    public void VentaEntradas(){
        
        System.out.println(" ------- ENTRADAS TEATRO -------");                
        double precioEntrada = 0;
        System.out.print("Precio de entrada: ");
        precioEntrada = sc().nextDouble();
        
        double promedio = 0;
                
        double categoria1 = 0;
        double categoria2 = 0;
        double categoria3 = 0;
        double categoria4 = 0;
        double categoria5 = 0;
        
        double cat1 = 0;
        double cat2 = 0;
        double cat3 = 0;
        double cat4 = 0;
        double cat5 = 0;        
        
        String ter="";
        int edad;
        do{
            
            edad = control();
            
            if( edad>=5){                
                if(edad<=14){                    
                    cat1=precioEntrada*0.35;                
                    categoria1+=cat1;                    
                }if(edad>=15){                    
                    if(edad<=19){                        
                        cat2 = precioEntrada*0.25;                
                        categoria2+=cat2;                        
                    }else if(edad>=20){                        
                        if(edad<=45){                            
                            cat3 =precioEntrada*0.1;                                            
                            categoria3+=cat3;                           
                        }else if(edad>=46){
                            if(edad<=65){
                                cat4 = precioEntrada*0.25;                
                                categoria4+=cat4;
                            }else if(edad>=66){
                                    if(edad<=100){
                                        cat5 = precioEntrada*0.35;
                                        categoria5+=cat5;
                                    }
                            }
                        }
                    }
                }
            }
            System.out.println("Presione \n- ESPACIO: terminar \n- ENTER para continuar");
            ter = "";
            ter = sc().nextLine();
            
        }while(!ter.equals(" "));
        
        System.out.println(" ------ perdidas por categorias ------");
        System.out.println("Categoria 1: s/"+categoria1);
        System.out.println("Categoria 2: s/"+categoria2);
        System.out.println("Categoria 3: s/"+categoria3);
        System.out.println("Categoria 4: s/"+categoria4);
        System.out.println("Categoria 5: s/"+categoria5);
        
    }
    
    public static void main(String[] args) {
        ejercicio26 ej = new ejercicio26();
        ej.VentaEntradas();
    }
    
}
