package model;

/**
 * @author LPS
 */
public class Product {
    public String name;
    public String detail;
    public double price;
    
    public Product(String n, String d, int p){
        name = n;
        detail = d;
        price = p;
        validate();
    }
    
    private void validate(){
        if(name == null || detail == null)
            throw new IllegalArgumentException("Product's attributes cannot be empty.");
        if(price < 0)
            throw new IllegalArgumentException("Product price cannot be negative.");
    }

    @Override
    public String toString() {
        return name;
    }
}
