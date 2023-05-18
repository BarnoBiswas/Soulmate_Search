package JavaGUI;

import java.lang.*;
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


public class PartnerPreferenceGUI extends JFrame implements ActionListener 
{
	
	    private Font fontstyle1;
		private Font fontstyle2;
		private JTextArea tArea;
		private JPanel panel;
		private JLabel label1,label2,label3,label4;
		private JButton backButton, doneButton;
		private Login login_obj;
		private ThreeButtons threeButtons_obj;
		private JComboBox<String> ageRangeComboBox,bankBalanceComboBox,religionComboBox,countryComboBox;
		public FileWriter FW;
		public String email;
		
		
		

    public PartnerPreferenceGUI(ThreeButtons threeButtons_obj,Login login_obj)
	{
        setTitle("Partner Preference Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.threeButtons_obj=threeButtons_obj;
		this.login_obj=login_obj;
		
		
		email=this.login_obj.get_email();
		
		
		
		fontstyle1 = new Font("Chesna Grotesk", Font.BOLD, 20);
		fontstyle2 = new Font("Chesna Grotesk", Font.BOLD, 12);
		
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("./Recources/L3.png");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,786,415);
		
		JLabel emailRangeLabel = new JLabel("Logged in as- " + email);
        emailRangeLabel.setBounds(30, 20, 350, 30);
		emailRangeLabel.setForeground(Color.cyan);
		emailRangeLabel.setFont(new Font("Chesna Grotesk", Font.BOLD, 14));
        add(emailRangeLabel);

        JLabel partnerTypeLabel = new JLabel("Which type of partner do you want?");
        partnerTypeLabel.setBounds(20, 80, 500, 50);
		partnerTypeLabel.setForeground(Color.yellow);
		partnerTypeLabel.setFont(fontstyle1);
        add(partnerTypeLabel);
		
		
		
        JLabel ageRangeLabel = new JLabel("Age range:");
        ageRangeLabel.setBounds(40, 160, 90, 30);
		ageRangeLabel.setForeground(Color.yellow);
		ageRangeLabel.setFont(fontstyle2);
        add(ageRangeLabel);
		
		
        String[] ageRangeOptions = {"18-25", "26-30", "31-35", "36-40", "40+"};
        ageRangeComboBox = new JComboBox<>(ageRangeOptions);
        ageRangeComboBox.setBounds(130, 165, 175, 25);
        add(ageRangeComboBox);

        JLabel bankBalanceLabel = new JLabel("Bank balance:");
        bankBalanceLabel.setBounds(40, 200, 90, 30);
		bankBalanceLabel.setForeground(Color.yellow);
		bankBalanceLabel.setFont(fontstyle2);
        add(bankBalanceLabel);
        String[] bankBalanceOptions = {"Less than $10000", "$10000-$50000", "$50000-$100000", "More than $100,000"};
        
		bankBalanceComboBox = new JComboBox<>(bankBalanceOptions);
        bankBalanceComboBox.setBounds(130, 205, 175, 25);
        add(bankBalanceComboBox);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setBounds(40, 240, 90, 30);
		religionLabel.setForeground(Color.yellow);
		religionLabel.setFont(fontstyle2);
        add(religionLabel);
        String[] religionOptions = {"Islam", "Hinduism", "Buddhism", "Christianity", "Other"};
        religionComboBox = new JComboBox<>(religionOptions);
        religionComboBox.setBounds(130, 245, 175, 25);
        add(religionComboBox);
		
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(40, 280, 90, 30);
		countryLabel.setForeground(Color.yellow);
		countryLabel.setFont(fontstyle2);
        add(countryLabel);
        String[] countryOptions = {"Bangladesh", "America", "Canada", "Japan", "Other"};
        countryComboBox = new JComboBox<>(countryOptions);
        countryComboBox.setBounds(130, 285, 175, 20);
        add(countryComboBox);
		
		panel = new JPanel();
		panel.setBounds(452, 160, 230, 150);
		panel.setOpaque(false);
        add(panel);
		
		
		label1 = new JLabel();
		label1.setFont(new Font("Arial", Font.PLAIN, 15));
		label1.setBounds(5, 20, 200, 20);
		label1.setForeground(Color.WHITE);
		
		label2 = new JLabel();
		label2.setFont(new Font("Arial", Font.PLAIN, 15));
		label2.setBounds(5, 43, 200, 20);
		label2.setForeground(Color.WHITE);
		
		label3 = new JLabel();
		label3.setFont(new Font("Arial", Font.PLAIN, 15));
		label3.setBounds(5, 66, 200, 20);
		label3.setForeground(Color.WHITE);
		
		label4 = new JLabel();
		label4.setFont(new Font("Arial", Font.PLAIN, 15));
		label4.setBounds(5, 89, 200, 20);
		label4.setForeground(Color.WHITE);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		
		backButton = new JButton("Back");
        backButton.setBounds(20, 375, 80, 23);
		backButton.setFocusable(false);
        add(backButton);
        backButton.addActionListener(this);


        
        doneButton = new JButton("Done");
        doneButton.setBounds(690, 375, 80, 23);
		doneButton.setFocusable(false);
        add(doneButton);
        doneButton.addActionListener(this);

        setSize(800, 450);
        setLayout(null);
		
		add(BackgroundImage_label);
		
		setLocationRelativeTo(null);
        setVisible(true);
    }
	public void actionPerformed (ActionEvent E)
	{
		if(E.getSource()==backButton)
		{
			this.setVisible(false);
			new ThreeButtons(login_obj);
		}
		else if (E.getSource()==doneButton)
		{
			label1.setText("Age range: "+ageRangeComboBox.getSelectedItem().toString());
			label2.setText("Bank balance: "+bankBalanceComboBox.getSelectedItem().toString());
			label3.setText("Religion : "+religionComboBox.getSelectedItem().toString());
			label4.setText("Country : "+countryComboBox.getSelectedItem().toString());
			try{
				 String age =(String)ageRangeComboBox.getSelectedItem();
				 String bankbalance =(String)bankBalanceComboBox.getSelectedItem();
				 String religion =(String)religionComboBox.getSelectedItem();
				 String country=(String)countryComboBox.getSelectedItem();
				
				String Str =email+","+age+","+bankbalance+","+religion+","+country+"\n";
				
				
				FW= new FileWriter("All Text Files/RQPartners.txt",true);
				
				FW.write(Str);

				FW.close();
			}
			catch(Exception EX)
			{
				
			}
			JOptionPane.showMessageDialog(null,"Requested for such a pertner!");
		}
	}

     
} 