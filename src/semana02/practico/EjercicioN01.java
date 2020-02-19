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
public class EjercicioN01 {
    
        
    
    
    public static void main(String[] args) {
        
        suma s = new suma();
        Multiplicacion multi = new Multiplicacion();
        Division div= new Division();
                
        s.Asignar(2, 3);
        System.out.println("Suma es: "+s.calcularSuma());
        
        multi.Asignar(2, 3);
        System.out.println("Multiplicacion es: "+multi.calcularMulti());
        
        div.Asignar(2, 3);
        System.out.println("Division es: "+div.calcularDiv());
        
    }

}


class suma{
    
    private int num1;
    private int num2;
            
    public void Asignar(int num,int num2){
        num1 = num;
        this.num2 = num2;
    }        
        
    
    public int calcularSuma(){
        return num1+num2;
    }
    
    
    
}
class Multiplicacion{
    
    private int num1;
    private int num2;
            
    public void Asignar(int num,int num2){
        num1 = num;
        this.num2 = num2;
    }        
        
    
    public int calcularMulti(){
        return num1*num2;
    }
            
}

class Division{
    
    private int num1;
    private int num2;
    
    
    public void Asignar(int num,int num2){
        num1 = num;
        this.num2 = num2;
    }        
    
    public double calcularDiv(){
        return (double)num1*num2;
    }

    
    
    
    
            
}