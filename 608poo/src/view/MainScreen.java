package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author LPS
 */
public class MainScreen extends JFrame {
    private LoginForm loginform;
    
    private void initComponents(ActionListener responsable){
        loginform = new LoginForm(responsable);
        add(loginform);
    }
    
    public MainScreen(ActionListener responsable){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initComponents(responsable);
    }
    
    //PROXY = caminho de dados, respeitando hierarquia do paradigma POO
    public void notifyLoginState(boolean state){
        loginform.notifyLoginState(state);
    }
}
