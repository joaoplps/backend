package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author LPS
 */
class ConfirmPanel extends JPanel {
    private JButton confirmBtn;
    
    private void initComponents(ActionListener responsable){
        confirmBtn = new JButton("confirm");
        confirmBtn.addActionListener(responsable);
        add(confirmBtn);
    }
    
    public ConfirmPanel(ActionListener responsable){
        initComponents(responsable);
    }
    
    
}
