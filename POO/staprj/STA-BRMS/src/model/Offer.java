package model;

/**
 *
 * @author LPS
 */
public class Offer {
    public boolean stock;
    public int quantity;
    public Product product;
    
    public Offer(boolean s, int q, Product p){
        stock = s;
        quantity = q;
        product = p;
    }

    @Override
    public String toString() {
        String s = product.name + "\n\t";
        if(stock){
            s += "Quantity: " + quantity;
            return s;
        }
        return s;
    } 
}
