/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xyh10
 */
public class MedicineCatalogPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineCatalogPanel
     */
    Application application;
    DefaultTableModel model;
    Medicine selectedMedicine;
    
    
    public MedicineCatalogPanel() {
        initComponents();
        model = (DefaultTableModel) viewTable.getModel();
        
    }
    
    public MedicineCatalogPanel(Application application) {
        initComponents();
        this.application = application;
        model = (DefaultTableModel) viewTable.getModel();
        display();
        
    }
    
    
    public boolean validateName(){
        String str = fieldName.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a name!" );
            return false;
        }else if(!str.matches("[A-Za-z]*")){
            JOptionPane.showMessageDialog(null,"Please enter a valid name(consists of only letters)!" );
            return false;
        }   
        return true;
    }
    
    public boolean validateDosage(){
        String str = fieldDosage.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the dosage!" );
            return false;
        }else if(!str.matches("[0-9]*(.[0-9]*)?")){
            JOptionPane.showMessageDialog(null,"Please enter a valid number!" );
            return false;
        }else if(Double.parseDouble(str) <= 0){
            JOptionPane.showMessageDialog(null,"Dosage should larger than 0!!" );
            return false;
        }   
        return true;
    }
    
    public void display(){
        model.setRowCount(0);
        
        for(Medicine md:application.getCatalog().getMedicineCatalog()){
            Object[] row = new Object[2];
            row[0] = md;
            row[1] = md.getDosage();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        fieldName = new javax.swing.JTextField();
        freshBtn = new javax.swing.JButton();
        fieldDosage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 380, 300));

        fieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNameFocusLost(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 30));

        freshBtn.setText("Fresh");
        freshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshBtnActionPerformed(evt);
            }
        });
        add(freshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
        add(fieldDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dosage");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Medicine catalog");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String strName = fieldName.getText();
        String strDosage = fieldDosage.getText();
        
        if(!validateName()){
            return ;
        }else if(!validateDosage()){
            return ;
        }
        
        if(!application.getCatalog().checkMedicineUnique(strName)){
            JOptionPane.showMessageDialog(null, "Medicine exsited!");
            return ;
        }
        
        application.getCatalog().createMedicine(strName, Double.parseDouble(strDosage));
        JOptionPane.showMessageDialog(null, "Added successfully!");
    }//GEN-LAST:event_addBtnActionPerformed

    private void freshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshBtnActionPerformed
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_freshBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewTable.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return ;
        }else{

            
            selectedMedicine = (Medicine) model.getValueAt(selectedRow, 0);
            
            application.getCatalog().getMedicineCatalog().remove(selectedMedicine);
            
            selectedMedicine = null;
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void fieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNameFocusLost
        // TODO add your handling code here:
        String name = fieldName.getText();
        boolean isUnique = application.getCatalog().checkMedicineUnique(name);
        if(!isUnique){
            fieldName.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already existed!");
        }
    }//GEN-LAST:event_fieldNameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldDosage;
    private javax.swing.JTextField fieldName;
    private javax.swing.JButton freshBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
