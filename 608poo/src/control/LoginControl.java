
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainScreen;

/**
 *
 * @author LPS
 */
public class LoginControl implements ActionListener {
    private final MainScreen loginscreen;
    
    public LoginControl(){
        loginscreen = new MainScreen(this);
    }
    
    public void start(){
        loginscreen.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loginscreen.notifyLoginState(true);
    }
}
