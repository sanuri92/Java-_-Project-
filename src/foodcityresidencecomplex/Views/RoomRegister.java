/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcityresidencecomplex.Views;

import javax.swing.JOptionPane;

/**
 *
 * @author Sanuri Isara
 */
public class RoomRegister extends javax.swing.JFrame {

    /**
     * Creates new form RoomRegister
     */
    public RoomRegister() {
        initComponents();
    }
 
       public String itemRtn(){
           String s1=txtFloor.getText();
       int count=cmbFloor.getItemCount();
       String s = null;
        for (int i = 0; i < count; i++) {
            s=cmbFloor.getItemAt(i).toString();
           
       
        }
         return s;
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFloor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAppartmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtBeds = new javax.swing.JTextField();
        cmbFloor = new javax.swing.JComboBox();
        cmbApartment = new javax.swing.JComboBox();
        cmdRoomNo = new javax.swing.JComboBox();
        cmbNoBeds = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddBed = new javax.swing.JButton();
        AddFloor = new javax.swing.JButton();
        addAppart = new javax.swing.JButton();
        AddRoom = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Registration");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 460, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/System-Home-icon2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 125));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Room ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 153, 163, 27));

        txtrid.setEditable(false);
        txtrid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 240, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Add New No of Beds");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 130, 27));
        getContentPane().add(txtFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 130, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apartment");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 243, 163, 27));
        getContentPane().add(txtAppartmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 130, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Room No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 163, 20));
        getContentPane().add(txtRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 130, 27));

        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/download-database-icon.png"))); // NOI18N
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 80, 80));

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/Icons_respaldo.png"))); // NOI18N
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 80, 80));

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/remove-from-database-icon.png"))); // NOI18N
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 80, 80));

        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/user-database-icon-search.png"))); // NOI18N
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 80, 80));

        btnhome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanuri Isara\\Documents\\NetBeansProjects\\FoodCityResidenceComplex\\Resourses\\ICON\\System-Home-icon - Copy - Copy.png")); // NOI18N
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 80, 80));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/exit-icon-2.png"))); // NOI18N
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 80, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("No of Total Beads");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 163, 27));
        getContentPane().add(txtBeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 130, 27));

        cmbFloor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbFloor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6" }));
        getContentPane().add(cmbFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 240, 29));

        cmbApartment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbApartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        getContentPane().add(cmbApartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 240, 29));

        cmdRoomNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdRoomNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        cmdRoomNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmdRoomNoFocusLost(evt);
            }
        });
        getContentPane().add(cmdRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 240, 29));

        cmbNoBeds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbNoBeds.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(cmbNoBeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 240, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Floor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 198, 163, 27));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Add New Floor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 130, 27));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Add New Apartment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 130, 27));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Add New RoomNo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 130, 27));

        AddBed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/698913-icon-81-document-add-1282.png"))); // NOI18N
        getContentPane().add(AddBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 30, 30));

        AddFloor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/698913-icon-81-document-add-1282.png"))); // NOI18N
        AddFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFloorActionPerformed(evt);
            }
        });
        getContentPane().add(AddFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 30, 30));

        addAppart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/698913-icon-81-document-add-1282.png"))); // NOI18N
        getContentPane().add(addAppart, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 30, 30));

        AddRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodcityresidencecomplex/Views/src/698913-icon-81-document-add-1282.png"))); // NOI18N
        getContentPane().add(AddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 30, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanuri Isara\\Documents\\NetBeansProjects\\FoodCityResidenceComplex\\Resourses\\ICON\\Light-Pink-Background.jpg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRoomNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmdRoomNoFocusLost
       
        try {
            String floor=cmbFloor.getSelectedItem().toString();
            String appartment=cmbApartment.getSelectedItem().toString();
            String roomno=cmdRoomNo.getSelectedItem().toString();
            txtrid.setText(floor+""+appartment+"-"+roomno);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdRoomNoFocusLost

    private void AddFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFloorActionPerformed
      
         if (s.equals(s1)) {
                JOptionPane.showMessageDialog(RoomRegister.this,"That Floor no is already exsist");
                
            }else{
             cmbFloor.addItem(s1);
            }
    
        
       
        
    }//GEN-LAST:event_AddFloorActionPerformed

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
            java.util.logging.Logger.getLogger(RoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBed;
    private javax.swing.JButton AddFloor;
    private javax.swing.JButton AddRoom;
    private javax.swing.JButton addAppart;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbApartment;
    private javax.swing.JComboBox cmbFloor;
    private javax.swing.JComboBox cmbNoBeds;
    private javax.swing.JComboBox cmdRoomNo;
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
    private javax.swing.JTextField txtAppartmt;
    private javax.swing.JTextField txtBeds;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtrid;
    // End of variables declaration//GEN-END:variables
}
