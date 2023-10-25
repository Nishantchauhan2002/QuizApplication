package quiz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.white);//for picking the content of the frame and 
		//want any kind of change in the frame like its background color 
		setLayout(null);//here we are telling the swing that we don't want to use uour iwn layout we will create our own 
		
		
		ImageIcon i1 = new ImageIcon(System.getProperty("user.dir")+ "\\src\\icons\\login.jpeg");
//		ImageIcon i1=new ImageIcon(getClass().getClassLoader().getSystemResource("icons/login.jpeg")); 
		JLabel image=new JLabel(i1); //passing the image as a component in the add function that is used the component on the jframe
		image.setBounds(0,0,600,500);//set the picture property (left,up,width,height)
		add(image);
		
		
		
		JLabel heading =new JLabel("Simple minds");
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));//(font style,font type,fontsize)
//		heading.setForeground(Color.blue);//for changing the color of the font 
		heading.setForeground(new Color(30, 144, 254));
		heading.setBounds(750,60,300,45);
		add(heading);
	
		
		JLabel name=new JLabel("Enter your name");
		name.setBounds(810,150,300,25);
		name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		name.setForeground(new Color(30, 144, 254));
		add(name);
		
		tfname=new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(735,270,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.white);
		rules.addActionListener(this); // we add this because here some action is performd
		add(rules);
		
		
		back=new JButton("Exit");
		back.setBounds(915,270,120,25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
	
		setSize(1200,500); // for fixing the size of the frame
		setLocation(200,200);//for fixing the location of the frame on the screen 
		setVisible(true);// for the visiblity of the frame on the desktop screen by default its false 
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
			
		}else if(ae.getSource()==back) {
			setVisible(false);
			
		}
	}
	public static void main(String[] args) {
		new Login();
	}
}
