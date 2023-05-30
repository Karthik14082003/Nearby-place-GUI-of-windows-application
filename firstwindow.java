package FirstProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class firstwindow implements ActionListener{
	 JButton b1=new JButton("CLOTHES CENTERS");
     JButton b2=new JButton("SLIPPERS SHOPS");
	 JButton b3=new JButton("PETROL BUNK");
     JButton b4=new JButton("BACKERIES");
	 JButton b5=new JButton("COSMETIC SHOPS");
     JButton b6=new JButton("HOTELS");
     JButton last=new JButton("(after find your results Just click me)");
     JLabel label=new JLabel();
     JFrame frame=new JFrame();
     JLabel label2=new JLabel();
     ImageIcon image=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/tq.jpeg");
        firstwindow(){
        	
        	label.setBounds(0,200,1000,200);
        	label2.setBounds(400,400,500,500);
         last.setBounds(0,400,400,40);
   	     last.setFocusable(false);
   	     last.setBackground(Color.green);
   	     last.setForeground(Color.blue);
   	     last.setFocusable(false);
   	     b1.setBounds(0,100,200,40);
   	     b1.setFocusable(false);
   	     b1.setBackground(Color.green);
   	     b1.setForeground(Color.blue);
   	     b2.setBounds(250,100,200,40);
   	     b2.setFocusable(false);
   	     b2.setBackground(Color.green);
   	     b2.setForeground(Color.blue);
   	     b3.setBounds(500,100,200,40);
	     b3.setFocusable(false);
	     b3.setBackground(Color.green);
	     b3.setForeground(Color.blue);
   	     b4.setBounds(750,100,200,40);
	     b4.setFocusable(false);
	     b4.setBackground(Color.green);
	     b4.setForeground(Color.blue);
   	     b5.setBounds(1000,100,200,40);
	     b5.setFocusable(false);
	     b5.setBackground(Color.green);
	     b5.setForeground(Color.blue);
   	     b6.setBounds(1250,100,200,40);
	     b6.setFocusable(false);
	     b6.setBackground(Color.green);
	     b6.setForeground(Color.blue);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     b3.addActionListener(this);
	     b4.addActionListener(this);
	     b5.addActionListener(this);
	     b6.addActionListener(this);
	     frame.add(last);
	     last.addActionListener(this);
   	    frame.setLayout(null);
		//frame.add(box);
   	    frame.add(b1);
	    frame.add(b2);
	    frame.add(b3);
	    frame.add(b4);
	    frame.add(b5);
	    frame.add(b6);
	    frame.setSize(1560,867);
	    frame.setLayout(null);
		frame.getContentPane().setBackground(Color.pink);
		frame.setTitle("Search Nearby Shop");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
        }
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				label.setBackground(Color.red);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>CLOTH CENTERS<br/>1. Name:Trends || Adress: 15th cross || Landmark : Near Sagar PG<br/>2. Name :Peter England || adress : 7th cross || LandMark : Near Tindi box</html>");
				
			}
			else if(e.getSource()==b2) {
				label.setBackground(Color.YELLOW);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>Slippers Shop<br/>1. Name:Bata || Adress: 12th cross || Landmark : opposite to Sagar PG<br/>2. Name :Ajay shoe shop || adress : 8th cross || LandMark : Near Vaishya Bank</html>");
				
				//frame.add(last);
			}
			else if(e.getSource()==b3) {
				label.setBackground(Color.GREEN);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>PETRO BUNK<br/>1. Name:BHARATH PETROLEAM || Adress: 12th cross || Landmark : Near to Sagar PG</html>");
				//frame.add(last);
			}
			else if(e.getSource()==b4) {
				label.setBackground(Color.WHITE);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>BAKERIES<br/>1. Name:HASSAN AIYANGAR BAKERY || Adress: 12th cross || Landmark : ground flore of Sagar PG</html>");
				//frame.add(last);
			}else if(e.getSource()==b4) {
				label.setBackground(Color.WHITE);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>COSMETICS SHOP<br/>1. Name: NEW U || Adress: 8th cross || Landmark : opposite to vaishya co-operative Bank</html>");
				//frame.add(last);
			}
			else if(e.getSource()==b5) {
				label.setBackground(Color.lightGray);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>COSMETICS SHOP<br/>1. Name: NEW U || Adress: 8th cross || Landmark : opposite to vaishya co-operative Bank</html>");
				//frame.add(last);
			}
			else if(e.getSource()==b6) {
				label.setBackground(Color.WHITE);
	        	label.setOpaque(true);
				frame.add(label);
				label.setText("<html>HOTELS<br/>1. Name: Tindi Box|| Adress: 7th cross || Landmark : Near Siddaganga convension hall</html>");
				//frame.add(last);
			}
			else if(e.getSource()==last) {
				frame.add(label2);//label2.setText("THANK YOU");
				//frame.add(last);
				label2.setIcon(image);
			}
			
		}
}
