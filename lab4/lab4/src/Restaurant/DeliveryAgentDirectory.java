/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class DeliveryAgentDirectory {
    List<DeliveryAgent> agentList;
    
    public DeliveryAgentDirectory(){
        agentList = new ArrayList<>();
    }

    public List<DeliveryAgent> getAgentList() {
        return agentList;
    }

    public void setAgentList(List<DeliveryAgent> agentList) {
        this.agentList = agentList;
    }
    
    
    public DeliveryAgent createDeliveryAgent(String id, String name, String age){
       DeliveryAgent agent = new DeliveryAgent();
       agent.setAge(age);
       agent.setName(name);
       agent.setPersonID(id);
       agentList.add(agent);
       return agent;
        
        
    }
    
    public DeliveryAgent findByID(String id){
        for(DeliveryAgent a:agentList){
            if(a.getPersonID().equals(id)){
                return a;
            }
        }
        return null;
    }
}
