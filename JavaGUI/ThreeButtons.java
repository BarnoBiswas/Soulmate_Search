package JavaGUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;

public class ThreeButtons extends JFrame implements ActionListener
{
	
	    private Font fontstyle1;
		private Font fontstyle2;
		private JButton button1,button2,button3,button4,button5;
		public String email;
		private Login login_obj;
		
		
    
    public ThreeButtons(Login login_obj) 
	{
       
		
		this.login_obj=login_obj;
		
		email=this.login_obj.get_email();
	
	
		setLayout(null);
		fontstyle1 = new Font("Chesna Grotesk", Font.BOLD, 20);
		fontstyle2 = new Font("Chesna Grotesk", Font.BOLD, 12);
		
		JLabel emailRangeLabel = new JLabel("Logged in as- " + email);
        emailRangeLabel.setBounds(30, 20, 350, 30);
		emailRangeLabel.setForeground(Color.cyan);
		emailRangeLabel.setFont(new Font("Chesna Grotesk", Font.BOLD, 14));
        add(emailRangeLabel);
		
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("./Recources/L1.png");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,786,415);
        
        // Create three buttons with specified bounds
        button1 = new JButton("Available Male Partner");
        button1.setBounds(320, 160, 190, 50);
		button1.setFocusable(false);
        button1.addActionListener(this);
        
		button2 = new JButton("Available Female Partner");
        button2.setBounds(530, 160, 190, 50);
		button2.setFocusable(false);
        button2.addActionListener(this);
        
        button3 = new JButton("Request For a Partner");
        button3.setBounds(370, 240, 300, 50);
		button3.setFocusable(false);
        button3.addActionListener(this);
		
		button4 = new JButton("Logout");
        button4.setBounds(30, 370, 80, 23);
		button4.setFocusable(false);
        button4.addActionListener(this);
		
		button5 = new JButton("Solution For a Partner");
        button5.setBounds(370, 300, 300, 50);
		button5.setFocusable(false);
        button5.addActionListener(this);
        
        // Add the buttons to the frame
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        
        // Set frame properties
        setTitle("Three Buttons");
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(BackgroundImage_label);
		this.setVisible(true);
    }
	
	public void actionPerformed (ActionEvent E)
	{
		if(E.getSource()==button1)
		{
			this.setVisible(false);
			new ChooseMale(this,login_obj);
		}
		
		else if(E.getSource()==button2)
		{
			this.setVisible(false);
			new ChooseFemale(this,login_obj);
		}
		else if(E.getSource()==button3)
		{
			this.setVisible(false);
			new PartnerPreferenceGUI(this, login_obj);
		}
		else if(E.getSource()==button4)
		{
			this.setVisible(false);
			new Login();
		}
		else if(E.getSource()==button5)
		{
			this.setVisible(false);
			new Partner_Solution(login_obj,this);
		}
	}
	
     
  
}
