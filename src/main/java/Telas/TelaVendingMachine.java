/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author Aline
 */
public class TelaVendingMachine extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendingMachine
     */
    public TelaVendingMachine() {
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

        textHelp = new javax.swing.JLabel();
        textHelp1 = new javax.swing.JLabel();
        textHelp2 = new javax.swing.JLabel();
        Maquina = new javax.swing.JLabel();
        Carteira = new javax.swing.JLabel();
        btnMoeda1 = new javax.swing.JButton();
        btnNota2 = new javax.swing.JButton();
        btnNota5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textHelp.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp.setForeground(new java.awt.Color(255, 255, 255));
        textHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp.setText("INSERI-LO NA MÁQUINA.");
        textHelp.setToolTipText("");
        getContentPane().add(textHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 60));

        textHelp1.setBackground(new java.awt.Color(255, 255, 255));
        textHelp1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp1.setForeground(new java.awt.Color(255, 255, 255));
        textHelp1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp1.setText("CLIQUE SOBRE UM VALOR");
        textHelp1.setToolTipText("");
        getContentPane().add(textHelp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 510, 60));

        textHelp2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textHelp2.setForeground(new java.awt.Color(255, 255, 255));
        textHelp2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textHelp2.setText("DA SUA CARTEIRA PARA");
        textHelp2.setToolTipText("");
        getContentPane().add(textHelp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 520, 60));

        Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/maquina_vazia_fechado.png"))); // NOI18N
        Maquina.setPreferredSize(new java.awt.Dimension(550, 780));
        getContentPane().add(Maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        Carteira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Carteira.png"))); // NOI18N
        getContentPane().add(Carteira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 490, 420));

        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1real.png"))); // NOI18N
        btnMoeda1.setContentAreaFilled(false);
        btnMoeda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoeda1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoeda1MouseExited(evt);
            }
        });
        btnMoeda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoeda1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoeda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 210, 230));

        btnNota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2reais.jpg"))); // NOI18N
        btnNota2.setBorder(null);
        btnNota2.setContentAreaFilled(false);
        btnNota2.setPreferredSize(new java.awt.Dimension(190, 360));
        btnNota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNota2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNota2MouseExited(evt);
            }
        });
        btnNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 200, -1));

        btnNota5.setBackground(new java.awt.Color(255, 255, 255));
        btnNota5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5reais.jpg"))); // NOI18N
        btnNota5.setContentAreaFilled(false);
        btnNota5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNota5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNota5MouseExited(evt);
            }
        });
        btnNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 360));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BackgroundVendingMachine.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNota5ActionPerformed

    private void btnNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNota2ActionPerformed

    private void btnMoeda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoeda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoeda1ActionPerformed

    private void btnNota5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota5MouseEntered
        btnNota5.setOpaque(true);
    }//GEN-LAST:event_btnNota5MouseEntered

    private void btnNota5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota5MouseExited
        btnNota5.setOpaque(false);
    }//GEN-LAST:event_btnNota5MouseExited

    private void btnNota2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota2MouseEntered
        btnNota2.setOpaque(true);
    }//GEN-LAST:event_btnNota2MouseEntered

    private void btnNota2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNota2MouseExited
        btnNota2.setOpaque(false);
    }//GEN-LAST:event_btnNota2MouseExited

    private void btnMoeda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoeda1MouseEntered
        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1realHover.png")));
    }//GEN-LAST:event_btnMoeda1MouseEntered

    private void btnMoeda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoeda1MouseExited
        btnMoeda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1real.png")));
    }//GEN-LAST:event_btnMoeda1MouseExited

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
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Carteira;
    private javax.swing.JLabel Maquina;
    private javax.swing.JButton btnMoeda1;
    private javax.swing.JButton btnNota2;
    private javax.swing.JButton btnNota5;
    private javax.swing.JLabel textHelp;
    private javax.swing.JLabel textHelp1;
    private javax.swing.JLabel textHelp2;
    // End of variables declaration//GEN-END:variables
}
