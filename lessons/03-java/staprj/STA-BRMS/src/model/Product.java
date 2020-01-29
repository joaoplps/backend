package model;

/**
 * Product object def
 *
 * A product has name, price and details
 *
 * @author LPS
 */
public class Product { //A Product representation;

    public final String name;
    public final String detail;
    public final double price;

    public Product(String n, String d, double p) {
        name = n;
        detail = d;
        price = p;
        validate();
    }

    private void validate() { //Validate object;
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product's attributes cannot be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
