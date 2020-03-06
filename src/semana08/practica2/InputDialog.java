/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class InputDialog extends JFrame {
    public InputDialog() {

      String respuesta = JOptionPane.showInputDialog(null,
      "Escribe tu nombre:");
    }

    public static void main(String[] arguments) {
        InputDialog dialog = new InputDialog();
    }
    }
