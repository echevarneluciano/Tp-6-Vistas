/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.vistas;

import java.io.PrintStream;
import java.util.TreeMap;

/**
 *
 * @author luciano.echevarne
 */
public class Escritorio extends javax.swing.JFrame {
     
    /**
     * Creates new form NewJFrame
     */
    public Escritorio() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Bmenu = new javax.swing.JMenu();
        Bagregar = new javax.swing.JMenuItem();
        Bbuscar = new javax.swing.JMenuItem();
        Bborrar = new javax.swing.JMenuItem();
        Bsalir = new javax.swing.JMenu();
        Bexit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        Bmenu.setText("Menu");

        Bagregar.setText("Agregar Clientes");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });
        Bmenu.add(Bagregar);

        Bbuscar.setText("Buscar Cliente");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        Bmenu.add(Bbuscar);

        Bborrar.setText("Borrar Cliente");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });
        Bmenu.add(Bborrar);

        jMenuBar1.add(Bmenu);

        Bsalir.setText("Salir");
        Bsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsalirMouseClicked(evt);
            }
        });
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        Bexit.setText("Exit");
        Bexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BexitMouseClicked(evt);
            }
        });
        Bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexitActionPerformed(evt);
            }
        });
        Bsalir.add(Bexit);

        jMenuBar1.add(Bsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsalirActionPerformed

    private void BsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsalirMouseClicked
 // TODO add your handling code here:
    }//GEN-LAST:event_BsalirMouseClicked

    private void BexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexitActionPerformed
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_BexitActionPerformed

    private void BexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BexitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BexitMouseClicked

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarClientes c1=new AgregarClientes();   
        c1.setVisible(true);
        escritorio.add(c1);
    }//GEN-LAST:event_BagregarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BuscarCliente c1=new BuscarCliente();   
        c1.setVisible(true);
        escritorio.add(c1);        // TODO add your handling code here:
    }//GEN-LAST:event_BbuscarActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BorrarCliente c1=new BorrarCliente();   
        c1.setVisible(true);
        escritorio.add(c1);        // TODO add your handling code here:
    }//GEN-LAST:event_BborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bagregar;
    private javax.swing.JMenuItem Bborrar;
    private javax.swing.JMenuItem Bbuscar;
    private javax.swing.JMenuItem Bexit;
    private javax.swing.JMenu Bmenu;
    private javax.swing.JMenu Bsalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
