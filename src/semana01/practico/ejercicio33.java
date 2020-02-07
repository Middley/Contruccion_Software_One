


package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio33 {
    
    public Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
        
    public void ventaCopias(){
        
        int tipo = 0;
        int offset = 10000;
        int estandar = 50000;        
        
        int of=0,est=0;        
        int acumOf = 0;
        int acumEst = 0;

        
        do{            
            System.out.println("Ingrese el tipo \n1: offset\n2: Estandas");
            tipo = sc().nextInt();
           
            if(tipo==1){
                if(acumOf==10000)
                    System.out.println("----- Tipo offset agotado ------- ");
                else{
                    System.out.print("Cantidad de copias: ");
                    of = sc().nextInt();
                    acumOf+=of;
                    if(acumOf>offset){
                        System.out.println("No se puede superar las 10 000 copias");
                        acumOf-=of;//quito lo sumado si supera el limite
                        System.out.println("Solicitud Negada v:");
                    }
                }                
            }                                   
            
            if(tipo == 2){
                if(acumEst==50000)
                    System.out.println("----- Tipo estandar agotado ------- ");
                else{
                    System.out.print("Cantidad de copias: ");
                    est = sc().nextInt();
                    acumEst+=est;
                    if(acumEst>50000){
                       System.out.println("No se puede superar las 50 000 copias");
                        acumEst-=est;//quito lo sumado si supera el limite
                        System.out.println("Solicitud Negada v:");
                    }
                }                                
            }                                    
        }while((acumEst!=estandar) || (acumOf!=offset));
        
        System.out.println("----- Ventas del dia culminadas -------");        
    }
    
    
    public static void main(String[] args) {
        ejercicio33 ej = new ejercicio33();
        ej.ventaCopias();
    }
    
}



