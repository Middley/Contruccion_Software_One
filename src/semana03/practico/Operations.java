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
public class Operations {
    
    private int number1,number2;
    
    public Operations(int num1,int num2){
        this.number1 = num1;
        this.number2 = num2;
    }
    
    public void setNumber1(int number){
        this.number1 = number;
    }
    
    public int getNumber1(){
        return number1;
    }
    
    public void setNumber2(int number){
        this.number2 = number;
    }
    
    public int getNumber2(){
        return number2;
    }
    
    public int calculateSum(){//calcular suma
        return number1+number2;
    }
    
    public int calculateSubtraction(){// calcular resta
        return number1-number2;
    }
    
    public int calculateMultiplication(){// calcular multiplicacion
        return number1*number2;
    }
    
    public double calculateDivision(){
        return (double)number1/number2;
    }
    
    public String printResults(){
        return "Sum: "+calculateSum()+"\nSubtraction: "+calculateSubtraction()+
                "\nMultiplication: "+calculateMultiplication()+"\nDivision: "+calculateDivision();
    }
    
    public static void main(String[] args) {
        Operations op1 = new Operations(1, 0);
        System.out.println(op1.printResults());
    }
}
