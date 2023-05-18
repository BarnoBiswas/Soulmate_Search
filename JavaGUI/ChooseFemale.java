package JavaGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

class ChooseFemale extends JFrame implements ActionListener
{
	 
	private JLabel l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	private JButton backButton;
	private JPanel p1,p2;
	private Login login_obj;
	private ThreeButtons threeButtons_obj;
	

	
	public ChooseFemale(ThreeButtons threeButtons_obj,Login login_obj)
	{
		super("Choose Female");
		this.setSize(900,680);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		this.threeButtons_obj=threeButtons_obj;
		this.login_obj=login_obj;
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,900,680);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.WHITE);
		p1.setLayout(null);
		
		
    //JLabel	
		l2 = new JLabel("Choose Anyone To Know More Details.");
		l2.setBounds(180,30,600,50);
		l2.setFont(new Font("Segoe UI",Font.BOLD,28));
		p1.add(l2);
	
		
		
		l4 = new JLabel("Ashfiana Euki");
		l4.setBounds(115,320,200,15);
		l4.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l4);
		
		l5 = new JLabel("Zakia Sultana");
		l5.setBounds(400,315,200,15);
		l5.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l5);
		
		l6 = new JLabel("Nusrat Nite");
		l6.setBounds(115,540,150,15);
		l6.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l6);
		
		l7 = new JLabel("Richie Debnath");
		l7.setBounds(400,540,200,15);
		l7.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l7);
		
		l8 = new JLabel("Nusrat Nidhe");
		l8.setBounds(700,318,130,15);
		l8.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l8);
		
		l9 = new JLabel("Sraboni Dutta");
		l9.setBounds(685,540,130,15);
		l9.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l9);
		
		
	
	 
		
		ImageIcon icon3 = new ImageIcon("./Recources/EukiBP.jpg");
		b4 = new JButton(icon3);
		b4.setBounds(40,145,230,170);
	    b4.addActionListener(this);
	    b4.setFocusable(false);
	    b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Recources/ZakiaBP.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(335,140,230,170);
	    b5.addActionListener(this);
	    b5.setFocusable(false);
	    b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Recources/NitiBP.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(40,365,230,170);
	    b6.addActionListener(this);
	    b6.setFocusable(false);
	    b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Recources/RicheBP.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(340,360,230,170);
	    b7.addActionListener(this);
	    b7.setFocusable(false);
	    b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b7);
		
		ImageIcon icon8 = new ImageIcon("./Recources/NidiBP.jpg");
		b8 = new JButton(icon8);
		b8.setBounds(620,145,230,170);
	    b8.addActionListener(this);
	    b8.setFocusable(false);
	    b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b8);
		
		ImageIcon icon9 = new ImageIcon("./Recources/SraboniBP.jpg");
		b9 = new JButton(icon9);
		b9.setBounds(620,365,230,170);
	    b9.addActionListener(this);
	    b9.setFocusable(false);
	    b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b9);
		
		backButton = new JButton("Back");
        backButton.setBounds(10, 10, 80, 23);
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		p1.add(backButton);
	
		
		this.add(p1);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b4)
		{
			this.setVisible(false);
			new EukiBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==b5)
		{
			this.setVisible(false);
			new ZakiaBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==b6)
		{
			this.setVisible(false);
			new NusratBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==b7)
		{
			this.setVisible(false);
			new RicheBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==b8)
		{
			this.setVisible(false);
			new NidiBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==b9)
		{
			this.setVisible(false);
			new SraboniBio(this,threeButtons_obj,login_obj);
		}
		else if(e.getSource()==backButton)
		{
			this.setVisible(false);
			new ThreeButtons(login_obj);
		}
	}
		
	public static void main(String [] args)
	{
		//new ChooseFemale();
	
	}
		
}
	