
package pharmacy;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UserManagement extends javax.swing.JFrame {

    
    public UserManagement() {
        initComponents();
        RadioGender.add(radioMale);
        RadioGender.add(radioFemale);
        radioMale.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioGender = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        UserManagement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(582, 580));
        setMinimumSize(new java.awt.Dimension(582, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(582, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 560, 10));

        UserManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserManagement.setText("          UserManagement");
        getContentPane().add(UserManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 200, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "UserName", "FirstName", "Record Date", "Gender"
            }
        ));
        Table.setFocusCycleRoot(true);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 560, 190));

        jLabel1.setText("Search User:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSearchKeyPressed(evt);
            }
        });
        getContentPane().add(textSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 470, -1));

        jLabel2.setText("User ID: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        getContentPane().add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 160, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 160, -1));

        jLabel4.setText("Gender:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jLabel5.setText("First Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jButton1.setText("Clear All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 340, 20));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 40));

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 200, 40));

        jButton4.setText("Refresh Table Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 340, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 440, 0));

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Delete" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });
        getContentPane().add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         if(txtUserID.getText().length()<1){
          JOptionPane.showMessageDialog(this,"Record NOT Selected");
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
              PreparedStatement ps = Conn.Database.con.prepareStatement("update user set FirstName=?,Gender=? where UserID=?");
              ps.setString(1,txtFirstName.getText());
              ps.setInt(2,Gender);
              ps.setInt(3,Integer.valueOf(txtUserID.getText()));
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
       DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
       dtm.setRowCount(0);
       
       textSearch.setText("");
       txtUserID.setText("");
       txtFirstName.setText("");
       radioMale.setSelected(true);
       Combo.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
       
    }//GEN-LAST:event_textSearchActionPerformed

    private void textSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyPressed
       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try{
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
        dtm.setRowCount(0);
        
        String Gender;
        
        Conn.Database.getDatabaseConnection();
        
        PreparedStatement ps = Conn.Database.con.prepareStatement("select * from user where UserID=? OR UserName LIKE '%"+textSearch.getText()+"%' OR FirstName LIKE '%"+textSearch.getText()+"%'");
        ps.setString(1,textSearch.getText());
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
        if(rs.getInt("Gender")==1){
        Gender = "Male";
        }else{
        Gender = "Female";
        }
        Object dataRecord[] = {rs.getString("userID"),rs.getString("UserName"),rs.getString("FirstName"),rs.getString("RecordDate"),Gender};
        dtm.addRow(dataRecord);
        }
        
        if(Table.getRowCount()<1){
            JOptionPane.showMessageDialog(this, "No Search Result Found !");
        }
        
        Conn.Database.disconnectDatabase();
        
        }catch(HeadlessException x){
            JOptionPane.showMessageDialog(this,"Error:\n"+x);
        
        }catch(SQLException ex){
        
            JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
            
        }   
       }
    }//GEN-LAST:event_textSearchKeyPressed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        if(txtUserID.getText().length()<1){
        JOptionPane.showMessageDialog(this,"Record NOT selected");
        
        }else{
        int option = JOptionPane.showConfirmDialog(this,"Are you sure?","Confirm",
        JOptionPane.OK_CANCEL_OPTION);
            
        if(option==JOptionPane.YES_OPTION){
        
        try{
        Conn.Database.getDatabaseConnection();
        
        PreparedStatement ps = Conn.Database.con.prepareStatement("delete from user where UserID=?");
        ps.setInt(1,Integer.valueOf(txtUserID.getText()));
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

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
int SelectedRow = Table.getSelectedRow();
txtUserID.setText(Table.getValueAt(SelectedRow,0).toString());
txtFirstName.setText(Table.getValueAt(SelectedRow,2).toString());

if(Table.getValueAt(SelectedRow,3).toString().equals("Male")){
radioMale.setSelected(true);
}
else if(Table.getValueAt(SelectedRow,3).toString().equals("Female")){
radioFemale.setSelected(true);
}
Combo.setSelectedItem(Table.getValueAt(SelectedRow,5));
        
    }//GEN-LAST:event_TableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
     try{   
        
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
       dtm.setRowCount(0);
       
       String Gender;
       
       Conn.Database.getDatabaseConnection();
       
       PreparedStatement ps = Conn.Database.con.prepareStatement("select*from user");
       ResultSet rs = ps.executeQuery();
       
       while(rs.next()){
       if(rs.getInt("Gender")==1){
       Gender = "Male";
       }else{
           Gender = "Female";
       }
       Object dataRecord[]={rs.getString("UserID"),rs.getString("UserName"),rs.getString("FirstName"),Gender,rs.getString("RecordDate"),rs.getString("Status")};
       dtm.addRow(dataRecord);
       }
       if(Table.getRowCount()<1){
       JOptionPane.showMessageDialog(this,"No Search Result Found!");
       }
       Conn.Database.disconnectDatabase();
     }catch(HeadlessException x){
     JOptionPane.showMessageDialog(this, "Error:\n"+x);
     
     }catch(SQLException ex){
     JOptionPane.showMessageDialog(this,"Error In SQL:\n"+ex);
     }
       
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.ButtonGroup RadioGender;
    private javax.swing.JTable Table;
    private javax.swing.JLabel UserManagement;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
