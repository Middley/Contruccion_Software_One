/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DEYGLIS MIDDLEY
 */


/*
Metodos a probar	|Entrada                 |Salida Esperada
------------------------|------------------------|---------------------
CalcularSalarioNeto	| -1                     | Exeption e
CalcularSalarioNeto	| 1000                   | 840
CalcularSalarioNeto	| -15067.02131           | Excepcion
CalcularSalarioNeto	| 0                      | Excepcion
CalcularSalarioNeto	| 40                     | 40
calcularSalarioBruto	| Vendedor,2000.0,8	 | Excepcion
calcularSalarioBruto	| Encargado,1234.6576,8	 | 1260
calcularSalarioBruto	| Vendedor,1500.0,3	 | 1860
calcularSalarioBruto	| Encargado,2000.0,8.0   | Excepcion
calcularSalarioBruto	| Encargado,000.0,8	 | Excepcion


*/

public class Actividad02Test {
    
    public Actividad02Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculaSalarioBruto method, of class Actividad02.
     */
    @Test
    public void testCalculaSalarioBruto1() {
        System.out.println("----- Pureba Salario Bruto 1 -----");
        double resultadoReal;
        try {
        
        Actividad02 obj = new Actividad02();
        resultadoReal = obj.calculaSalarioBruto("Vendedor", 2000.0,8);        
        double resultadoEsperado = 1360.0;
        assertEquals(resultadoEsperado, resultadoReal);        
        } catch (Exception e) {
            fail("Lanzada excepcion no esperada BRException");
        }
    }

    public void testCalculaSalarioBruto2() {
        System.out.println("----- Prueba Salario Bruto 2 -----");
        Actividad02 obj = new Actividad02();
        double resultadoReal = obj.calculaSalarioBruto(
                "Encargado", 1234.6576,8);
        double resultadoEsperado = 1260.0;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
        if(resultadoEsperado==resultadoReal)
            System.out.println("CORRECTO");
        else
            fail(" SE ESPERABA UNA IGUALDAD ");
  }
     
  @Test
  public void testCalculaSalarioBruto3(){
      System.out.println("----- Prueba Salario Bruto 3 -----");
    Actividad02 obj = new Actividad02();
    double resultadoReal = obj.calculaSalarioBruto("Vendedor", 1500.0, 3);
    double resultadoEsperado = 1860.0;
    assertEquals(resultadoEsperado, resultadoReal);
    if(resultadoEsperado==resultadoReal)
            System.out.println("CORRECTO");
        else
            fail(" SE ESPERABA UNA IGUALDAD ");
    }
    
    
  public void testCalculaSalarioBruto4() {
        System.out.println("----- Pureba Salario Bruto 4 -----");
        double resultadoReal;
        try {
        
        Actividad02 obj = new Actividad02();
        resultadoReal = obj.calculaSalarioBruto("Encargado", 2000.0, (int) 8.0);        
        double resultadoEsperado = 1360.0;
        assertEquals(resultadoEsperado, resultadoReal);        
        } catch (Exception e) {
            fail("Lanzada excepcion no esperada Exception");
        }
    }
  
  public void testCalculaSalarioBruto5() {
        System.out.println("----- Pureba Salario Bruto 5 -----");
        double resultadoReal;
        try {
        
        Actividad02 obj = new Actividad02();
        resultadoReal = obj.calculaSalarioBruto("Encargado",000.0,8);        
        double resultadoEsperado = 1460.0;
        assertEquals(resultadoEsperado, resultadoReal);        
        } catch (Exception e) {
            fail("Lanzada excepcion no esperada Exception");
        }
    }
  
    /**
     * Test of calculaSalarioNeto method, of class Actividad02.
     */                    
    @Test
    public void testCalculaSalarioNeto1() {
        System.out.println("----- Prueba 1: sueldo Neto ------");
        
        try {
            Actividad02 obj = new Actividad02();
            double b = obj.calculaSalarioNeto(-1.0);                            
            fail("Se espera una Excepcion");
        } catch (RuntimeException e) {
            System.out.println("Excepcion ");
        }                                                
    }
    
    // --------------------------------------------------------------
    
    @Test
    public void testCalculaSalarioNeto2() {
        System.out.println("----- Prueba 2: sueldo Neto ------");
        
        try {
            Actividad02 obj = new Actividad02();
            double b = obj.calculaSalarioNeto(1000.0);                            
            System.out.println("-- Correcto --");
        } catch (RuntimeException e) {
            fail("--- La operacion 2 debe estar correcta ---");
        }                                                
    }
    
    
    // --------------------------------------------------------------
    
    @Test
    public void testCalculaSalarioNeto3() {
        System.out.println("----- Prueba 3: sueldo Neto ------");        
        try {
            Actividad02 obj = new Actividad02();
            double b = obj.calculaSalarioNeto(-15067.0213124234);
            fail("--- Se esperaba Excepsion ---");            
        } catch (RuntimeException e) {
            System.out.println("-- Excepsion --");
        }                                                
    }
    
    // --------------------------------------------------------------
    
    @Test
    public void testCalculaSalarioNeto4() {
        System.out.println("----- Prueba 4: sueldo Neto ------");
        
        try {
            Actividad02 obj = new Actividad02();
            double b = obj.calculaSalarioNeto(0.0);
            System.out.println("Correcto");
        } catch (Exception e) {
            fail(" --- la operacion debe ser correcta 4 ---");            
        }                                                
    }
    
    // --------------------------------------------------------------
    
    @Test
    public void testCalculaSalarioNeto5() {
        System.out.println("----- Prueba 5: sueldo Neto ------");
        
        try {
            Actividad02 obj = new Actividad02();
            double b = obj.calculaSalarioNeto(40.0);
            System.out.println("-- Correcto --");
        } catch (RuntimeException e) {
            fail("\"--- La operacion 5 debe ser correcta ---\"");            
        }                                                
    }

    /**
     * Test of calculaSalarioBruto method, of class Actividad02.
     */
    @Test
    public void testCalculaSalarioBruto() {
        System.out.println("calculaSalarioBruto");
        String tipo = "";
        double ventas = 0.0;
        int horasEx = 0;
        Actividad02 instance = new Actividad02();
        double expResult = 0.0;
        double result = instance.calculaSalarioBruto(tipo, ventas, horasEx);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalarioNeto method, of class Actividad02.
     */
    @Test
    public void testCalculaSalarioNeto() {
        System.out.println("calculaSalarioNeto");
        double salarioBruto = 0.0;
        Actividad02 instance = new Actividad02();
        double expResult = 0.0;
        double result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
