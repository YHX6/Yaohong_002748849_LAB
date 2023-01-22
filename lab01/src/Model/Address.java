/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Address {
    private String streetName;
    private String apartmentNo;
    private String city;
    private String zipCode;

    /**
     * @return the streetName
     */
    
    public Address(){
        
    }
    
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the apartmentNo
     */
    public String getApartmentNo() {
        return apartmentNo;
    }

    /**
     * @param apartmentNo the apartmentNo to set
     */
    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public static void main(String[] args) {
        Address ad = new Address();
        ad.setApartmentNo("53");
        ad.setCity("bos");
        ad.setStreetName("qwe");
        ad.setZipCode("qwe5");
        System.err.println(ad.toString());
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", apartmentNo=" + apartmentNo + ", city=" + city + ", zipCode=" + zipCode + '}';
    }


    
}
