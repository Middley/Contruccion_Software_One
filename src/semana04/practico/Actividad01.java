/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Actividad01 {
    
    
    public void ejecutable(){
        
        
        
    }
    
}

abstract class Person{
    protected String name;
    protected int age;
    
    public Person(String name,int age){// nombre,edad
        this.name = name;
        this.age = age;
    }
    
//    public String mostrar() {
//        return "Persona{" + "name: " + name + ", age: " + age + '}';
//    }
    
    public abstract String mostrar();
               
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
        return "Employee{" + "grossSalary=" + grossSalary + '}';
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
        return "Client{" + "accountPhone=" + accountPhone + '}';
    }            
}


class Business{
    
    private String name;    
    private ArrayList<Client> clients;    
    private ArrayList<Employee> employees;
    
    
    public Business(String name){
        this.name = name;
    }
    
    public Business(String name,String accountPhone, String n, int age,Employee emp){
        this.name = name;
        this.clients = new ArrayList<>();
        this.employees.add(emp);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(Client client) {
        this.clients.add(client);
    }

    public ArrayList getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee) {
        this.employees.add(employee);
    }
    
    
    
    
    @Override
    public String toString(){
        return " Name Business: "+name;
    }
    
}