package pharmacy;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JFrame {

    public Stock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        stockid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itemid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sellprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        sector = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(1280, 1024));
        setMinimumSize(new java.awt.Dimension(1280, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_download.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 70, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-icon.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 70));

        jLabel7.setFont(new java.awt.Font("Stencil Std", 0, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/drugstore-icon.png"))); // NOI18N
        jLabel7.setText("          Stocks");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 120));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(225, 408));

        Table1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Stock ID", "Item ID ", "Quantity", "sellprice", "Stock Date", "Sector"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setMaximumSize(new java.awt.Dimension(225, 408));
        Table1.setMinimumSize(new java.awt.Dimension(225, 408));
        Table1.setPreferredSize(new java.awt.Dimension(225, 408));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
            Table1.getColumnModel().getColumn(1).setResizable(false);
            Table1.getColumnModel().getColumn(2).setResizable(false);
            Table1.getColumnModel().getColumn(3).setResizable(false);
            Table1.getColumnModel().getColumn(4).setResizable(false);
            Table1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1250, 440));

        stockid.setEditable(false);
        getContentPane().add(stockid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 20));

        itemid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(itemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 30));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 330, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sector");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 20));

        sellprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellpriceActionPerformed(evt);
            }
        });
        getContentPane().add(sellprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 140, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Stock Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 80, 20));

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setMaximumSize(new java.awt.Dimension(85, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(85, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(85, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 150, 30));

        Button3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button3.setText("Delete");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 100, 30));

        Button4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button4.setText("Update");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 90, 30));

        Button5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button5.setText("Add");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 90, 30));

        Button6.setBackground(new java.awt.Color(255, 255, 255));
        Button6.setText("Back");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 930, 90, 40));

        jDateChooser1.setDateFormatString("dd/MM/yyyy"); // NOI18N
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135785723000L));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 140, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("or");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 20, 20));

        sector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(sector, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 140, 20));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, 160));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Selling Price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 90, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy 2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NHS-medicines2 (Copy).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, -1, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
 if(Search.getText().length()==0){
 JOptionPane.showMessageDialog(this, "Pleace insert text to search");
 }else{
         try{
         DefaultTableModel dtm = (DefaultTableModel)Table1.getModel();
         dtm.setRowCount(0);
         
         Conn.Database.getDatabaseConnection();
         PreparedStatement ps2 = Conn.Database.con.prepareStatement("select * from stock where StockID=? OR ItemID LIKE '%"+Search.getText()+"%' ");
         ps2.setString(1,Search.getText());
         
         ResultSet rs1 = ps2.executeQuery();
         while(rs1.next()){
         Object dataRecord[] = {rs1.getString("stockid"),rs1.getString("itemid"),rs1.getString("quantity"),rs1.getString("sellprice"),rs1.getString("stockdate"),rs1.getString("sector") };
         dtm.addRow(dataRecord);
         }
         if(Table1.getRowCount()<1){
            JOptionPane.showMessageDialog(this, "No Search Result Found !");
         }
         Conn.Database.disconnectDatabase();
         
         
         }
         catch(HeadlessException x){
         JOptionPane.showMessageDialog(this,"Error:\n"+x);
         }catch(SQLException ex){
         JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
         
       } 
 }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if(stockid.getText().length()<1){
            JOptionPane.showMessageDialog(this, "Record is not selected");
        
        }else{
        int option = JOptionPane.showConfirmDialog(this,"Are you sure?","Confirm",
        JOptionPane.OK_CANCEL_OPTION);
        
        
        if(option==JOptionPane.YES_OPTION){
        try{
            Conn.Database.getDatabaseConnection();
        
        PreparedStatement ps = Conn.Database.con.prepareStatement("delete from stock where StockID=?");
        ps.setInt(1,Integer.valueOf(stockid.getText()));
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(this,"Record Deleted successfully !");
        Conn.Database.disconnectDatabase();
        }catch(HeadlessException x){
        JOptionPane.showMessageDialog(this,"Error:\n"+x);
        
        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(this,"Error IN SQL:\n"+ex);
        }
        
        }else{
        
        JOptionPane.showMessageDialog(this,"Record NOT Deleted !");
                }
        
        }
        
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
       if(stockid.getText().length()<1){
           JOptionPane.showMessageDialog(this,"Recorde is not selected" );
       }else{
       try{
       Conn.Database.getDatabaseConnection();
       PreparedStatement ps3 = Conn.Database.con.prepareStatement("update stock set itemid=?,quantity=?,sector=?,sellprice=? where StockID=?");
       ps3.setString(1,itemid.getText());
       ps3.setString(2,quantity.getText());
       ps3.setString(3, sector.getText());
       ps3.setString(4, sellprice.getText());
       ps3.setString(5,stockid.getText());
       ps3.executeUpdate();
       JOptionPane.showMessageDialog(this,"Record Update Successfully !");
       Conn.Database.disconnectDatabase();
       }
       catch(HeadlessException x){
          JOptionPane.showMessageDialog(this,"Error:\n"+x);
          }catch(SQLException ex){
          JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
          }
       } 
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if(itemid.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Item ID is not filled" );
        }else if(quantity.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Pleace add quantity");
        }else if(sellprice.equals(0)){
            JOptionPane.showMessageDialog(this,"Enter the selling price" );
        }else{
        try{
            Conn.Database.getDatabaseConnection();
            PreparedStatement ps2 = Conn.Database.getDatabaseConnection().prepareStatement("insert into stock(ItemID,Quantity,Sector,SellPrice,stockdate)value(?,?,?,?,CURRENT_DATE)");
            ps2.setString(1,itemid.getText());
            ps2.setString(2,quantity.getText());
            ps2.setString(3,sector.getText());
            ps2.setString(4,sellprice.getText());
            ps2.executeUpdate();
            JOptionPane.showMessageDialog(this,"Add was complete");
            Conn.Database.disconnectDatabase();
        
        
        
        }
        catch(HeadlessException|SQLException ex2){
        JOptionPane.showMessageDialog(this,"Error:\n"+ex2);
        }
            
        
        }
        
        
        
    }//GEN-LAST:event_Button5ActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
int SelectedRow = Table1.getSelectedRow();
stockid.setText(Table1.getValueAt(SelectedRow,0).toString());
itemid.setText(Table1.getValueAt(SelectedRow,1).toString());
quantity.setText(Table1.getValueAt(SelectedRow,2).toString());
sellprice.setText(Table1.getValueAt(SelectedRow,3).toString());
sector.setText(Table1.getValueAt(SelectedRow,5).toString());

        
        
    }//GEN-LAST:event_Table1MouseClicked

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         try{
         DefaultTableModel dtm = (DefaultTableModel)Table1.getModel();
         dtm.setRowCount(0);
         
         Conn.Database.getDatabaseConnection();
         PreparedStatement ps2 = Conn.Database.con.prepareStatement("select * from stock where StockID=? OR ItemID LIKE '%"+Search.getText()+"%' ");
         ps2.setString(1,Search.getText());
         
         ResultSet rs1 = ps2.executeQuery();
         while(rs1.next()){
         Object dataRecord[] = {rs1.getString("stockid"),rs1.getString("itemid"),rs1.getString("quantity"),rs1.getString("sellprice"),rs1.getString("stockdate"),rs1.getString("sector") };
         dtm.addRow(dataRecord);
         }
         if(Table1.getRowCount()<1){
            JOptionPane.showMessageDialog(this, "No Search Result Found !");
         }
         Conn.Database.disconnectDatabase();
         
         
         }
         catch(HeadlessException x){
         JOptionPane.showMessageDialog(this,"Error:\n"+x);
         }catch(SQLException ex){
         JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
         }
       } 
        
        
        
    }//GEN-LAST:event_SearchKeyPressed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void sellpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{   
        
        DefaultTableModel dtm = (DefaultTableModel)Table1.getModel();
       dtm.setRowCount(0);
       
       String Gender;
       
       Conn.Database.getDatabaseConnection();
       
       PreparedStatement ps2 = Conn.Database.con.prepareStatement("select*from stock");
       ResultSet rs1 = ps2.executeQuery();
       
       while(rs1.next()){
       
       Object dataRecord[]={rs1.getString("stockid"),rs1.getString("itemid"),rs1.getString("quantity"),rs1.getString("sellprice"),rs1.getString("stockdate"),rs1.getString("sector") };
       dtm.addRow(dataRecord);
       }
       if(Table1.getRowCount()<1){
       JOptionPane.showMessageDialog(this,"No Search Result Found!");
       }
       Conn.Database.disconnectDatabase();
     }catch(HeadlessException x){
     JOptionPane.showMessageDialog(this, "Error:\n"+x);
     
     }catch(SQLException ex){
     JOptionPane.showMessageDialog(this,"Error In SQL:\n"+ex);
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Welcome w = new Welcome();
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Button6ActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField itemid;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField sector;
    private javax.swing.JTextField sellprice;
    private javax.swing.JTextField stockid;
    // End of variables declaration//GEN-END:variables
}
