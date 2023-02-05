/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class VitalSignHistory {
    private List<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        vitalSignHistory = new ArrayList<>();
    }

    public List<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(List<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
    public Observation createObservation(int observationId, double bloodPressure, double temperarure){
        
        Observation ob = new Observation(observationId, bloodPressure, temperarure);
        vitalSignHistory.add(ob);
        return ob;
    }
    
    public boolean checkObservationIDUnique(int id){
        for(Observation ob:vitalSignHistory){
            if(ob.getObservationId() == id){
                return false;
            }
        }
        
        return true;
    }
    
    
    public Observation findObservation(int id){
        for(Observation ob:vitalSignHistory){
            if(ob.getObservationId() == id){
                return ob;
            }
        }
        
        return null;
    }
    
}
