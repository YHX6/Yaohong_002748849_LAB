/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import Personnel.Person;
import Services.*;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class Customer extends Person{
    int ordersTotal;
    List<Order> customerOrderList;
    
    public Customer() {
        super();
        customerOrderList = new ArrayList<>();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public List<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(List<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
    
    
    public void addOrder(Order o){
        customerOrderList.add(o);
    }
    
}
