/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.*;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
/**
 *
 * @author xyh10
 */
public class CreatePane extends javax.swing.JPanel {

    /**
     * Creates new form CreatePane
     */
    private DeliveryPackage deliveryPackage;
    public CreatePane() {
        initComponents();
    }
    
    public CreatePane(DeliveryPackage deliveryPackage){
        initComponents();
        this.deliveryPackage = deliveryPackage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageID = new javax.swing.JTextField();
        packageWeight = new javax.swing.JTextField();
        productID = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        customerID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        addProductBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                packageIDKeyPressed(evt);
            }
        });
        add(packageID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 110, 30));
        add(packageWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 110, 30));
        add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 30));

        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });
        add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 110, 30));
        add(productPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 30));
        add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 110, 30));
        add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 110, 30));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("packageID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("packageWeight");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("productID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("productName");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("productPrice");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("full Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("customerID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        addProductBtn.setText("Add product");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });
        add(addProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        String strPackageID = this.packageID.getText();
        if(strPackageID.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Package ID");
            return ;
        }else if(!strPackageID.matches("[0-9]*")){
            JOptionPane.showMessageDialog(this, "Enter a number for package ID!");
            return ;
        }
        int intPackageID = Integer.parseInt(strPackageID);
        

        
        String strPackageWeight = packageWeight.getText();
        if(strPackageWeight.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Package weight");
            return ;
        }
        Double doublePackageWeght = Double.parseDouble(strPackageWeight);
        
        
        String strpRroductID = productID.getText();
        if(strPackageID.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Package ID");
            return ;
        }else if(!strPackageID.matches("[0-9]*")){
            JOptionPane.showMessageDialog(this, "Enter a number for Package ID!");
            return ;
        }


        String strFullName = customerName.getText();
        if(strFullName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Customer Name");
            return ;            
        }else if(!strFullName.matches("[A-Za-z]*")){
            JOptionPane.showMessageDialog(this, "Custoer Name consists of only letters!");
            return ;
        }
        
        String strCustomerID = customerID.getText();
        if(strCustomerID.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the customer ID");
            return ;
        }else if(!strCustomerID.matches("[0-9]*")){
            JOptionPane.showMessageDialog(this, "Enter a number for custoemr ID!");
            return ;
        }
        
        int intCustomerID = Integer.parseInt(strCustomerID);
        
        
        deliveryPackage.setPackageID(intPackageID);
        deliveryPackage.setPackageWeight(doublePackageWeght);
//        deliveryPackage.getProduct().setProductID(intProductID);
//        deliveryPackage.getProduct().setPrice(doubleProductPrice);
//        deliveryPackage.getProduct().setProductName(strProductName);
        deliveryPackage.getCustomer().setCustomerID(intCustomerID);
        deliveryPackage.getCustomer().setFullName(strFullName);
        
        JOptionPane.showMessageDialog(this, "Saved successfully!");
        
//        Main main = new Main(deliveryPackage);
//        main.setVisible(true);
//        
//        packageID.setText("");
//        packageWeight.setText("");
//        productID.setText("");
//        productName.setText("");
//        productPrice.setText("");
//        customerID.setText("");
//        customerName.setText("");
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        // TODO add your handling code here:
        String strproductID  = productID.getText();
        if(strproductID.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter your product ID");
            return ;
        }else if(!strproductID.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null, "Enter a number for product ID");
            return ;
        }
        
        String strProductName = productName.getText();
        if(strProductName.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter your Name");
            return ;
        }
        
        String strProductPrice = productPrice.getText();
        
        if(strProductPrice.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter product price");
            return ;
        }else if(!strProductPrice.matches("([0-9]*)(\\.([0-9]*))?")){
            JOptionPane.showMessageDialog(null, "Enter a double number for product price");
            return ;
        }
        
        
        
        deliveryPackage.addProduct(Integer.parseInt(productID.getText()), productName.getText(), Double.parseDouble(productPrice.getText()));
        
        System.out.println(deliveryPackage.getProductlist().size());
        JOptionPane.showMessageDialog(null, "Created!");
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void packageIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packageIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageID;
    private javax.swing.JTextField packageWeight;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    // End of variables declaration//GEN-END:variables
}
