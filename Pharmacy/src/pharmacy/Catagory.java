/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author STUDENT
 */
public class Catagory extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public Catagory() {
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

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton7.setText("Diabetes");

        jButton8.setText("Cholesterol");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setText("Psycology");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(571, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, -1));

        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_feature-mental-health-services.png"))); // NOI18N
        Button2.setText("Psychology");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 120));

        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Healthcare-Diabetes-Monitor-icon.png"))); // NOI18N
        Button3.setText("Diabetes");
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, 120));

        Button4.setText("Cholesterol");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, 120));

        Button5.setText("Vitamins");
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, 120));

        Button9.setText("Anty-biotics");
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 190, 120));

        Button10.setText("Waxins");
        getContentPane().add(Button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 190, 120));

        Button11.setText("Pain Killers");
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        getContentPane().add(Button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 190, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catagory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button9;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
