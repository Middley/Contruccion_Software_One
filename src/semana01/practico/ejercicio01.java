package semana01.practico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio01 {
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        //1
        System.out.print("INgrese su nombre:"); 
        String name;
        name = sc.nextLine();
        System.out.println("Hola "+name);
        
        //2
        System.out.println("INgrese dos numeros");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int suma = a+b;
        System.out.println("la suma es: "+suma);
        //3
        
        System.out.println("Ingrese su nombre: ");
        String n = bf.readLine();
        System.out.println("hola "+n);
        
        
        //4
        System.out.println("Ingrese los dos numeros");
        suma=0;
        a=0;
        b=0;
        a = Integer.parseInt(bf.readLine());
        b = Integer.parseInt(bf.readLine());
        suma = a+b;
        System.out.println("La suma es: "+suma);
        
    }
        
}



