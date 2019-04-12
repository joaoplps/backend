package model;

/**
 * @author LPS
 */
public class Offer extends OfferSubject {
    public int quantity;
    public Product product;
    
    public Offer(int q, Product p){
        quantity = q;
        product = p;
        validate();
    }
    
    private void validate(){ //Validate offer;
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative.");
    }

    @Override
    public String toString() {
        String s = product.name + "\n\t";
        if(quantity > 0){
            s += "Quantity: " + quantity + "\n";
            return s;
        }
        return s += "No product in stock.\n";
    }
    
    public boolean endedOffer(){ //The offer ended?
        if(quantity <= 0){ //Make sure of that;
            notification(); //Notify the list of observers;
            return true;
        }
        return false; //If quantity is greater than 0, the offer exists;
    }
}
