/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author STUDENT
 */
public class Myaccount extends javax.swing.JFrame {

    /**
     * Creates new form UserManagement
     */
    public Myaccount() {
        initComponents();
                GenderSelect.add(radioMale);
                GenderSelect.add(radioFemale);
                radioMale.setSelected(true);
        
        
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderSelect = new javax.swing.ButtonGroup();
        UserManagement = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(483, 507));
        setPreferredSize(new java.awt.Dimension(483, 507));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserManagement.setText("            My Account");
        getContentPane().add(UserManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 200, 40));

        jLabel1.setText("User ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });
        UserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserIDKeyPressed(evt);
            }
        });
        getContentPane().add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 370, 20));

        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 370, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 370, -1));

        jLabel4.setText("status:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel5.setText("First Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton1.setText("Clear All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 230, 40));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 40));

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 200, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 440, 0));

        jLabel6.setText("Re- Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 370, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deleted" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel7.setText("Gender:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(!txtPassword1.getText().equals(txtPassword2.getText())){
            JOptionPane.showMessageDialog(this,"Password NOT Matching");
        }else{
          try{
              int Gender = 1;
              
              if(radioMale.isSelected()){
                  Gender=1;
              }
              else if(radioFemale.isSelected()){
              Gender=0;
              }
              
              Conn.Database.getDatabaseConnection();
              PreparedStatement ps = Conn.Database.con.prepareStatement("update user set FirstName=?,Gender=?,Status=?,Password=? where UserID=?");
              ps.setString(1,txtFirstName.getText());
              ps.setInt(2,Gender);
              ps.setString(3,jComboBox1.getSelectedItem().toString());
              ps.setString(4,txtPassword1.getText());
              ps.setInt(5,Pharmacy.MyUserID);
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(this,"Record Update Successfully !");
              Conn.Database.disconnectDatabase();
          }catch(HeadlessException x){
          JOptionPane.showMessageDialog(this,"Error:\n"+x);
          }catch(SQLException ex){
          JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
          }
          
      }    
         
          
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    UserID.setText("");
    txtFirstName.setText("");
    txtPassword1.setText("");
    txtPassword2.setText("");
    radioMale.setSelected(true);
    jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
       
    }//GEN-LAST:event_UserIDActionPerformed

    private void UserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserIDKeyPressed
  
    }//GEN-LAST:event_UserIDKeyPressed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        if(txtPassword1.getText().length()<1){
        JOptionPane.showMessageDialog(this,"Record NOT selected");
        
        }else{
        int option = JOptionPane.showConfirmDialog(this,"Are you sure?","Confirm",
        JOptionPane.OK_CANCEL_OPTION);
            
        if(option==JOptionPane.YES_OPTION){
        
        try{
        Conn.Database.getDatabaseConnection();
        
        PreparedStatement ps = Conn.Database.con.prepareStatement("delete from user where UserID=?");
        ps.setInt(1,Integer.valueOf(txtPassword1.getText()));
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(this,"Record Deleted successfully !");
        Conn.Database.disconnectDatabase();
        }
        catch(HeadlessException x){
        JOptionPane.showMessageDialog(this,"Error:\n"+x);
        
        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(this,"Error IN SQL:\n"+ex);
        }
        
        }else{
        
        JOptionPane.showMessageDialog(this,"Record NOT Deleted !");
                }
        }
        
        
        
        
        
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Myaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Myaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Myaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Myaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Myaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderSelect;
    private javax.swing.JTextField UserID;
    private javax.swing.JLabel UserManagement;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPassword2;
    // End of variables declaration//GEN-END:variables

    private void getData(){
        
                
                String Gender = "Male";
                    int GenderSelect = 1;
     
                    if(radioFemale.isSelected()){
                             Gender = "Female";
                            GenderSelect = 0 ;
                         }
                        else if(radioMale.isSelected()){
                             Gender = "Male";
                             GenderSelect = 0;
                        }
        try{
            PreparedStatement ps =Conn.Database.getDatabaseConnection().prepareStatement ("select * from user where UserID ="+Pharmacy.MyUserID);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                UserID.setText(rs.getString("UserID"));
                txtFirstName.setText(rs.getString("FirstName"));
                
                
            }
            
            Conn.Database.disconnectDatabase();
        
    }catch(HeadlessException|SQLException ex){
        JOptionPane.showMessageDialog(this,"Error:\n"+ex);
    }
    }
}
    
