/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Observation {
    int observationId;
    private double bloodPressure;
    private double temperature;
    private Medicine medicine;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Observation(int observationId, double bloodPressure, double temperature) {
        this.observationId = observationId;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        medicine = new Medicine();
    }
    
    
    public Observation(){
        medicine = new Medicine();
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
//        return "Observation{" + "observationId=" + observationId + ", bloodPressure=" + bloodPressure + ", temperature=" + temperature + '}';
            return "" + observationId;
    }
    
}
