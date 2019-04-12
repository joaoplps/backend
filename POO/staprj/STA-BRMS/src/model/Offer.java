package model;

/**
 *
 * @author LPS
 */
public class Offer {
    public int quantity;
    public Product product;
    
    public Offer(int q, Product p){
        quantity = q;
        product = p;
        validate();
    }
    
    private void validate(){
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be null or negative.");
    }

    @Override
    public String toString() {
        String s = product.name + "\n\t";
        if(quantity == 0){
            s += "Quantity: " + quantity;
            return s;
        }
        return s += "There is no product in stock.";
    }
}
