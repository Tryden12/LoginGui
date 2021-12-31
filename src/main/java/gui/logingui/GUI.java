package gui.logingui;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author tylerryden
 */
public class GUI implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel;
    private static JLabel userPassword;
    private static JTextField userText;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel loginIcon;
    
    public static void main(String[] args) {

        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        loginIcon = new JLabel(new ImageIcon("/Users/tylerryden/NetBeansProjects/LoginGUI/src/main/java/images/logins.png"));
        loginIcon.setBounds(220, 30, 60, 95);
        panel.add(loginIcon);
        
        userLabel = new JLabel("User");
        userLabel.setBounds(100, 130, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(175, 130, 165, 25);
        panel.add(userText);
        
        userPassword = new JLabel("Password");
        userPassword.setBounds(100, 160, 80, 25);
        panel.add(userPassword);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(175, 160, 165, 25);
        panel.add(passwordText);
        
        button = new JButton("Login");
        button.setBounds(210, 200, 90, 25);
        button.addActionListener(new GUI());
        panel.add(button);
        
        success = new JLabel();
        success.setBounds(170, 230, 300, 25);
        
        panel.add(success);
        
        
        frame.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        //System.out.println(user + ", " + password);
        
        if(!user.equals("Tyler") && !password.equals("password123")) {
            success.setText("Oh no! Login unsuccessful!");
        }
        
        if(user.equals("Tyler") && password.equals("password123")) {
            success.setText("Login successful!");
            success.setBounds(200, 230, 300, 25);
        }
    }
}
