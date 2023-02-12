/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class CustomerDirectory {
    List<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String id, String name, String age){
//        Customer c = new Customer(id, name, age);
        Customer c = new Customer();
        c.setAge(age);
        c.setName(name);
        c.setPersonID(id);  
        customerList.add(c);
        return c;
    }
    
    
    public Customer findByID(String id){
        for(Customer c:customerList){
            if(c.getPersonID().equals(id)){
                return c;
            }
        }
        return null;
    }
}
