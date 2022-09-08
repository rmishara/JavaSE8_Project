
package pharmacy;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Item extends javax.swing.JFrame {

    
    public Item() {
        initComponents();
        RadioItem.add(RadioPill);
        RadioItem.add(RadioWaxin);
        RadioItem.add(RadioCream);
        RadioItem.add(RadioSyrup);
        
        RadioPill.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioItem = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        itemid = new javax.swing.JTextField();
        reg = new javax.swing.JTextField();
        itemname = new javax.swing.JTextField();
        RadioSyrup = new javax.swing.JRadioButton();
        RadioPill = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Strength = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        pack = new javax.swing.JTextField();
        brandname = new javax.swing.JTextField();
        Button6 = new javax.swing.JButton();
        RadioWaxin = new javax.swing.JRadioButton();
        RadioCream = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 1024));
        setMinimumSize(new java.awt.Dimension(1280, 1024));
        setPreferredSize(new java.awt.Dimension(1280, 1024));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-icon.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 100, -1));

        jLabel7.setFont(new java.awt.Font("Stencil Std", 0, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Drug-basket-icon.png"))); // NOI18N
        jLabel7.setText("      Items");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 300, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_download.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 70, 50));

        itemid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(itemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 270, 30));

        reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 270, 30));

        itemname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnameActionPerformed(evt);
            }
        });
        getContentPane().add(itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, 30));

        RadioSyrup.setBackground(new java.awt.Color(255, 255, 255));
        RadioSyrup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioSyrup.setText("Syrup");
        getContentPane().add(RadioSyrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 80, 30));

        RadioPill.setBackground(new java.awt.Color(255, 255, 255));
        RadioPill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioPill.setText("Pill");
        RadioPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPillActionPerformed(evt);
            }
        });
        getContentPane().add(RadioPill, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 50, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Catagory");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Brand Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Item ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pack No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 100, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Strength");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 100, 20));

        Strength.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Strength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrengthActionPerformed(evt);
            }
        });
        getContentPane().add(Strength, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Reg.No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 100, 20));

        CheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox1.setText("I accept Terms and Conditions");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 400, -1));

        pack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        getContentPane().add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 270, 30));

        brandname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brandname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandnameActionPerformed(evt);
            }
        });
        getContentPane().add(brandname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 270, 30));

        Button6.setBackground(new java.awt.Color(255, 255, 255));
        Button6.setText("Back");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 930, 90, 40));

        RadioWaxin.setBackground(new java.awt.Color(255, 255, 255));
        RadioWaxin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioWaxin.setText("Waxin");
        getContentPane().add(RadioWaxin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 70, 30));

        RadioCream.setBackground(new java.awt.Color(255, 255, 255));
        RadioCream.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioCream.setText("Cream");
        RadioCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCreamActionPerformed(evt);
            }
        });
        getContentPane().add(RadioCream, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 70, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 810, 140, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy 2.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Brand Name", "Item ID", "Reg.No", "Catagory", "Pack.No", "Strength"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        Table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Table2KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);
        if (Table2.getColumnModel().getColumnCount() > 0) {
            Table2.getColumnModel().getColumn(0).setResizable(false);
            Table2.getColumnModel().getColumn(1).setResizable(false);
            Table2.getColumnModel().getColumn(2).setResizable(false);
            Table2.getColumnModel().getColumn(3).setResizable(false);
            Table2.getColumnModel().getColumn(4).setResizable(false);
            Table2.getColumnModel().getColumn(5).setResizable(false);
            Table2.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 690, 580));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 200, 30));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 110, 30));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 120, 30));

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 120, 30));

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 260, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/item image.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        
    }//GEN-LAST:event_packActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
     Welcome w = new Welcome();
     w.setVisible(true);
     w.setLocationRelativeTo(null);
     this.dispose();
    }//GEN-LAST:event_Button6ActionPerformed

    private void RadioPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioPillActionPerformed

    private void itemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnameActionPerformed

    private void brandnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandnameActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String catagory = "pill";
int CatagoryValue = 0;
 CatagoryValue = 1;
 CatagoryValue = 2;
 CatagoryValue = 3;

if(RadioPill.isSelected()){
    catagory = "pill";
    CatagoryValue = 0;
}else if(RadioWaxin.isSelected()){
    catagory = "Waxin";
    CatagoryValue = 1;
}else if(RadioCream.isSelected()){
    catagory = "Cream";
    CatagoryValue = 2;
}else if(RadioSyrup.isSelected()){
    catagory = "syrup";
    CatagoryValue = 3;
}

if(itemname.getText().length()>50){
    JOptionPane.showMessageDialog(this,"too long for item name" );
}else if(brandname.getText().length()==0){
    JOptionPane.showMessageDialog(this,"too long for brand name");
}else if(itemid.getText().length()==0){
JOptionPane.showMessageDialog(this,"Invalid catagory");
}else if(pack.getText().length()==0){
    JOptionPane.showMessageDialog(this,"invalid Package Number" );
}else if(reg.getText().length()==0){
JOptionPane.showMessageDialog(this,"Error in reg.No");
}else{
    
    try{
        Conn.Database.getDatabaseConnection();
        PreparedStatement ps = Conn.Database.getDatabaseConnection().prepareStatement("insert into item(BrandName,ItemID,PackNo,RegNo,Catagory,ItemName,strength)value(?,?,?,?,?,?,?)");        
        ps.setString(1,brandname.getText());
        ps.setString(2,itemid.getText());
        ps.setString(3,pack.getText());
        ps.setString(4,reg.getText());
        ps.setInt(5,CatagoryValue);
        ps.setString(6,itemname.getText());
        ps.setString(7,Strength.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this,"item is added" );
    Conn.Database.disconnectDatabase();
    brandname.setText("");
    itemid.setText("");
    pack.setText("");
    reg.setText("");
    RadioPill.setSelected(true);
    itemname.setText("");
    Strength.setText("");
    
    
    
    }catch(HeadlessException|SQLException fx){
    JOptionPane.showMessageDialog(this,"ERRO!!!:\n"+fx );
    }
}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RadioCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCreamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCreamActionPerformed

    private void Table2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table2KeyPressed
        
        
    }//GEN-LAST:event_Table2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         try{
         DefaultTableModel dtm = (DefaultTableModel)Table2.getModel();
         dtm.setRowCount(0);
         
         String catagory;
         
         Conn.Database.getDatabaseConnection();
         PreparedStatement ps3 = Conn.Database.con.prepareStatement("select * from item where BrandName=? OR ItemName LIKE '%"+jTextField1.getText()+"%' ");
         ps3.setString(1,jTextField1.getText());
         
         ResultSet rs3 = ps3.executeQuery();
         while(rs3.next()){
         if(rs3.getInt("catagory")==0){
        catagory = "pill";
        }else if(rs3.getInt("catagory")==1){
        catagory = "Waxin";
        }else if(rs3.getInt("catagory")==2){
        catagory = "Cream";
        }else{
        catagory = "Syrup";
        }
        
        
             
         Object dataRecord[] = {rs3.getString("itemName"),rs3.getString("Brandname"),rs3.getString("itemid"),rs3.getString("RegNo"),catagory,rs3.getString("packNO"),rs3.getString("strength") };
         dtm.addRow(dataRecord);
         }
         if(Table2.getRowCount()<1){
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
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         try{
         DefaultTableModel dtm = (DefaultTableModel)Table2.getModel();
         dtm.setRowCount(0);
         
         String catagory;
         
         Conn.Database.getDatabaseConnection();
         PreparedStatement ps3 = Conn.Database.con.prepareStatement("select * from item where BrandName=? OR ItemName LIKE '%"+jTextField1.getText()+"%' ");
         ps3.setString(1,jTextField1.getText());
         
         ResultSet rs3 = ps3.executeQuery();
         while(rs3.next()){
         if(rs3.getInt("catagory")==0){
        catagory = "pill";
        }else if(rs3.getInt("catagory")==1){
        catagory = "Waxin";
        }else if(rs3.getInt("catagory")==2){
        catagory = "Cream";
        }else{
        catagory = "Syrup";
        }
        
        
             
         Object dataRecord[] = {rs3.getString("itemName"),rs3.getString("Brandname"),rs3.getString("itemid"),rs3.getString("RegNo"),catagory,rs3.getString("packNO"),rs3.getString("strength") };
         dtm.addRow(dataRecord);
         }
         if(Table2.getRowCount()<1){
            JOptionPane.showMessageDialog(this, "No Search Result Found !");
         }
         Conn.Database.disconnectDatabase();
         
         
         }
         catch(HeadlessException x){
         JOptionPane.showMessageDialog(this,"Error:\n"+x);
         }catch(SQLException ex){
         JOptionPane.showMessageDialog(this,"Error in SQL:\n"+ex);
         }
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(itemid.getText().length()<1){
           JOptionPane.showMessageDialog(this,"Recorde is not selected" );
       }else{
       try{
           int catagory = 0;
       Conn.Database.getDatabaseConnection();
       PreparedStatement ps3 = Conn.Database.con.prepareStatement("update item set BrandName=?,ItemName=?,RegNO=?,PackNo=?,Catagory,strength=? where ItemID=?");
       ps3.setString(1,brandname.getText());
       ps3.setString(2,itemname.getText());
       ps3.setString(3, reg.getText());
       ps3.setString(4, pack.getText());
       ps3.setInt(5,catagory);
       ps3.setString(6,Strength.getText());
       ps3.setString(7,itemid.getText());
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
int SelectedRow = Table2.getSelectedRow();
itemname.setText(Table2.getValueAt(SelectedRow,0).toString());
brandname.setText(Table2.getValueAt(SelectedRow,1).toString());
itemid.setText(Table2.getValueAt(SelectedRow,2).toString());
reg.setText(Table2.getValueAt(SelectedRow,3).toString());
if(Table2.getValueAt(SelectedRow,4).toString().equals("pill")){
RadioPill.setSelected(true);
}else if(Table2.getValueAt(SelectedRow,4).toString().equals("Waxin")){
RadioWaxin.setSelected(true);
}else if(Table2.getValueAt(SelectedRow,4).toString().equals("Cream")){
RadioCream.setSelected(true);
}else{
RadioSyrup.setSelected(true);
}
pack.setText(Table2.getValueAt(SelectedRow,5).toString());
Strength.setText(Table2.getValueAt(SelectedRow,6).toString());
    }//GEN-LAST:event_Table2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(itemid.getText().length()<1){
            JOptionPane.showMessageDialog(this, "Record is not selected");
        
        }else{
        int option = JOptionPane.showConfirmDialog(this,"Are you sure?","Confirm",
        JOptionPane.OK_CANCEL_OPTION);
        
        
        if(option==JOptionPane.YES_OPTION){
        try{
            Conn.Database.getDatabaseConnection();
        
        PreparedStatement ps = Conn.Database.con.prepareStatement("delete from item where ItemID=?");
        ps.setInt(1,Integer.valueOf(itemid.getText()));
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     try{   
        
        DefaultTableModel dtm = (DefaultTableModel)Table2.getModel();
       dtm.setRowCount(0);
       
       String catagory;
       
       Conn.Database.getDatabaseConnection();
       
       PreparedStatement ps2 = Conn.Database.con.prepareStatement("select*from item");
       ResultSet rs3 = ps2.executeQuery();
       
       while(rs3.next()){
         if(rs3.getInt("catagory")==0){
        catagory = "pill";
        }else if(rs3.getInt("catagory")==1){
        catagory = "Waxin";
        }else if(rs3.getInt("catagory")==2){
        catagory = "Cream";
        }else{
        catagory = "Syrup";
        }
       
       Object dataRecord[]={rs3.getString("itemName"),rs3.getString("Brandname"),rs3.getString("itemid"),rs3.getString("RegNo"),catagory,rs3.getString("packNO"),rs3.getString("strength") };
       dtm.addRow(dataRecord);
       }
       if(Table2.getRowCount()<1){
       JOptionPane.showMessageDialog(this,"No Search Result Found!");
       }
       Conn.Database.disconnectDatabase();
     }catch(HeadlessException x){
     JOptionPane.showMessageDialog(this, "Error:\n"+x);
     
     }catch(SQLException ex){
     JOptionPane.showMessageDialog(this,"Error In SQL:\n"+ex);
     }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void StrengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrengthActionPerformed

   
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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button6;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JRadioButton RadioCream;
    private javax.swing.ButtonGroup RadioItem;
    private javax.swing.JRadioButton RadioPill;
    private javax.swing.JRadioButton RadioSyrup;
    private javax.swing.JRadioButton RadioWaxin;
    private javax.swing.JTextField Strength;
    private javax.swing.JTable Table2;
    private javax.swing.JTextField brandname;
    private javax.swing.JTextField itemid;
    private javax.swing.JTextField itemname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pack;
    private javax.swing.JTextField reg;
    // End of variables declaration//GEN-END:variables
}
