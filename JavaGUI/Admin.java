package JavaGUI;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.File; 
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.lang.*;
import java.awt.Color;

public class Admin extends JFrame implements ActionListener {

    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private JButton userListButton, requestButton, solutionButton, logoutButton, doneButton;

    public Admin() {

        // Set layout manager
        setLayout(null);

        // Create components
        label1 = new JLabel("For Whom: ");
        label2 = new JLabel("Link: ");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        userListButton = new JButton("User List");
        requestButton = new JButton("Request");
        solutionButton = new JButton("Solution");
        logoutButton = new JButton("Log Out");
        doneButton = new JButton("Done");

        // Set component bounds
        label1.setBounds(200, 100, 80, 30);
        textField1.setBounds(275, 103, 320, 23);
		
        label2.setBounds(200, 150, 80, 30);
        textField2.setBounds(275, 153, 320, 23);
		
        userListButton.setBounds(30, 30, 100, 30);
        requestButton.setBounds(30, 70, 100, 30);
        solutionButton.setBounds(30, 110, 100, 30);
		
        logoutButton.setBounds(30, 360, 100, 30);
        doneButton.setBounds(660, 360, 100, 30);
		
		
		userListButton.addActionListener(this);
        requestButton.addActionListener(this);
        solutionButton.addActionListener(this);
        logoutButton.addActionListener(this);
        doneButton.addActionListener(this);

        // Add components to frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(userListButton);
        add(requestButton);
        add(solutionButton);
        add(logoutButton);
        add(doneButton);

        // Set frame properties
        setTitle("Admin");
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	public void actionPerformed (ActionEvent E)
	{
		
		if(E.getSource()==userListButton)
		{
			this.setVisible(false);
			new UserList();
		}
		
		else if(E.getSource()==requestButton)
		{
			this.setVisible(false);
			//new requestButton();
		}
		else if(E.getSource()==solutionButton)
		{
			this.setVisible(false);
			//new solutionButton(this,login);
		}
		else if(E.getSource()==logoutButton)
		{
			this.setVisible(false);
			new Login();
		}
		else if(E.getSource()==doneButton)
		{
			this.setVisible(false);
			//new Login();
		}
	}
	public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setVisible(true);
    }
    
}
