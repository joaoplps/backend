package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author LPS
 */
public class PassPanel extends JPanel {
    private JLabel passLabel;
    private JPasswordField passField;
    
    private void initComponents(){
        passLabel = new JLabel("pass: ");
        add(passLabel);
        
        passField = new JPasswordField();
        passField.setPreferredSize(new Dimension(100, 25));
        add(passField);
    }
    
    public PassPanel(){
        setLayout(new FlowLayout());
        initComponents();
    }
}
