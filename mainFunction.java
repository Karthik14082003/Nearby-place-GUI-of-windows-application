package FirstProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainFunction implements ActionListener{
	JFrame frame=new JFrame();
	ImageIcon image=new ImageIcon("C:/Users/Karthik/eclipse-workspace/FirstProject/wlcm.jpg");
	JLabel label=new JLabel();
	JButton b=new JButton("Next");
	mainFunction(){
		b.setBounds(650,600,100,30);
		b.setFocusable(false);
		b.setBackground(Color.green);
		b.setOpaque(true);
		b.setForeground(Color.blue);
		b.addActionListener(this);
		frame.add(b);
		label.setBounds(400,100,700,700);
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setIcon(image);
	    frame.setSize(1560,867);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.white);
		frame.add(label);
		
		
		
	}

	public static void main(String[] args) {
		
		mainFunction my=new mainFunction();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			new forFrame();
		}
		
	}

}
