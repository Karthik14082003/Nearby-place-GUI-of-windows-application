package FirstProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
        
public class TumkurWindow implements ActionListener{
	 JComboBox box;
	 ImageIcon makeup=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/makeup.jpg");
	    ImageIcon slipper=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/slipper.jpg");
	 JFrame frame=new JFrame();
	 JLabel makeupLabel=new JLabel();
	    JLabel slipperLabel=new JLabel();
	    JLabel bankLabel=new JLabel();
	    //JLabel Label=new JLabel();
	    Border border=BorderFactory.createLineBorder(Color.green,2);
	 TumkurWindow(){
		 makeupLabel.setIcon(makeup);
		 slipperLabel.setIcon(slipper);
		
		     String[] cities= {"Areas","SITBackgate","MG road","University Road"};
		 	 box=new JComboBox(cities);
		 	 box.addActionListener(this);
		    frame.setSize(1560,867);
		    frame.setLayout(new FlowLayout());
			frame.add(box);
			frame.getContentPane().setBackground(Color.pink);
			makeupLabel.setText("Enter your area name and find nearby shops and Buildings.");
			makeupLabel.setHorizontalTextPosition(JLabel.LEFT);
			makeupLabel.setFont(new Font("MV Bolo",Font.ITALIC,15));
			//makeupLabel.setBackground(Color.white);
			//makeupLabel.setOpaque(true);
			makeupLabel.setForeground(Color.blue);
			//makeupLabel.setBorder(border);
			frame.setTitle("Search Nearby Shop");
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);	
			frame.add(makeupLabel);
			frame.add(slipperLabel);
			//frame.add(Label);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==box) {
      	  String a="SITBackgate";
      	  if(box.getSelectedItem()==a) {
      		 // new TumkurWindow();
      		  //frame.disable();
      		new firstwindow();
      	  }
        }
		
	}
	
	
		
	}

