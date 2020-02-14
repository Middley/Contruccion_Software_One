/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.text.DecimalFormat;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Empleado {
    
    private String codigo;
    private String name;
    private  String AreaLaboral;    
    private double sueldo;
    private int horasExtras;
    private String afiliacion;
    
    DecimalFormat df = new DecimalFormat("#.####");
    
    public Empleado(String codigo, String name, String AreaLaboral, double sueldo, int horasExtras, String afiliacion) {
        this.codigo = codigo;
        this.name = name;
        this.AreaLaboral = AreaLaboral;
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.afiliacion = afiliacion;
    }    
    
    public String getName(){
        return name;
    }
    
    public String getAreaLaboral(){
        return AreaLaboral;
    }
    
    public double MontoHExtras(){
        return (sueldo*horasExtras)/240;
    }
    
    public double MontoSeguro(){
        if(afiliacion.equalsIgnoreCase("AFP"))
            return sueldo*0.17;
        else
            return sueldo*0.05;
    }
        
    public double MontoEssalud(){
        return sueldo*0.03;
    }

    public double MontoDescuento(){
        return MontoSeguro()+MontoEssalud();
    }
    
    public double SueldoBruto(){
        return sueldo+MontoHExtras();
    }
    
    public double SueldoNeto(){
        return SueldoBruto()-MontoDescuento();
    }
    
    public static int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }

    @Override
    public String toString() {
        return "------ EMPLEADO ----- " + "\ncodigo: " + codigo + "\nNombre: " + name + "\nAreaLaboral: " + AreaLaboral + "\nsueldo: " 
                + sueldo + "\nhorasExtras: " + horasExtras + "\nafiliacion: " + afiliacion + 
                "\nMonto Horas Extras: "+df.format(MontoHExtras())+"\nMonto Seguro: "+df.format(MontoSeguro())+"\nMonto Essalud: "+df.format(MontoEssalud())
                +"\nMonto Descuento: "+df.format(MontoDescuento())+"\nSueldo Bruto: "+df.format(SueldoBruto())+"\nSueldo Neto: "+df.format(SueldoNeto());
    }
    
            
    public static void main(String[] args) {
        final String AREALABORAL[] ={"Sistemas","Administración","Marketing"};    
        final String AFILIACION[] = {"AFP","SNP"};                
        
        Empleado emp1 = new Empleado("1232", "Carlos",AREALABORAL[Empleado.aleatorio(0, 2)],2000,10,AFILIACION[Empleado.aleatorio(0, 1)]);        
        emp1.MontoHExtras();
        emp1.MontoSeguro();
        emp1.MontoEssalud();
        emp1.MontoDescuento();
        
        System.out.println(emp1.toString());
        
    }
}
