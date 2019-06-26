package persistency;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import model.Offer;
import model.Product;
import model.ShowCase;

/**
 *
 * @author LPS
 */
public class EntitySCC extends Entity {

    public ArrayList<Product> getProductsFromDB() {

        final ArrayList<Product> products = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT id, name, description, price FROM product;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return products;
    }

    public void insertProductInDB(String n, String d, double p) {

        final Product product = new Product(n, d, p);

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("INSERT INTO product (" + n + ", " + d + ", " + p + ");");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }

    public ArrayList<ShowCase> getShowCasesFromDB() {

        final ArrayList<ShowCase> showcases = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM showcase;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return showcases;
    }

    public ArrayList<Offer> getOffersFromDB() {

        final ArrayList<Offer> offers = new ArrayList();

        try {
            openConn();

            Statement cmd = createCmd();
            ResultSet rs = cmd.executeQuery("SELECT * FROM offer;");

            while (rs.next()) {

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

        return offers;
    }

    public void insertOfferInDB(HashMap<Product, Integer> hm) {

        final Offer offer = new Offer(q, p);

        try {
            openConn();

            Statement cmd = createCmd();
            cmd.executeUpdate("INSERT INTO offer (" + q + ", " + p.name + ");");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConn();
        }

    }
}
