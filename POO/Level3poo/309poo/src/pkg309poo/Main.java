package pkg309poo;
/**
 * Ex.: JOption Pane
 *
 * @author João Pedro LPS
 */
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String sName, sPhone;
        
        sName = JOptionPane.showInputDialog("Contact Name: ");
        sPhone = JOptionPane.showInputDialog("Contact Phone: ");
        
        Contact contact = new Contact(sName, sPhone);
    }
}
