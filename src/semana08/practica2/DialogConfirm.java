/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class DialogConfirm extends JFrame {
    public DialogConfirm() {
        int respuesta = JOptionPane.showConfirmDialog(null,
         "Error leyendo archivo. ¿Quieres probar de nuevo?",
         "Error de archivo",
         JOptionPane.YES_NO_OPTION,
         JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] arguments) {
        DialogConfirm dialog = new DialogConfirm();
    }
    }
