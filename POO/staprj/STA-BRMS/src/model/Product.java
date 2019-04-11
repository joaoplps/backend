package model;

/**
 *
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
    }

    @Override
    public String toString() {
        return name;
    }
}
