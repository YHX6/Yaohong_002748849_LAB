/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;
import java.util.*;
import Services.*;
import Personnel.Person;
/**
 *
 * @author xyh10
 */
public class DeliveryAgent extends Person{
    private int orderCount;
    
    List<Order> agentOrderList;
    
    public DeliveryAgent(){
//        super();
//        agentOrderList = new ArrayList<>();
        super();
        agentOrderList = new ArrayList<>();
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public List<Order> getAgentOrderList() {
        return agentOrderList;
    }

    public void setAgentOrderList(List<Order> agentOrderList) {
        this.agentOrderList = agentOrderList;
    }
    
    public void addOrder(Order order){
        agentOrderList.add(order);
        orderCount ++;
    }
    
}
