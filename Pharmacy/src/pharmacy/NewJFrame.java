package pharmacy;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

   
    public NewJFrame() {
        initComponents();
        radiogender.add(radiomale);
         radiogender.add(radiofemale);
         
         radiomale.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiogender = new javax.swing.ButtonGroup();
        textfield2 = new javax.swing.JTextField();
        textfield3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        textfield5 = new javax.swing.JTextField();
        radiofemale = new javax.swing.JRadioButton();
        radiomale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setFocusCycleRoot(false);
        setForeground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(675, 500));
        setMinimumSize(new java.awt.Dimension(675, 500));
        setPreferredSize(new java.awt.Dimension(675, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield2ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 450, 20));
        getContentPane().add(textfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 450, 20));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 450, 20));

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 450, 20));

        textfield5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield5ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 450, 20));

        radiofemale.setBackground(new java.awt.Color(255, 255, 255));
        radiofemale.setText("Female");
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        radiomale.setBackground(new java.awt.Color(255, 255, 255));
        radiomale.setText("Male");
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        getContentPane().add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel1.setText("Gender*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 20));

        jLabel2.setText("User Name*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 20));

        jLabel3.setText("First Name*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 20));

        jLabel4.setText("Password*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 20));

        jLabel5.setText("Confirm Password*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 20));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 20));

        CheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox1.setText("I accept Terms and Conditions"); // NOI18N
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 230, -1));

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.setText("Register");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, -1));

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.setText("Back");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 90, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("User Management");
        jButton2.setToolTipText("");
        jButton2.setFocusCycleRoot(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 204, 204));
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTextPane1.setText("              New Registrations Here");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
       
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.dispose();
        
        
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
     String gender = "Male";
     int genderValue = 1;
     
     if(radiofemale.isSelected()){
         gender = "Female";
         genderValue = 0 ;
     }
     else if(radiomale.isSelected()){
         gender= "Male";
         genderValue = 0;
         
     }
     
     if(textfield5.getText().length()<5){
         JOptionPane.showMessageDialog(this,"User name characters must be more than 5");
     }else if(textfield2.getText().length()==0){
         JOptionPane.showMessageDialog(this,"First name must include");
     }else if(jPasswordField2.getText().length()<=7){
         JOptionPane.showMessageDialog(this,"password must be at least 8 characters");
         
     }else if(CheckBox1.isSelected()==false){
         JOptionPane.showMessageDialog(this,"You have to accept terms and conditons");
         
     } else  if(!jPasswordField2.getText().equals(jPasswordField1.getText())){
         JOptionPane.showMessageDialog(this,"password is not matching");
     }
     else{
         
         try{
         
        
            Conn.Database.getDatabaseConnection();
            PreparedStatement ps =Conn.Database.getDatabaseConnection().prepareStatement ("insert into user(UserName,Password,FirstName,Email,RecordDate,Gender) values(?,?,?,?,CURRENT_DATE,?)");
            ps.setString(1,textfield5.getText());
            ps.setString(2,jPasswordField1.getText());
            ps.setString(3,textfield2.getText());
            ps.setString(4,textfield3.getText());
            ps.setInt(5,genderValue);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Registered");
            Conn.Database.disconnectDatabase();
            
         
    }catch(HeadlessException|SQLException ex){
        JOptionPane.showMessageDialog(this,"Error:\n"+ex);
    }
     }
    }//GEN-LAST:event_Button1ActionPerformed

    private void textfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
       
    }//GEN-LAST:event_radiomaleActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
       
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void textfield5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield5ActionPerformed
       
    }//GEN-LAST:event_textfield5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UserManagement c = new UserManagement();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.ButtonGroup radiogender;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JTextField textfield2;
    private javax.swing.JTextField textfield3;
    private javax.swing.JTextField textfield5;
    // End of variables declaration//GEN-END:variables
}
