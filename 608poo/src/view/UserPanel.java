package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LPS
 */
class UserPanel extends JPanel {
    private JLabel userLabel;
    private JTextField userField;
    
    private void initComponents(){
        userLabel = new JLabel("user: ");
        add(userLabel);
        
        userField = new JTextField();
        userField.setPreferredSize(new Dimension(100, 25));
        add(userField);
    }
    
    public UserPanel(){
        setLayout(new FlowLayout());
        initComponents();
    }
}
