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

public class NidiBio extends JFrame implements ActionListener {
   
    private JButton visitButton;
    private JButton backButton;
    private JLabel l1;
    private JPanel p1;
	private ThreeButtons threeButtons_obj;
	private ChooseFemale choosefemale_obj;
	private Login login_obj;
    
    public NidiBio(ChooseFemale choosefemale_obj,ThreeButtons threeButtons_obj,Login login_obj) {
       super("NidheBio");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		this.choosefemale_obj=choosefemale_obj;
		this.threeButtons_obj=threeButtons_obj;
		this.login_obj=login_obj;
		
		p1 = new JPanel();
		p1.setBounds(0,0,800, 450);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.WHITE);
		p1.setLayout(null);
		
		backButton = new JButton("Back");
        backButton.setBounds(10, 10, 80, 23);
		backButton.addActionListener(this);
		p1.add(backButton);
		
		visitButton = new JButton("Visit FaceBook Profile");
        visitButton.setBounds(593, 375, 180, 25);
		visitButton.setFocusable(false);
		visitButton.addActionListener(this);
		p1.add(visitButton);
		
		
		ImageIcon ic = new ImageIcon("./Recources/NidiB.png");
		l1 = new JLabel(ic);
	    l1.setBounds(0,0,786,415);
        p1.add(l1);
		
		
		
		
		
		this.add(p1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==visitButton)
		{
			this.setVisible(false);
			new NidiScan(this,choosefemale_obj,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==backButton)
		{
			this.setVisible(false);
			new ChooseFemale(threeButtons_obj,login_obj);
		}
	}
	
	
}