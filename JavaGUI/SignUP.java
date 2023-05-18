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


public class SignUP extends JFrame implements ActionListener
{
	public JFrame MainSignUPFrame;
	public JButton Login_Button, Sign_up_Button,Confirm_Button, Clear_Button;
	
	public JTextField Name_Text,email_Text, Mobile_No_Text, password_Text, Cpassword_Text;
	public JTextField Address_Text, NID_Text,Birth_Certificate_text;
	public FileWriter FW;
	private Cursor cursor;
	private JComboBox Gender_comboBox;
	
	
	public SignUP()
	{
		MainSignUPFrame =new JFrame("Sign UP Frame");
		
		
		//Cursor for JButtons
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("./Recources/L2.png");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,786,415);
		
		
		
		JLabel Name_label =new JLabel("Name:");
		Name_label.setBounds(453, 30, 90, 30);
		Name_label.setForeground(Color.white);
		
		Name_Text =new JTextField();
		//F_Name=First_Name_Text.getText();
		Name_Text.setBounds(550, 35, 175, 23);
		//Name_Text.setBorder(null);
		Name_Text.setOpaque(false);
        Name_Text.setForeground(Color.white);
		
		
		JLabel Mobile_No_Label =new JLabel("Mobile:");
		Mobile_No_Label.setBounds(453, 70, 90, 30);
		Mobile_No_Label.setForeground(Color.white);
		
		Mobile_No_Text =new JTextField();
		//Mobile_no=Mobile_No_Text.getText();
		Mobile_No_Text.setBounds(550, 75, 175, 23);
		//Mobile_No_Text.setBorder(null);
		Mobile_No_Text.setOpaque(false);
        Mobile_No_Text.setForeground(Color.white);
		
		
		
		JLabel email_Label =new JLabel("E-mail");
		email_Label.setBounds(453, 110, 90, 30);
        email_Label.setForeground(Color.white);		
		
		email_Text =new JTextField();
		//Email=email_Text.getText();
		email_Text.setBounds(550, 115, 175, 23);
		//email_Text.setBorder(null);
		email_Text.setOpaque(false);
        email_Text.setForeground(Color.white);
		
		
		
		JLabel NID_Label  =new JLabel("NID No:");
		NID_Label.setBounds(453, 150, 90, 30);
		NID_Label.setForeground(Color.white);
		
		NID_Text =new JTextField();
		//ID_No=NID_Text.getText();
		NID_Text.setBounds(550, 155, 175, 23);
	//	NID_Text.setBorder(null);
		NID_Text.setOpaque(false);
        NID_Text.setForeground(Color.white);
		
		JLabel Gender_Label  =new JLabel("Gender:");
		Gender_Label.setBounds(453, 190, 90, 30);
		Gender_Label.setForeground(Color.white);
		
		String[] Gender = {"Male", "Female"};
        Gender_comboBox = new JComboBox(Gender);
		Gender_comboBox.setBounds(550, 193, 175, 23);
		
		
		
		
		JLabel password_Lable = new JLabel("Password:");
		password_Lable.setBounds(453, 230, 90, 30);
		password_Lable.setForeground(Color.white);
		
		password_Text =new JPasswordField();
		//Password=password_Text.getText();
		password_Text.setBounds(550, 235, 175, 23);
		//password_Text.setBorder(null);
		password_Text.setOpaque(false);
        password_Text.setForeground(Color.white);
		
		
		JLabel Cpassword_Lable = new JLabel("Confirm Pass:");
		Cpassword_Lable.setBounds(453, 270, 90, 30);
		Cpassword_Lable.setForeground(Color.white);
		Cpassword_Text =new JPasswordField();
		//CPassword=Cpassword_Text.getText();
		Cpassword_Text.setBounds(550, 275, 175, 23);
		//Cpassword_Text.setBorder(null);
		Cpassword_Text.setOpaque(false);
        Cpassword_Text.setForeground(Color.white);
		
		
		
		
		
		
		
		
		
		
					// All Buttons 
		Login_Button = new JButton("Go to Login");
		Login_Button.setBounds(20,20,100,23);
		Login_Button.setFocusable(false);
		Login_Button.addActionListener(this);
		Login_Button.setBorder(null);
		Login_Button.setCursor(cursor);			
					
		Confirm_Button = new JButton("Confirm Registration");
		Confirm_Button.setBounds(500,340,170,23);
		Confirm_Button.setFocusable(false);
		Confirm_Button.addActionListener(this);
		Confirm_Button.setBorder(null);
		Confirm_Button.setCursor(cursor);
		

		Clear_Button = new JButton("Clear All");
		Clear_Button.setBounds(600,340,100,23);
		Clear_Button.setFocusable(false);
		Clear_Button.addActionListener(this);
		Clear_Button.setBorder(null);
		Clear_Button.setCursor(cursor);
		
		
		
		
					// SignUP Frame Properties 
		MainSignUPFrame.setSize(800,450);
		MainSignUPFrame.setLayout(null);
		MainSignUPFrame.setLocationRelativeTo(null);
		MainSignUPFrame.setVisible(true);
		MainSignUPFrame.setResizable(false	);
		MainSignUPFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
					//Adding Properties in SignUP Frame//
		
		MainSignUPFrame.add(Name_label);
		MainSignUPFrame.add(Name_Text);
		MainSignUPFrame.add(email_Label);
		MainSignUPFrame.add(email_Text);
		MainSignUPFrame.add(Mobile_No_Label);
		MainSignUPFrame.add(Mobile_No_Text);
		MainSignUPFrame.add(password_Lable);
		MainSignUPFrame.add(password_Text);
		MainSignUPFrame.add(Cpassword_Lable);
		MainSignUPFrame.add(Cpassword_Text); 
		MainSignUPFrame.add(NID_Label);
		MainSignUPFrame.add(NID_Text);
		MainSignUPFrame.add(Gender_Label);
		MainSignUPFrame.add(Gender_comboBox);
		
		
		
		
		MainSignUPFrame.add(Confirm_Button); 
		//MainSignUPFrame.add(Clear_Button); 
		MainSignUPFrame.add(Login_Button); 
		
		
		
		
		MainSignUPFrame.add(BackgroundImage_label);
		
	}
	
	
	
	public void ClearAll()
	{
			Name_Text.setText("");
			email_Text.setText("");
			Mobile_No_Text.setText("");
			NID_Text.setText("");
			password_Text.setText("");
			Cpassword_Text.setText("");
	}
	
	
		
	
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Confirm_Button)
		{
			String Pass = password_Text.getText();
			String CPass = Cpassword_Text.getText();
			if(email_Text.getText().equals("") || password_Text.getText().equals("") || Name_Text.getText().equals("") || Mobile_No_Text.getText().equals("") || NID_Text.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"One Or More Fields Are Empty");
			}
			else
			{
			if(Pass.equals(CPass))
			{
				try{
				
				 String selectedItem =(String)Gender_comboBox.getSelectedItem();
				
				String Str = email_Text.getText()+","+
							 password_Text.getText()+","+
							 Name_Text.getText()+","+
							 Mobile_No_Text.getText()+","+
							 selectedItem+","+
							 NID_Text.getText()+"\n";
				
				
				
				FW= new FileWriter("All Text Files/UserInfo.txt",true);
				
				FW.write(Str);

				FW.close();
			}
			catch(Exception E)
			{
				
			}
			
			ClearAll();
			JOptionPane.showMessageDialog(null,"Registration Successfull");
			}
			
			else{
				JOptionPane.showMessageDialog(null,"Password doesn't matchedS");
			}
			}
		}
		
		else if(e.getSource()==Clear_Button)
		{
			ClearAll();
		}
		
		else if(e.getSource()==Login_Button)
		{
			MainSignUPFrame.setVisible(false);
			new Login();
		}
		
		
		
		
	}
	
	
	public static void main(String [] args)
	{
		new SignUP();
	}
}