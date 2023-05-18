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

public class Login extends JFrame implements ActionListener
{
	public JFrame MainLoginFrame;
	public JButton Login_Button, Sign_up_Button,Forget_Password_Button,About_us_Button;
	public JTextField Email_Text;
	public JPasswordField Password_Text;
	public SignUP signup;
	public ImageIcon BackgroundImage;
	public String checkPass, checkusername;
	public FileReader reader;
	private Cursor cursor;
	public String email_to_check;
	
	public String get_email()
	{
		return email_to_check;
	}
	
	public Login()
	{
		MainLoginFrame =new JFrame("Login Frame");
		
		//Cursor for JButtons
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
	
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("./Recources/L1.png");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,786,415);
			
		
		
		JLabel Email_Label =new JLabel("E-mail:");
		Email_Label.setBounds(453, 200, 90, 30);
		Email_Label.setForeground(Color.white);
		Email_Label.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		Email_Text =new JTextField();
		Email_Text.setBounds(550, 205, 175, 20);
	//	Email_Text.setBorder(null);
		Email_Text.setOpaque(false);
        Email_Text.setForeground(Color.white);
		
		JLabel password_Lable = new JLabel("Password:");
		password_Lable.setBounds(453, 240, 90, 30);
		password_Lable.setForeground(Color.white);
		password_Lable.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		Password_Text =new JPasswordField();
		Password_Text.setBounds(550, 245, 175, 20);
		//Password_Text.setBorder(null);
		Password_Text.setOpaque(false);
        Password_Text.setForeground(Color.white);
		
		
		Login_Button = new JButton("Login");
		Login_Button.setBounds(473, 290, 75, 23);
		Login_Button.setFocusable(false);
		Login_Button.addActionListener(this);
		Login_Button.setBorder(null);
		Login_Button.setCursor(cursor);
	
		
		Forget_Password_Button = new JButton("Forget Password");
		Forget_Password_Button.setBounds(570,290,120,23);
		Forget_Password_Button.setBorder(null);
		Forget_Password_Button.addActionListener(this);
		Forget_Password_Button.setBorder(null);
		Forget_Password_Button.setCursor(cursor);
		
		
		JLabel Sign_Up_Lable = new JLabel("If you are new then");
		Sign_Up_Lable.setBounds(460, 345, 200, 50);
		Sign_Up_Lable.setForeground(Color.red);
		//Sign_Up_Lable.setFont(new Font("SansSerif", Font.BOLD, 15));
		Sign_Up_Lable.setFont(new Font("cambria", Font.BOLD, 15));
		
		JLabel loginLabel = new JLabel("Login!");
        loginLabel.setBounds(540, 90, 500, 50);
        loginLabel.setForeground(Color.white);
        loginLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        
		
		Sign_up_Button = new JButton("Sign Up");
		Sign_up_Button.setBounds(615, 360, 90, 23);
		Sign_up_Button.setFocusable(false);
		Sign_up_Button.setBorder(null);
		Sign_up_Button.addActionListener(this);
		Sign_up_Button.setCursor(cursor);
		
		About_us_Button = new JButton("About Us");
		About_us_Button.setBounds(20,20,75,20);
		About_us_Button.setFocusable(false);
		About_us_Button.setBorder(null);
		About_us_Button.addActionListener(this);
		About_us_Button.setCursor(cursor);
		
		
			
		
					// Login Frame Properties 
		MainLoginFrame.setSize(800,450);
		MainLoginFrame.setLayout(null);
		MainLoginFrame.setLocationRelativeTo(null);
		MainLoginFrame.setVisible(true);
		MainLoginFrame.setResizable(false);
		MainLoginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
					//Adding Properties in Frame
		
		MainLoginFrame.add(Email_Label);
		MainLoginFrame.add(password_Lable); 
		MainLoginFrame.add(Email_Text); 
		MainLoginFrame.add(Password_Text); 
		MainLoginFrame.add(Login_Button);
		MainLoginFrame.add(Sign_up_Button);
		MainLoginFrame.add(About_us_Button);
		MainLoginFrame.add(Forget_Password_Button);
		MainLoginFrame.add(Sign_Up_Lable);
		MainLoginFrame.add(loginLabel);
		
		
		MainLoginFrame.add(BackgroundImage_label);
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Login_Button)
		{

			try
			{
			 String email=Email_Text.getText();
			 String password=Password_Text.getText();
			 
			 
			 String LoginInfo =email+","+password;
			 String admin_LoginInfo ="admin"+","+"admin";
			 

			BufferedReader bfreader=null;
			String line;
			int count=0;
			
				reader=new FileReader("All Text Files/UserInfo.txt");
				bfreader=new BufferedReader(reader);
				
				while((line=bfreader.readLine())!=null)
				{
					String[] parts = line.split(",");
					String Email = parts[0];
					String Password = parts[1];
					
					String User_login_info= Email+","+Password;

					if(LoginInfo.equals(User_login_info))
					{
						count++;
					}				
				}
				if(count==1)
				{
					email_to_check= Email_Text.getText();
					MainLoginFrame.setVisible(false);
					new ThreeButtons(this);
				}
				else if (LoginInfo.equals(admin_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					new UserList();
				}
				
				else if(email.isEmpty() || password.isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Please fill up all the fields");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Enter Correct ID & Password");
				}
								
				reader.close();			
			}
			catch(Exception ex)
			{
				
			}
			
				
		}
		else if(e.getSource()==Sign_up_Button)
		{
			MainLoginFrame.setVisible(false);
			signup= new SignUP();
		}
		
		else if(e.getSource()==Forget_Password_Button)
		{
			MainLoginFrame.setVisible(false);
			new ForgetPassword();
		}
		
		else if(e.getSource()==About_us_Button)
		{
			MainLoginFrame.setVisible(false);
			new AboutUs();
		}
		
	}
	
	public static void main(String [] args)
	{
		new Login();
	}
}