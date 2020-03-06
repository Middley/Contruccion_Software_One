/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class DialogObjetos extends JFrame {
    public DialogObjetos() {

      String[] cursos = { "Java", "C++",
"PHP" };
int response = JOptionPane.showOptionDialog(null,
"¿Qué Curso sigues?",
"Cursos",
0,
JOptionPane.INFORMATION_MESSAGE,
null,
cursos,
cursos[2]);
    }

    public static void main(String[] arguments) {
        

        DialogObjetos dialog = new DialogObjetos();
    }
    }