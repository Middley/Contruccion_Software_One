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
public class Ejercicio03 {
    
    public static Scanner sc(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
        
    public void expresion(){
        double milimetros;
        System.out.print("Ingrese medida en Milimetros: ");
        milimetros = sc().nextDouble();
        
        
        int metros;
        int centimetros;
        int decimetros;
        int mili=0;
        
        metros =(int)milimetros/1000;
        centimetros = (int) ((milimetros/100)%10)*100;
        decimetros = (int) ((milimetros%100)/10)*10;
        mili = (int)(milimetros%10);        
        
        System.out.println("Metros: "+metros+", Centimetros; "+centimetros);
        System.out.println("Decimetros: "+decimetros+", milimetros: "+mili);
    }
    
    
    public void formula1(){
        double a,b;
        System.out.println("Ingrese a y b: ");
        a = sc().nextInt();
        b = sc().nextInt();
        
        double n1,n2,n3,n4,n5;
        double c,d;        
        n1 = (4* Math.pow(a, 2));
        n2 = (3*(a*b));
        n3 = (Math.pow(b, 2));
        n4 = (Math.pow(a, 2)-Math.pow(b, 2));
        n5 = (n1+n2+n3);
        c = n5/n4;        
        System.out.println("C vale: "+c);    
        
        double n6,n7,n8;
        n6 = (int)(3*Math.pow(c,2));
        n7 = (a+b);
        d = (n6+n7)/4;
        
        System.out.println("D vale: "+d);
    }
    
    
    public void tres(){
        double a,b,c,d;
        System.out.println("Ingrese los cuatro numeros: ");
        a = sc().nextDouble();
        b = sc().nextDouble();
        c = sc().nextDouble();
        d = sc().nextDouble();
        
        double pa = 0;
        double pb = 0;
        double pc = 0;
        double pd = 0;
                        
        double suma = a+b+c+d;
        int n=100;
        pa = (a*n)/suma;
        pb = (b*n)/suma;
        pc = (c*n)/suma;
        pd = (d*n)/suma;
        System.out.println("El cienpociento es "+suma);
        System.out.println("pa: "+pa+"%"+", pb: "+pb+"%"+", pc: "+pc+"%"+", pd: "+pd+"%");
        
    }
    
    
    public void cuatro(){
        int horas;
        System.out.println("INgrese las horas respectivas: ");
        horas = sc().nextInt();
        
        int min;
        int seg;
        
        min =(int)horas*60;
        seg =min*60;
        System.out.println("Equivalencia de "+horas+" horas");
        System.out.println("minutos: "+min);
        System.out.println("Segundos: "+seg);
        
    }
    
    public void cinco(double f){
        double c;
        double uno;
        uno = (f-32)*5;
        c = uno/9;
        System.out.println("Grados Fahrenheit: "+f+", equivale en "
                + "celsius a: "+c);
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        Ejercicio03 ej = new Ejercicio03();
            //ej.expresion();
            //ej.formula1();
            //ej.tres();
            //ej.cuatro();
            ej.cinco(4);
    }
    
}
