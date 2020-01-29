package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LPS
 */
public class LoginForm extends JPanel {
    private UserPanel user;
    private PassPanel pass;
    private ConfirmPanel confirm;
    private JLabel msg;
    
    private void initComponents(ActionListener responsable){
        user = new UserPanel();
        add(user);
        pass = new PassPanel();
        add(pass);
        confirm = new ConfirmPanel(responsable);
        add(confirm);
        msg = new JLabel();
        add(msg);
    }
    
    public LoginForm(ActionListener responsable){
        setLayout(new FlowLayout());
        initComponents(responsable);
    }
    
    public void notifyLoginState(boolean valid){
        String s;
        if(valid)
            s = "invalid credentials";
        else
            s = "welcome!";
        msg.setText(s);
    }

}
