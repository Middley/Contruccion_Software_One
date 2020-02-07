/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio02 {
    public static void main(String[] args) {
        
        Rectangulo rt = new Rectangulo();
        Triangulo tr = new Triangulo();
        Cuadrado cr = new Cuadrado();                
        
        rt.asignar(2, 3);
        System.out.println("Area Rectangulo: "+rt.calcularArea());
        
        tr.asignar(3, 2);
        System.out.println("Area Triangulo: "+tr.calcularArea());
        
        cr.asignar(4);
        System.out.println("Area Caudrado: "+cr.calcularArea());
        
    }
}



class Rectangulo{
    
    private int n1;
    private int n2;
    
    public void asignar(int num1,int num2){
        n1 = num1;
        n2 = num2;
    }
    
    public int calcularArea(){
        return n1*n2;
    }
    
}


class Triangulo{
    
    private int n1;
    private int n2;
    
    public void asignar(int num1,int num2){
        n1 = num1;
        n2 = num2;
    }
    
    public double calcularArea(){
        return (n1*n2)/2;
    }
    
}

class Cuadrado{
    
    private int n1;    
    
    public void asignar(int num1){
        n1 = num1;        
    }
    
    public int calcularArea(){
        return n1*n1;
    }
    
}