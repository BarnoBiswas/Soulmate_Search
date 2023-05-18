package JavaGUI;

import javax.swing.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.*;  
import java.awt.*;
import java.lang.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class LoginSignupInterface extends JFrame implements ActionListener {
	
    private Font fontstyle1;
    private Font fontstyle2;
    private JButton signupButton; // Declare the class-level variable
	private MyGUI f3;

    public LoginSignupInterface () {
	   
        JFrame frame = new JFrame("Login or Sign Up");
        frame.setSize(800, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
		
        JLabel BackgroundImage_label;
        ImageIcon img = new ImageIcon("./Recources/a2.png");
        BackgroundImage_label = new JLabel("", img, JLabel.CENTER);
        BackgroundImage_label.setBounds(0,0,786,415);
		
        fontstyle1 = new Font("Chesna Grotesk", Font.BOLD, 24);
        fontstyle2 = new Font("Chesna Grotesk", Font.BOLD, 16);
        
        JLabel loginLabel = new JLabel("Login!");
        loginLabel.setBounds(540, 90, 500, 50);
        loginLabel.setForeground(Color.yellow);
        loginLabel.setFont(fontstyle1);
        frame.add(loginLabel);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(453, 200, 70, 30);
        usernameLabel.setForeground(Color.yellow);
        //usernameLabel.setFont(fontstyle2);
        frame.add(usernameLabel);
        
        JTextField usernameField = new JTextField();
        usernameField.setBounds(530, 205, 175, 20);
        frame.add(usernameField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(453, 240, 70, 30);
        passwordLabel.setForeground(Color.yellow);
        //passwordLabel.setFont(fontstyle2);
        frame.add(passwordLabel);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(530, 245, 175, 20);
        frame.add(passwordField);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(565, 290, 75, 23);
        //loginButton.setForeground(Color.yellow);
        frame.add(loginButton);
        
        JLabel signupLabel = new JLabel("If you are new then");
        signupLabel.setBounds(460, 345, 200, 50);
        signupLabel.setForeground(Color.red);
        signupLabel.setFont(fontstyle2);
        frame.add(signupLabel);
	
        signupButton = new JButton("Sign up"); // Initialize the class-level variable
        signupButton.setBounds(615, 360, 90, 23);
        signupButton.addActionListener(this);
        frame.add(signupButton);   
		
        frame.add(BackgroundImage_label);
		
        frame.setVisible(true);
    }
	
     public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == signupButton) {
            this.setVisible(false); // Use the class-level variable here
            f3 = new MyGUI();
            //f3.setVisible(true);
        }
    }
}
