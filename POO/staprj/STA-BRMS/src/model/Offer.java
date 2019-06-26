package model;

/**
 * Offer object Corresponds a product with its existence
 *
 * An offer is the quantity of a product
 *
 * @author LPS
 */
public class Offer extends ObservedImpl {

    private int quantity;
    public final Product product;

    public Offer(int q, Product p) {
        quantity = q;
        product = p;
        validate();
    }

    private void validate() { //Validate offer;
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
    }

    public int quantity() {
        return quantity;
    }

    public void sell(int q) { //Sell method;
        if (quantity >= q) {
            quantity -= q;
            if (quantity == 0) {
                endOffer();
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void endOffer() { //End the offer;
        notification(); //Notify the list of observers;
    }

    @Override
    public String toString() {
        String s = product.name + "\n\t";
        if (quantity > 0) {
            s += "Quantity: " + quantity + "\n";
            return s;
        }
        return s += "No product in stock.\n";
    }
}
