/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.vistas;

import practico.pkg6.clases.Listas;

/**
 *
 * @author luciano.echevarne
 */
public class BorrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BorrarCliente
     */
    public BorrarCliente() {
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

        jLabel2 = new javax.swing.JLabel();
        Blimpiarformulario = new javax.swing.JButton();
        Bingresardatos = new javax.swing.JButton();
        Tdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("DNI:");

        Blimpiarformulario.setText("Limpiar");
        Blimpiarformulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarformularioActionPerformed(evt);
            }
        });

        Bingresardatos.setText("Ingresar");
        Bingresardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BingresardatosActionPerformed(evt);
            }
        });

        Tdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Blimpiarformulario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(Bingresardatos))
                            .addComponent(Tdni)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blimpiarformulario)
                    .addComponent(Bingresardatos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdniActionPerformed

    private void BingresardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BingresardatosActionPerformed
    String dni=Tdni.getText();
    Tdni.setText("");    
    Listas l1=new Listas();
    l1.borrarCliente(dni);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_BingresardatosActionPerformed

    private void BlimpiarformularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarformularioActionPerformed
    Tdni.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_BlimpiarformularioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bingresardatos;
    private javax.swing.JButton Blimpiarformulario;
    private javax.swing.JTextField Tdni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}