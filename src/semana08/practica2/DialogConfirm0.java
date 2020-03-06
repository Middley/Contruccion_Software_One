/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class DialogConfirm0 extends JFrame {
    public DialogConfirm0() {
        int respuesta = JOptionPane.showConfirmDialog(null,
        "¿Estás seguro que quieres borrar este archivo?");
    }

    public static void main(String[] arguments) {
        DialogConfirm0 dialog = new DialogConfirm0();
    }
    }
