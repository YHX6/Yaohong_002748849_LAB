/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class UserAccountDirectory {
    List<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList<>();
    }
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount ua = new UserAccount(username, password, role);
        userAccountDirectory.add(ua);
        return ua;
    }
    
    public UserAccount findByID(String id){
        for(UserAccount ua:userAccountDirectory){
            if(ua.getAccountID().equals(id)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, String role){
        for(UserAccount ua:userAccountDirectory){
            if(ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getRole().equals(role)){
                return ua;
            }
        }
        return null;
    }
    
        public boolean UserAccountExist(String username, String password, String role){
        for(UserAccount ua:userAccountDirectory){
            if(ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getRole().equals(role)){
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
