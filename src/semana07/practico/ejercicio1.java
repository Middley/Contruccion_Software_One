/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.practico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio1
     */
    
    ArrayList<Double> numeros = new ArrayList<>();
    int cont=0;
    double promedio = 0.0;
    double suma=0.0;
    
    public ejercicio1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNota = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNotas = new javax.swing.JTextArea();
        lblNNotas = new javax.swing.JLabel();
        lblProm = new javax.swing.JLabel();
        lbNroNotas = new javax.swing.JLabel();
        lblPromedioG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });

        lblNota.setText("Nota:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txaNotas.setColumns(20);
        txaNotas.setRows(5);
        txaNotas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txaNotasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txaNotas);

        lblNNotas.setText("Nro Notas: ");

        lblProm.setText("Promedio: ");

        lbNroNotas.setText("0");

        lblPromedioG.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota)
                                .addGap(18, 18, 18)
                                .addComponent(txtNota))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMostrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNNotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNroNotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProm)
                                .addGap(18, 18, 18)
                                .addComponent(lblPromedioG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNNotas)
                    .addComponent(lblProm)
                    .addComponent(lbNroNotas)
                    .addComponent(lblPromedioG))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:                                
    }//GEN-LAST:event_txtNotaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String cad = "";
               
        try {            
            cad = this.txtNota.getText();
            if(txtNota.getText()!=null){
                if( !txtNota.getText().equals(""))
                    if(!Character.isDigit(Integer.parseInt(txtNota.getText()))){
                        cont++;
                        numeros.add(Double.parseDouble(txtNota.getText()));
                        suma+=Double.parseDouble(txtNota.getText());
                        this.txtNota.setText("");//incicaliza nuevamente la variable
                    }else{
                        
                    }
                                
                                
        }else{
            JOptionPane.showMessageDialog(null,"No es un numero!");
        }
        
        this.txtNota.setText("");//incicaliza nuevamente la variable
        this.txtNota.requestFocus();
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        String mostrar="";
        for(Double d: numeros)
            mostrar+=d+"\n";
            
        for(int i=0;i<numeros.size();i++){
            this.txaNotas.setText(mostrar);
        }
        promedio = suma/cont;
        this.lbNroNotas.setText(""+cont);
        this.lblPromedioG.setText(""+promedio);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void txaNotasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txaNotasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txaNotasAncestorAdded
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNroNotas;
    private javax.swing.JLabel lblNNotas;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblProm;
    private javax.swing.JLabel lblPromedioG;
    private javax.swing.JTextArea txaNotas;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
