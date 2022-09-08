
package small.library;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NewMember extends javax.swing.JFrame {

    
    public NewMember() {
        initComponents();
        Radiogender.add(radiomale);
        Radiogender.add(radiofemale);
        
        radiomale.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Radiogender = new javax.swing.ButtonGroup();
        jButton8 = new javax.swing.JButton();
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
        textfield4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfield6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textfield7 = new javax.swing.JTextField();
        textfield8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 980, 100, 50));

        textfield2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield2ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 480, 30));

        textfield3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield3ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 480, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 480, 30));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 480, 30));

        textfield5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield5ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 480, 30));

        radiofemale.setBackground(new java.awt.Color(255, 255, 255));
        radiofemale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radiofemale.setText("Female");
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 120, 30));

        radiomale.setBackground(new java.awt.Color(255, 255, 255));
        radiomale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radiomale.setText("Male");
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        getContentPane().add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gender*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 160, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("User Name*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Full Name*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Password*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 160, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Confirm Password*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, 240, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 160, 30));

        textfield4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield4ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 480, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Age*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 160, -1));

        textfield6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield6ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 480, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Phone*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Adress*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, 30));

        textfield7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield7ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 480, 30));

        textfield8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfield8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield8ActionPerformed(evt);
            }
        });
        getContentPane().add(textfield8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 480, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Name with Initials*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 770, 240, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Full Name", "Name with Initials", "Age", "Gender", "Address", "Email", "Phone", "User Name", "Date Added"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Librarian l = new Librarian();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void textfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield2ActionPerformed

    private void textfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void textfield5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield5ActionPerformed

    }//GEN-LAST:event_textfield5ActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed

    }//GEN-LAST:event_radiomaleActionPerformed

    private void textfield4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield4ActionPerformed

    private void textfield6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield6ActionPerformed

    private void textfield7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield7ActionPerformed

    private void textfield8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String gender = "Male";
        int genderValue = 1;
        
        
        if(radiofemale.isSelected()){
        
            gender = "Female";
            genderValue = 0;
            
        }
        else if(radiomale.isSelected()){
        
            gender = "Male";
            genderValue = 1;
            
        }
        
        if(textfield2.getText().length() == 0){
            
            JOptionPane.showMessageDialog(this,"Enter Name");
           
        }
        else if(textfield8.getText().length()==0){
    
        JOptionPane.showMessageDialog(this, "Enter Initials of your name");
        
    }
        else if(textfield4.getText().length()==0){
            
            JOptionPane.showMessageDialog(this, "Age must include");
            
        }   
        else if(textfield7.getText().length() == 0){
                    
             JOptionPane.showMessageDialog(this, "Address must include");         
        
        }
        else if(textfield6.getText().length() == 0){
                    
             JOptionPane.showMessageDialog(this, "Phone nuber must be include");         
        
        }
        else if(textfield5.getText().length()==0){
        
            JOptionPane.showMessageDialog(this, "User Name must include");
        }
        else if(jPasswordField2.getText().length()==0){
        
            JOptionPane.showMessageDialog(this, "Password must be include");
        }
        else if(jPasswordField1.getText().length()==0){
        
            JOptionPane.showMessageDialog(this, "Password agin must be include");
        }
        
        else if(!jPasswordField2.getText().equals(jPasswordField1.getText())){
            
            JOptionPane.showMessageDialog(this, "Passwords are not matching");
        
        }
        
        else if(textfield4.getText().length()==0 || textfield4.getText().length()>3){
            
            JOptionPane.showMessageDialog(this, "Enter Age correctly");
    
        }
        
        else if(textfield6.getText().length()==0 || textfield6.getText().length()>10){
            
            JOptionPane.showMessageDialog(this, "Enter phone number correctly!");
        
        }
        else{
        
            try{
            
                Conn.Database.getDatabaseConnection();
                PreparedStatement ps = Conn.Database.getDatabaseConnection().prepareStatement("insert into user(FullName,Initials,Age,Gender,Address,Email,Phone,UserName,Password,DateRegister) values (?,?,?,?,?,?,?,?,?,CURRENT_DATE)");
                ps.setString(1, textfield2.getText());
                ps.setString(2, textfield8.getText());
                ps.setString(3, textfield4.getText());
                ps.setInt(4, genderValue);
                ps.setString(5, textfield7.getText());
                ps.setString(6, textfield3.getText());
                ps.setString(7, textfield6.getText());
                ps.setString(8, textfield5.getText());
                ps.setString(9,jPasswordField2.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Register complete");
                Conn.Database.disconnectDatabase();
                
                
            }catch(Exception ex){
                
                JOptionPane.showMessageDialog(this,"Error \n" + ex);
            
            }
            
           
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Radiogender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JTextField textfield2;
    private javax.swing.JTextField textfield3;
    private javax.swing.JTextField textfield4;
    private javax.swing.JTextField textfield5;
    private javax.swing.JTextField textfield6;
    private javax.swing.JTextField textfield7;
    private javax.swing.JTextField textfield8;
    // End of variables declaration//GEN-END:variables
}
