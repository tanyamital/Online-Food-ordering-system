package ooc1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Restaurant implements ActionListener 
{ 
	JFrame f1;
	Label l1;
	Button b1;
	Restaurant()
	{
		f1=new JFrame();
		
		f1.getContentPane().setBackground(Color.pink);
		l1=new Label("                                          B N M   C A F E  ");
		l1.setBounds(200,50,360,60);
		l1.setBackground(Color.black);
		f1.add(l1);
		
		Font font = new Font("Algerian", Font.BOLD, 12);
		l1.setFont(font);
		l1.setForeground(Color.white);
		
		b1=new Button(" ORDER YOUR FOOD ");
		b1.setBounds(300,450,150,80);
		b1.setBackground(Color.black);
		f1.add(b1);
		
		Font font1 = new Font("Algerian", Font.BOLD, 12);
		b1.setFont(font1);
		b1.setForeground(Color.white);
		
		b1.addActionListener(this);
		
		f1.setSize(700,600);  
        f1.setLayout(null);  
        f1.setVisible(true);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f1.dispose();
			Body body=new Body();
			body.setVisible(true);
		}
	}
	public static void main(String[] args) 
	{
		new Restaurant();
	}
	
}


