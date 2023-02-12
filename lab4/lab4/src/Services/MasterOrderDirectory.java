/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Restaurant.*;
import com.sun.javafx.scene.control.skin.CustomColorDialog;
import java.util.*;
import Customer.*;
/**
 *
 * @author xyh10
 */
public class MasterOrderDirectory {
    List<Order> orderList;
    
    public MasterOrderDirectory(){
        orderList = new ArrayList<>();
    }
    
    public Order createOrder(Customer c, DeliveryAgent a){
        Order o = new Order(c, a);
        orderList.add(o);
        a.addOrder(o);  //****
        return o;
    }
    
//        
//    public Order createOrder(Customer c){
//        Order o = new Order();
//        o.setC(c);
//        orderList.add(o);
////        a.addOrder(o);  //****
//        return o;
//    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order requstOrder(Customer c){
        Order o = new Order();
        o.setC(c);
        orderList.add(o);
        return o;
    }
    
    public Order assignOrder(Order o, DeliveryAgent a){
        o.setAgent(a);
        a.addOrder(o) ;   //****   
        return o;
    }
    
}
