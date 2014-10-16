import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create frame
		JFrame frame = new JFrame("GridLayout Demo");
		//frame.setLayout(new GridLayout(2,2));
		//create panels
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,2));
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,2));
		
		//create buttons
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		//add buttons to panels 1 and 2
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		//add panels to frame and set Layout
		frame.add(p1,BorderLayout.SOUTH);
		frame.add(p2, BorderLayout.CENTER);
		
		//frame size
		frame.setSize(400,100);
		frame.setLocationRelativeTo(null);
		frame.pack();
		//set visible
		frame.setVisible(true);
	}

}