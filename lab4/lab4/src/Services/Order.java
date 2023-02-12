/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Customer.*;
import Restaurant.*;
/**
 *
 * @author xyh10
 */
public class Order {
    Customer c;
    DeliveryAgent agent;
    static int count=0;
    String orderID;
    String status;
    
    public Order(){
        count ++;
        status = "created";
        orderID = "ORDERNO" + count;
    }

    public Order(Customer c, DeliveryAgent agent) {
        this.c = c;
        this.agent = agent;
        count ++;
        status = "created";
        orderID = "ORDERNO" + count;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
        status = "Delivered";
                
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return orderID ;
    }
    
    
    
    
    
    
    
}
