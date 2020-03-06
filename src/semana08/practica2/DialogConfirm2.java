/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class DialogConfirm2 extends JFrame {
    public DialogConfirm2() {
        int respuesta = JOptionPane.showConfirmDialog(null,
            "¿Te decides por éste?", "Tú decides", JOptionPane.YES_NO_OPTION);
    }

    public static void main(String[] arguments) {
        DialogConfirm2 dialog = new DialogConfirm2();
    }
    }


