package JavaGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;



public class UserList extends JFrame implements ActionListener
{
	private JButton button, button1, button2,button5;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	private String[] column = {"Name", "Phone", "Email", "Password"};
	private ImageIcon img;
	private JLabel BackgroundImage;
	public FileReader reader;
    public BufferedReader bfreader;
    public String[] Names;
    public String[] Phones;
    public String[] Emails;
    public String[] Passwords;
	public String[] rows = new String[10000];
	
	public UserList()
	{
		super("User List");
		
		
		button1=new JButton("User List");
		Color c1 = new Color(204,204,204);
		Color ct = new Color(0,0,0);
		button1.setBackground(c1);
        button1.setForeground(ct);
		
		
		button=new JButton("Requested");
		Color c = new Color(102,102,102);
		button.setBackground(c);
        button.setForeground(Color.WHITE);
		
		
		
		button2=new JButton("Give Solution");
		Color c2 = new Color(102,102,102);
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		
		
		button5=new JButton("Logout");
		Color c5 = new Color(102,102,102);
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);
		
		
		button.setBounds(10,75,180,40);
		button1.setBounds(10,25,180,40);
		button2.setBounds(10,125,180,40);
		button5.setBounds(10,400,180,40);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button5.addActionListener(this);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
		Color ctb = new Color(102,102,102);
        table.setBackground(ctb);
        table.setRowHeight(50);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(170);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.setForeground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(240, 25, 500, 415);
        scroll.setBackground(Color.WHITE);

		
		String line;
        int Number_of_Lines = 0;

        try 
		{
            reader = new FileReader("All Text Files/UserInfo.txt");
            bfreader = new BufferedReader(reader);

            while ((line = bfreader.readLine()) != null) 
			{
                Number_of_Lines++;
            }

            // initialize arrays with appropriate size
            Names = new String[Number_of_Lines];
            Phones = new String[Number_of_Lines];
            Emails = new String[Number_of_Lines];
            Passwords = new String[Number_of_Lines];

            // reset reader to start from the beginning
            reader = new FileReader("All Text Files/UserInfo.txt");
            bfreader = new BufferedReader(reader);

            int i = 0;
            while ((line = bfreader.readLine()) != null) 
			{
                String[] parts = line.split(",");
                Names[i] = parts[2];
                Phones[i] = parts[3];
				Emails[i] = parts[0];
                Passwords[i] = parts[1];
                i++;
            }
            reader.close();
        } 
		catch (Exception E) 
		{

        }

        for (int i = 0; i < Number_of_Lines; i++)
		{
            rows[0] = Names[i]; // Name
            rows[1] = Phones[i]; // Phone
            rows[2] = Emails[i]; // Email
            rows[3] = Passwords[i]; // Password
            model.addRow(rows);
        }
		
		
		add(button);
		add(button1);
		add(button2);
		add(button5);
		add(scroll);
		
		
		setLayout(null);
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			setVisible(false);
			new Requested();
		}
		else if(e.getSource()==button1)
		{
			setVisible(false);
			new UserList();
		}
		else if(e.getSource()==button2)
		{
			setVisible(false);
			new Show();
		}
		else if(e.getSource()==button5)
		{
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String[] args)
	{
		new UserList();
	}
}