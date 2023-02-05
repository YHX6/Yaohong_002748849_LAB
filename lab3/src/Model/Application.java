/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Application {
    VitalSignHistory history;
    MedicineCatalog catalog;
    
    public Application(){
        this.history = new VitalSignHistory();
        this.catalog = new MedicineCatalog();
        
    }

    public Application(VitalSignHistory history, MedicineCatalog catalog) {
        this.history = history;
        this.catalog = catalog;
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    
}
