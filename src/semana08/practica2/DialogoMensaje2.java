/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.*;

public class DialogoMensaje2 extends JFrame {
    public DialogoMensaje2() {

      JOptionPane.showMessageDialog(null,
      "Existen nuevas actualizaciones.",
      "Aviso Actualizaciones",
      JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
    

  DialogoMensaje2 dialog = new DialogoMensaje2();
}


  
}

