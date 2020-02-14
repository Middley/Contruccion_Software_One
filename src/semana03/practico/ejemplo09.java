/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejemplo09 {
    public static void main(String[] args) {
        final String AREALABORAL[] ={"Sistemas","Administración","Marketing"};    
        final String AFILIACION[] = {"AFP","SNP"};  
        
        Empleado emp1 = new Empleado("0002", "Carlos",AREALABORAL[Empleado.aleatorio(0, 2)],2000,110,AFILIACION[Empleado.aleatorio(0, 1)]);
        Empleado emp2 = new Empleado("0002", "Luis",AREALABORAL[Empleado.aleatorio(0, 2)],5000,100,AFILIACION[Empleado.aleatorio(0, 1)]);
        Empleado emp3 = new Empleado("1232", "Pedro",AREALABORAL[Empleado.aleatorio(0, 2)],5000,120,AFILIACION[Empleado.aleatorio(0, 1)]);
        Empleado emp4 = new Empleado("1232", "Pablo",AREALABORAL[Empleado.aleatorio(0, 2)],5000,99,AFILIACION[Empleado.aleatorio(0, 1)]);
        emp1.MontoHExtras();
        emp1.MontoSeguro();
        emp1.MontoEssalud();
        emp1.MontoDescuento();
        
        emp2.MontoHExtras();
        emp2.MontoSeguro();
        emp2.MontoEssalud();
        emp2.MontoDescuento();
        
        emp3.MontoHExtras();
        emp3.MontoSeguro();
        emp3.MontoEssalud();
        emp3.MontoDescuento();
        
        emp4.MontoHExtras();
        emp4.MontoSeguro();
        emp4.MontoEssalud();
        emp4.MontoDescuento();
        
        person listaEmp = new person();
        listaEmp.add(emp1);
        listaEmp.add(emp2);
        listaEmp.add(emp3);
        listaEmp.add(emp4);
        
        //System.out.println("a) PERSONAS CON MAYOR SUELDO NETO: "+listaEmp.mostrar());
        listaEmp.mostrar();
        System.out.println("b) SUELDO NETO PROMEDIO MARKETING: "+listaEmp.SueldoNetosMarketing());
        
    }
    
}




class person implements Iterable<Empleado>{
    
    ArrayList<Empleado> empleados = new ArrayList<>();
     
    public person(){
        super();        
    }
    
    void add(Empleado emp1){
        empleados.add(emp1);
    }
    
    public String MayorSueldo(){
        double aux = 0.0;
        String name="";        
        for(Empleado emp: empleados)
            if(emp.SueldoNeto()>=aux)
                aux = emp.SueldoNeto();
        
        for (Empleado emp : empleados) {
            if(emp.SueldoNeto()==aux)
                name+=emp.getName()+" ";
        }
        
        return name;
    }
    
    public void mostrar(){
        double aux = 0.0;
        String name="";
        
        for(Empleado emp: empleados)
            if(emp.SueldoNeto()>=aux)
                aux = emp.SueldoNeto();
        
        for (Empleado emp : empleados) {
            if(emp.SueldoNeto()==aux)
                System.out.println(emp.SueldoNeto());
                //System.out.println(emp.getName());
        }
    }
    
    public double SueldoNetosMarketing(){
        double prom = 0.0;
        for(int i=0;i<empleados.size();i++)
            if(empleados.get(i).getAreaLaboral().equalsIgnoreCase("Marketing"))
                prom+=empleados.get(i).SueldoNeto();
            
        return prom;        
    }
    
    
    public int SuperaSeguro100(){
        int cont=0;
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).MontoSeguro()>100)
                cont++;
        }        
        return cont;      
    }
    
    public int AreaSistemas(){        
        int cont=0;
        for(int i=0;i<empleados.size();i++)
            if(empleados.get(i).getAreaLaboral().equalsIgnoreCase("Sistemas"))
                if(empleados.get(i).MontoHExtras()>500 && empleados.get(i).MontoHExtras()<800)
                cont++;
        return cont;
    }
    
    
    public String DescuentoMinimoSNP(){
        String nom = "";
        double min = empleados.get(0).MontoDescuento();
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getAreaLaboral().equalsIgnoreCase("SNP"))
                if(empleados.get(i).MontoDescuento()<min)
                    nom = empleados.get(i).getName();
        }
        return nom;
    }
    
    
    public double totalPayBusiness(){//total a pagar por la empresa a todos sus empleados
        double total = 0.0;
        for(int i=0;i<empleados.size();i++){
            total+=empleados.get(i).SueldoNeto();
        }
        return total;
    }

//    @Override
//    public String toString() {
//        return "Empleado con Mayor Sueldo Neto: "+MayorSueldo()+"\n Promedio de Sueldos netos del área de Marketing: "+SueldoNetosMarketing()+
//                "\nNumero de Empleados Monto Seguro superen los 100 soles: "+SuperaSeguro100()+"\n Horas Extras entre 500 y 800: "+AreaSistemas()
//                +"\nEmpleado del SNP con el menor monto de Descuento: "+DescuentoMinimoSNP()+"\nTotal Pagar la Empresa: "+totalPayBusiness();
//    }

    @Override
    public Iterator<Empleado> iterator() {
        return empleados.iterator();
    }

   
    
    
    
    
}