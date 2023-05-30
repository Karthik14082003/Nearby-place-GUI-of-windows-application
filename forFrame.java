package FirstProject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class forFrame extends JFrame implements ActionListener{
      
	JFrame frame=new JFrame();
    JComboBox box;
    ImageIcon bank=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/bank.jpg");
    ImageIcon bunk=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/bunk.jpg");
    ImageIcon cloths=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/cloths.jpg");
    ImageIcon makeup=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/makeup.jpg");
    ImageIcon slipper=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/slipper.jpg");
    JLabel bankLabel=new JLabel();
    JLabel bunkLabel=new JLabel();
    JLabel clothLabel=new JLabel();
    JLabel makeupLabel=new JLabel();
    JLabel slipperLabel=new JLabel();
	forFrame(){
		 bankLabel.setIcon(bank);
		 bankLabel.setText("<html>This Site is make your work easy by gives solutions as per your instructions<br/>Just select your district and area and find your nearby shops<br/>Select Your District and Find your nearby shops and other Buildings Easily.");
		 bankLabel.setForeground(Color.blue);
		 bankLabel.setFont(new Font("MV Bolo",Font.ITALIC,15));
		 bunkLabel.setIcon(bunk);
		 clothLabel.setIcon(cloths);
		 makeupLabel.setIcon(makeup);
		 slipperLabel.setIcon(slipper);
	     String[] cities= {"Districts","Tumkur","Chikka mangalur","Bangalore"};
	 	  box=new JComboBox(cities);
	 	  box.addActionListener(this);
	     frame.setSize(1560,867);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		frame.getContentPane().setBackground(Color.pink);
		frame.setTitle("Search Nearby Shop");
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		frame.add(bankLabel);
		frame.add(bunkLabel);
		frame.add(clothLabel);
		frame.add(makeupLabel);
		frame.add(slipperLabel);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
          if(e.getSource()==box) {
        	  String a="Tumkur";
        	  if(box.getSelectedItem()==a) {
        		 // new TumkurWindow();
        		  //frame.disable();
        		new TumkurWindow();
        	  }
          }
		
	}
}
