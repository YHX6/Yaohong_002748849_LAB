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
public class MedicineCatalog {
    List<Medicine> medicineCatalog;
    
    public MedicineCatalog(){
        medicineCatalog = new ArrayList<>();
    }

    public List<Medicine> getMedicineCatalog() {
        return medicineCatalog;
    }

    public void setMedicineCatalog(List<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine md = new Medicine(name, dosage);
        medicineCatalog.add(md);
        return md;
    }
    
    public boolean checkMedicineUnique(String name){
        for(Medicine md:medicineCatalog){
            if(md.getMedicineName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public Medicine findMedicine(String name){
        for(Medicine md:medicineCatalog){
            if(md.getMedicineName().equals(name)){
                return md;
            }
        }
        
        return null;
    }
}
