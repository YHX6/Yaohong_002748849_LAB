/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Services.*;
import Customer.*;
import Restaurant.*;
/**
 *
 * @author xyh10
 */
public class Business {
    UserAccountDirectory userAccountDirectory;
    CustomerDirectory customerDirectory;
    DeliveryAgentDirectory deliveryAgentDirectory;
    MasterOrderDirectory masterOrderDirectory;

    public Business() {
        userAccountDirectory = new UserAccountDirectory();  
        customerDirectory = new CustomerDirectory();
        deliveryAgentDirectory = new DeliveryAgentDirectory();
        masterOrderDirectory = new MasterOrderDirectory();
        
        UserAccount user = userAccountDirectory.createUserAccount("admin", "admin", "Manager");
    }
    
    public static Business getBusinessInstance(){
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public MasterOrderDirectory getMasterOrderDirectory() {
        return masterOrderDirectory;
    }

    public void setMasterOrderDirectory(MasterOrderDirectory masterOrderDirectory) {
        this.masterOrderDirectory = masterOrderDirectory;
    }
    
    
    
}
