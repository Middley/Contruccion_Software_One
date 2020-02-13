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
public class UsoOrdenador {
    
    public static void main(String[] args) {
    CPU cpu = new CPU();
    cpu.capacidad = 1000;
    
    Pantalla pantalla = new Pantalla();    
    pantalla.resolucion1 = 1600;
    pantalla.resolucion2 = 900;
    
    Teclado teclado = new Teclado();
    teclado.tipo = "mecanico";
    
    Raton raton = new Raton();
    raton.sensibilidad = 200;
    
    ordenador ordenador1 = new ordenador(cpu, pantalla, teclado, raton);
        System.out.println(ordenador1.toString());
    }
}


class ordenador{
    
    CPU cpu;
    Pantalla pantalla;
    Teclado teclado;
    Raton raton;
    
    public ordenador(CPU c,Pantalla p,Teclado t, Raton r){
        this.cpu = c;
        this.pantalla = p;
        this.teclado = t;
        this.raton = r;
    }

    @Override
    public String toString() {
        return "ordenador{" + "CPU Capacidad= " + cpu.capacidad+" TB" + "\npantalla Resolucion= " + pantalla.resolucion1+"x" +pantalla.resolucion2+ 
                ",\nteclado Tipo= " + teclado.tipo + ",\nraton Sensibilidad= " + raton.sensibilidad + '}';
    }
    
    
}

class CPU{
    long capacidad;    
}

class Pantalla{
    int resolucion1;
    int resolucion2;
}

class Teclado{
    String tipo;
}

class Raton{
    int sensibilidad;
}

    
