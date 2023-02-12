/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import javax.swing.*;
import UI.*;
import UI.CustomerWorkArea.*;
import UI.DeliveryAgentWorkArea.*;
import UI.ManagerWorkArea.*;
/**
 *
 * @author xyh10
 */
public class UserAccount {
    private static int count = 0;
    String accountID;
    String username;
    String password;
    String role;

    public UserAccount() {
        accountID = "ACC" + count;
        count ++;     
    }

    public UserAccount( String username, String password, String role) {
        accountID = "ACC" + count;
        this.username = username;
        this.password = password;
        this.role = role;
        count ++;
        System.out.println(count + accountID);
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public JFrame getWorkArea(String role, Business business, UserAccount useracount){
        if(role.equals("Manager")){
//            return new ManagerJFrame(business, useracount);
                return new ManagerJFrame(business, useracount);
        }else if(role.equals("Customer")){
            return new CustomerJFrame(business, useracount);
        }else{
           return new AgentJFrame(business, useracount);
        }
    }
}
