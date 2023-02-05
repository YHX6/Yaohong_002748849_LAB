/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Medicine {

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }
    String medicineName;
    Double dosage;

    public Medicine(String medicineName, Double dosage) {
        this.medicineName = medicineName;
        this.dosage = dosage;
    }
    
    public Medicine(){
        
    }
    
    
    public String toString(){
        return medicineName;
    }
}
