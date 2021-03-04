/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;
import model.SerializationManager;
import model.Customer;

/**
 *
 * @author uzivatel
 */
public class MainScreen extends javax.swing.JFrame {

    ArrayList<Customer> customers;
    
    /**
     * Creates new form mainScreen
     */
    public MainScreen() {
        initComponents();
        customers = SerializationManager.loadCustomers();
        
        String [] customerArray = new String[customers.size()];
        for (int i = 0; i < customers.size(); i++){
            customerArray[i] = customers.get(i).getName();
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(customerArray));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        itemPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addNewButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemButton.setBackground(new java.awt.Color(255, 255, 255));
        itemButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemButton.setForeground(new java.awt.Color(0, 0, 0));
        itemButton.setText("Item");
        itemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(itemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, 60));

        customerButton.setBackground(new java.awt.Color(255, 255, 255));
        customerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerButton.setForeground(new java.awt.Color(0, 0, 0));
        customerButton.setText("Customer");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(customerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 120, 60));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));
        mainPanel.setLayout(new java.awt.CardLayout());

        itemPanel.setBackground(new java.awt.Color(255, 255, 255));
        itemPanel.setForeground(new java.awt.Color(0, 0, 0));
        itemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 51, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("This is item");
        itemPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 270, 150));

        mainPanel.add(itemPanel, "itemPanel");

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setForeground(new java.awt.Color(0, 0, 0));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setBackground(new java.awt.Color(0, 0, 0));
        userTable.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userTable.setRowHeight(35);
        jScrollPane1.setViewportView(userTable);
        JTableHeader tableHeader = userTable.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 24);
        tableHeader.setFont(headerFont);

        userPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 370));

        addNewButton.setBackground(new java.awt.Color(255, 255, 255));
        addNewButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addNewButton.setForeground(new java.awt.Color(0, 0, 0));
        addNewButton.setText("Add New");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });
        userPanel.add(addNewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, 60));

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        userPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 220, 60));

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 0, 0));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        userPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 130, 60));

        mainPanel.add(userPanel, "userPanel");

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 840, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "itemPanel");
    }//GEN-LAST:event_itemButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:                                         
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "userPanel"); 
    }//GEN-LAST:event_customerButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        // TODO add your handling code here:
        new CustomerInfoScreen().setVisible(true);
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        customers = SerializationManager.loadCustomers();
        
        String [] customerArray = new String[customers.size()];
        for (int i = 0; i < customers.size(); i++){
            customerArray[i] = customers.get(i).getName();
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(customerArray));
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton itemButton;
    private javax.swing.JPanel itemPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}