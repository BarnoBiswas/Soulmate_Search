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
public class Partner_Solution extends JFrame implements ActionListener 
{

    private JLabel label1,label2;
    private JTextField textField,textField2;
    private JButton button5,button6;
	private FileWriter FW;
	private FileReader reader;
	private BufferedReader bfreader;
	private Login login_obj;
	private String Email;
	private ThreeButtons threeButtons_obj;
	private String[] Info = new String[3];

    public Partner_Solution(Login login_obj, ThreeButtons threeButtons_obj) {
	
	super("Partner_Solution");
	this.login_obj=login_obj;
	this.threeButtons_obj=threeButtons_obj;
	
	String Email=this.login_obj.get_email();

        
        setLayout(null);

        
		
		reader = null;
		bfreader = null;
		String line;
		
		try
		{
			reader = new FileReader("All Text Files/SolutionFromAdmin.txt");
			bfreader = new BufferedReader(reader);

			while ((line = bfreader.readLine()) != null)
			{
				String[] parts = line.split(",");
				String emails = parts[0];

				if (Email.equals(emails))
				{
					Info = parts;
				}	
			}
			bfreader.close();
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
        label1 = new JLabel("Here is your Solution");
		label1.setBounds(350, 100, 300, 30);
		
		label2 = new JLabel("Copy the link to connect");
		label2.setBounds(350, 150, 300, 30);
		
		
		textField = new JTextField();
		textField.setBounds(300, 200, 300, 30);
		textField.setText(Info[1]);
		
		
		
		
		button5= new JButton("Logout");
		Color c5 = new Color(102,102,102);
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);
		button5.setBounds(10,350,180,40);
		button5.addActionListener(this);
		
		button6= new JButton("Back");
		button6.setBackground(c5);
        button6.setForeground(Color.WHITE);
		button6.setBounds(10,150,180,40);
		button6.addActionListener(this);
        


        // Add components to frame
        add(label1);
        add(textField);
		add(label2);
		add(button5);
		add(button6);

        // Set frame properties
        setTitle("Sollutions");
		setVisible(true);
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==button6)
		{
			this.setVisible(false);
			new ThreeButtons(login_obj);
		}
		else if(e.getSource()==button5)
		{
			this.setVisible(false);
			new Login();
		}
	}

    
}
