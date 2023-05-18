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

public class AboutUs extends JFrame implements ActionListener {
   
    
    private JButton backButton;
    private JLabel l1;
    private JPanel p1;
	
	
    
    public AboutUs() {
        super("AboutUs");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,800, 450);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.WHITE);
		p1.setLayout(null);
		
		backButton = new JButton("Back");
        backButton.setBounds(700, 10, 80, 23);
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		p1.add(backButton);
		
		ImageIcon ic = new ImageIcon("./Recources/AboutUs.png");
		l1 = new JLabel(ic);
	    l1.setBounds(0,0,786,415);
        p1.add(l1);
		

		this.add(p1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==backButton)
		{
			setVisible(false);
			new Login();
		}
	}
	
	
}