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
public final class Employee {
    
    private String name;
    private double salary;
    
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        if(!salaryControls())
            System.out.println("Salario Menor al Sueldo Basico de 950");
    }
    
    public void setName(String name){
        this.name = name;
        salaryControls();
    }
    
    public String getName(){
        return name;
    }
    
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public boolean salaryControls(){
        //control de salario
                 return salary >= 950;
    }
    
    public String printData(){//imprimir datos
        return " Name of Indivual: "+name + ", Salary: "+salary+"\n"
                +salaryCondition();
    }
    
    private String salaryCondition(){
        if(salary>3000)
            return "Pay tax";//paga imppuesto
        return "Does not pay tax";// No paga impuesto
    }
    
    public static void main(String[] args) {
        Employee empleado1 = new Employee("carlos", 000);
        System.out.println(empleado1.printData());
    }
}
