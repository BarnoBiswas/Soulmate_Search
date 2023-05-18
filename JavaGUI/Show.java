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
public class Show extends JFrame implements ActionListener 
{

    private JLabel label1,label2;
    private JTextField textField,textField2;
    private JButton getSolutionButton, requestButton, logoutButton,DoneButton,button,button1,button2,button5;
	private FileWriter FW;

    public Show() {

        
        setLayout(null);

        
        label1 = new JLabel("Email");
		label1.setBounds(350, 100, 120, 30);
		
		label2 = new JLabel("Solution Link");
		label2.setBounds(350, 150, 120, 30);
		
		
		textField = new JTextField();
		textField.setBounds(480, 100, 200, 30);
		
		
        textField2 = new JTextField();
		textField2.setBounds(480, 150, 200, 30);
		
		
        DoneButton = new JButton("Done");
		DoneButton.setBounds(600, 365, 100, 30);

       
		Color c1 = new Color(102,102,102);
		Color ct = new Color(0,0,0);
		Color c2 = new Color(102,102,102);
	   
		button1=new JButton("User List");
		button1.setBackground(c1);
        button1.setForeground(Color.WHITE);
		
		
		button=new JButton("Requested");
		Color c = new Color(204,204,204);
		button.setBackground(c2);
        button.setForeground(Color.WHITE);
		
		
		
		button2=new JButton("Give Solution");
		button2.setBackground(c);
        button2.setForeground(ct);
		
		
		
		button5=new JButton("Logout");
		Color c5 = new Color(102,102,102);
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);
		
		
		button.setBounds(10,75,180,40);
		button1.setBounds(10,25,180,40);
		button2.setBounds(10,125,180,40);
		button5.setBounds(10,350,180,40);
		
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button5.addActionListener(this);
		DoneButton.addActionListener(this);
        


        // Add components to frame
        add(label1);
        add(textField);
		add(label2);
        add(textField2);
		add(button);
		add(button1);
		add(button2);
		add(button5);
		add(button1);
		
        add(DoneButton);

        // Set frame properties
        setTitle("Sollutions");
		setVisible(true);
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==DoneButton)
		{
				try{
					
				String str = textField.getText()+","+textField2.getText()+"\n";
					
				FW= new FileWriter("All Text Files/SolutionFromAdmin.txt",true);
				
				FW.write(str);

				FW.close();
				
				
			}
			catch(Exception E)
			{
				
			}
			textField.setText("");
			textField2.setText("");
			JOptionPane.showMessageDialog(this,"Request Ssolved!");  
		}
		else if(e.getSource()==button1)
		{
			this.setVisible(false);
			new UserList();
		}
		else if(e.getSource()==button)
		{
			this.setVisible(false);
			new Requested();
		}
		else if(e.getSource()==button2)
		{
			this.setVisible(false);
			new Show();
		}
		else if(e.getSource()==button5)
		{
			this.setVisible(false);
			new Login();
		}
	}

    public static void main(String[] args) {
        Show show = new Show();
        show.setVisible(true);
    }
}
