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
public class Actividad01 {
    
}

class Person{
    protected String name;
    protected int age;
    
    public Person(String name,int age){// nombre,edad
        this.name = name;
        this.age = age;
    }

    
    public String mostrar() {
        return "Persona{" + "name: " + name + ", age: " + age + '}';
    }
                
}

class Employee extends Person{
    
    private double grossSalary;//sueldo bruto
    
    
    public Employee(double grossSalary, String name, int age){
        super(name, age);
        this.grossSalary = grossSalary;
    }
    
    private double discount(){
        return grossSalary*0.1;
    }
    
    public double calculateNetSalary(){
        return grossSalary-discount();
    } 

    @Override
    public String mostrar() {
        return super.mostrar() + "Employee{" + "grossSalary=" + grossSalary + '}';
    }

    
}


class Client extends Person{
    
    private String accountPhone;//telefono de contacto
    
    public Client(String accountPhone, String name, int age) {
        super(name, age);
        this.accountPhone = accountPhone;
    }
  
    
    @Override
    public String mostrar() {
        return super.mostrar() + "Client{" + "accountPhone=" + accountPhone + '}';
    }
    
    
    
}