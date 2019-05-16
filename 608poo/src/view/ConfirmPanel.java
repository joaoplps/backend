package view;

import java.awt.FlowLayout;
import javax.swing.JButton;

/**
 *
 * @author LPS
 */
class ConfirmPanel extends JButton {
    private JButton confirmBtn;
    
    private void initComponents(){
        confirmBtn = new JButton();
        add(confirmBtn);
    }
    
    public ConfirmPanel(){
        setLayout(new FlowLayout());
        initComponents();
    }
}
