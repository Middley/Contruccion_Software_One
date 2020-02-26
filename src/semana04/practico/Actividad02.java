/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Actividad02 {
    
    
    public double calculaSalarioBruto(String tipo,double ventas,int horasEx){
        double salarioBase=0.0;
        if(tipo != null){
                if(horasEx>=0){
                    if(ventas>=0){
                        if(tipo.equalsIgnoreCase("Encargado")){
                            salarioBase = 1000;
                        }else if(tipo.equalsIgnoreCase("Vendedor"))
                            salarioBase = 1500;
                        
                        System.out.println("salario base = "+salarioBase);
                        if(ventas>=1000.0){
                            salarioBase+=100.0;
                        }
                        if(ventas>=1500.0){
                            System.out.println("entra");
                            salarioBase+=200.0;                    
                        }                            
                        salarioBase+=(horasEx*20);
                    }else
                        throw new RuntimeException(" ---- no puede aver ventas negativas ---- ");
                }else
                    throw new RuntimeException(" ---- no exites horas negativas ---- ");
            }else{
                throw new NullPointerException(" ---- tipo es nulo ---- ");
            }        
        return salarioBase;     
    }
    
    
    public double calculaSalarioNeto(double salarioBruto){
        double retencion = 0.0;                    
            if(salarioBruto>0){                
                if(salarioBruto<1000.0){                    
                    retencion = 0.0;
                }else if(salarioBruto>=1000.0){
                    if(salarioBruto<1500.0)
                        retencion = salarioBruto*0.16;
                    System.out.println("retension "+ retencion);
                }                    
                else if(salarioBruto>=1500.0)
                    retencion = salarioBruto*0.18;
            }else 
                throw new RuntimeException(" salario negativo pliss");
            
        
        return salarioBruto-(retencion);
    }
     public static void main(String[] args) {
        Actividad02 ac = new Actividad02();
        double sbruto = 0.0;
        double sneto = 0.0;
        sneto = ac.calculaSalarioNeto(40);
        sbruto = ac.calculaSalarioBruto("Encargado", 2000.0, 8);
        System.out.println(sbruto);        
    }        
}
