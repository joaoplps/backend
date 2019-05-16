package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author LPS
 */
public class MainScreen extends JFrame implements ActionListener {
    private final UserPanel user;
    private final PassPanel pass;
    private final ConfirmPanel confirm;
    
    public MainScreen(){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        user = new UserPanel();
        add(user);
        pass = new PassPanel();
        add(pass);
        confirm = new ConfirmPanel();
        add(confirm);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
