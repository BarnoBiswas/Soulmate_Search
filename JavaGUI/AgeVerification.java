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

public class AgeVerification extends JFrame implements ActionListener {
    private Font fontstyle1;
    private Font fontstyle2;
    private JButton yesButton;
    private JButton noButton;
    private JFrame frame;
    
    public AgeVerification() {
        
        frame = new JFrame("Age Verification");
        frame.setLayout(null);
        frame.setSize(800, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        fontstyle1 = new Font("Chesna Grotesk", Font.BOLD, 24);
        fontstyle2 = new Font("Chesna Grotesk", Font.BOLD, 18);

        JLabel BackgroundImage_label;
        ImageIcon img = new ImageIcon("./Recources/L1.png");
        BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
        BackgroundImage_label.setBounds(0,0,786,415);

        
        JLabel welcome = new JLabel("Welcome to");
        welcome.setBounds(500, 90, 500, 50);
        welcome.setForeground(Color.white);
        welcome.setFont(fontstyle1);
        frame.add(welcome);
		
		JLabel welcome1 = new JLabel("The Soulmate Search");
        welcome1.setBounds(440, 120, 500, 50);
        welcome1.setForeground(Color.white);
        welcome1.setFont(fontstyle1);
        frame.add(welcome1);

        JLabel questionLabel = new JLabel("Are you 18+?");
        questionLabel.setBounds(515, 200, 500, 50);
        questionLabel.setForeground(Color.yellow);
        questionLabel.setFont(fontstyle2);
        frame.add(questionLabel);

        
        yesButton = new JButton("Yes");
        yesButton.setBounds(500, 260, 65, 25);
		yesButton.setFocusable(false);
        frame.add(yesButton);
        yesButton.addActionListener(this);

        
        noButton = new JButton("No");
        noButton.setBounds(580, 260, 65, 25);
		noButton.setFocusable(false);
        frame.add(noButton);
        noButton.addActionListener(this);

        frame.add(BackgroundImage_label);

        
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == yesButton) {
            frame.setVisible(false);
            Login f3 = new Login();
        } else if (e.getSource() == noButton) {
            System.exit(0);
        }
    }
}
