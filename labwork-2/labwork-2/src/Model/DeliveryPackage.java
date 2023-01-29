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
public class DeliveryPackage {
    int packageID;
    double packageWeight;
    List<Product> productlist = new ArrayList<>();
    List<Customer> customerlist = new ArrayList<>();

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }

    public List<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(List<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    Product product = new Product();
    Customer customer = new Customer();

    public DeliveryPackage() {
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Product addProduct(int productID, String productName, double price){
        Product p = new Product();
        p.setPrice(price);
        p.setProductID(productID);
        p.setProductName(productName);
        
        productlist.add(p);
        
        return p;
        
    }

    public Product findProduct(int id){
        for(Product p:productlist){
            if(id == p.getProductID()){
                return p;
            }
        }
        
        return null;
    }
}
