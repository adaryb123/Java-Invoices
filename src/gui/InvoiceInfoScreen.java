/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Customer;
import model.Invoice;
import model.Item;
import model.ItemAndCount;
import model.SerializationManager;

/**
 *
 * @author uzivatel
 */
public class InvoiceInfoScreen extends javax.swing.JFrame {

    ArrayList<Customer> customers;
    ArrayList<Item> items;
    ArrayList<Invoice> invoices;
    ArrayList<ItemAndCount> itemsAndCounts;
    /**
     * Creates new form InvoiceInfoScreen
     */
    public InvoiceInfoScreen() {
        initComponents();
        customers = SerializationManager.loadCustomers();
        items = SerializationManager.loadItems();
        invoices = SerializationManager.loadInvoices();
        itemsAndCounts = new ArrayList();
        
        String [] customersArray = new String[customers.size()];
        for (int i = 0; i < customers.size(); i++)
            customersArray[i] = customers.get(i).getName() + ", " + customers.get(i).getAddress() + ", " + customers.get(i).getCity();
        customerComboBox.setModel(new javax.swing.DefaultComboBoxModel<> (customersArray));
        
        String [] itemsArray = new String[items.size()];
        for (int i = 0; i < items.size(); i++)
            itemsArray[i] = items.get(i).getName() + ", " + String.valueOf(items.get(i).getPrice());
        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel<> (itemsArray));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        itemComboBox = new javax.swing.JComboBox<>();
        customerComboBox = new javax.swing.JComboBox<>();
        addItemButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        removeItemButton = new javax.swing.JButton();
        itemAmmountSpinner = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemAndCountTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ammount");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 180, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select customer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 230, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ordered items");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 230, 60));

        Submit.setBackground(new java.awt.Color(255, 255, 255));
        Submit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 0));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 720, 130, 60));

        itemComboBox.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(itemComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 550, 60));

        customerComboBox.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        customerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(customerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 60));

        addItemButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addItemButton.setText("Add");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 220, 60));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Select item");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 60));

        removeItemButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        removeItemButton.setText("Remove selected");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 220, 60));

        itemAmmountSpinner.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        itemAmmountSpinner.setValue(1);
        jPanel1.add(itemAmmountSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 220, 60));

        itemAndCountTable.setAutoCreateRowSorter(true);
        itemAndCountTable.setBackground(new java.awt.Color(255, 255, 255));
        itemAndCountTable.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        itemAndCountTable.setForeground(new java.awt.Color(0, 0, 0));
        itemAndCountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Ammount", "Item name"
            }
        ));
        itemAndCountTable.setRowHeight(35);
        itemAndCountTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(itemAndCountTable);
        JTableHeader tableHeader = itemAndCountTable.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 24);
        tableHeader.setFont(headerFont);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 540, 340));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if (itemsAndCounts.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "You must select and item!");
        }
        else{
            Customer customer = customers.get(customerComboBox.getSelectedIndex());
            String date = java.time.LocalDateTime.now().toString();
            Invoice invoice = new Invoice(customer,itemsAndCounts,date);
            invoices.add(invoice);
            SerializationManager.saveInvoices(invoices);
            this.dispose();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = itemAndCountTable.getSelectedRow();
        int ammount = Integer.valueOf(itemAndCountTable.getModel().getValueAt(selectedRow, 0).toString());
        String name = itemAndCountTable.getModel().getValueAt(selectedRow, 1).toString();
        DefaultTableModel model = (DefaultTableModel) itemAndCountTable.getModel();
        model.removeRow(selectedRow);
        
        for (ItemAndCount i : itemsAndCounts){
            if (i.getItem().getName().equals(name) && i.getCount() == ammount) {
                itemsAndCounts.remove(i);
                break;
            }
        }
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        int itemIndex = itemComboBox.getSelectedIndex();
        Item item = items.get(itemIndex);
        int ammount = (Integer) itemAmmountSpinner.getValue();
        
        ItemAndCount itemAndCount = new ItemAndCount(item,ammount);
        DefaultTableModel model = (DefaultTableModel) itemAndCountTable.getModel();
        model.addRow(new Object[]{String.valueOf(itemAndCount.getCount()),itemAndCount.getItem().getName()});
        itemsAndCounts.add(itemAndCount);
    }//GEN-LAST:event_addItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceInfoScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton addItemButton;
    private javax.swing.JComboBox<String> customerComboBox;
    private javax.swing.JSpinner itemAmmountSpinner;
    private javax.swing.JTable itemAndCountTable;
    private javax.swing.JComboBox<String> itemComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton removeItemButton;
    // End of variables declaration//GEN-END:variables
}
