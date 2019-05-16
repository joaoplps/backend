package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import model.SignIn;

/**
 *
 * @author LPS
 */
public class LoginScreen extends JFrame implements ActionListener {
    private JLabel userText, passText;
    private JTextField userField;
    private JPasswordField passField;
    private JButton confirmBtn;
    
    private void initComponents(){
        initLabels();
        initFields();
        initButton();
    }
    
    private void initLabels(){
        //Creating labels
        userText = new JLabel("user");
        passText = new JLabel("pass");
        //Add components
        userText.setSize(45, 15);
        userText.setLocation(30, 30);
        
        passText.setSize(45, 15);
        passText.setLocation(30, 60);
        
        add(userText);
        add(passText);
    }
    
    private void initFields(){
        userField = new JTextField();
        passField = new JPasswordField();
        //Add components
        userField.setSize(85, 20);
        userField.setLocation(userText.getLocation().x + userText.getSize().width + 15, 30);
        userField.setVisible(true);
        
        passField.setSize(85, 20);
        passField.setLocation(passText.getLocation().x + passText.getSize().width + 15, 60);
        passField.setVisible(true);
        
        add(userField);
        add(passField);
    }
    
    private void initButton(){
        //Creating button
        confirmBtn = new JButton("signin");
        //Add components
        confirmBtn.setSize(45, 15);
        confirmBtn.setLocation(passField.getLocation().x + passField.getSize().width - confirmBtn.getSize().width, 90);
        
        confirmBtn.addActionListener(this);
        
        add(confirmBtn);
    }
    
    public LoginScreen () {
        setLayout(null); //No container layout manager
        setVisible(true); //Be visible
        
        setSize(400, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Screen close mode
        
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final String user = userField.getText();
        final String pass = new String(passField.getPassword());
        
        SignIn login = new SignIn(user, pass);
        SignIn correct = new SignIn("user", "pass");
        
        System.out.println(login.equals(correct));
    }
}
