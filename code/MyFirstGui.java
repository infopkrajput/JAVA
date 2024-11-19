//ALL THE CLASSES STARING WITH J ALL LIE IN JAVA SWING PACKAGE

import javax.swing.*;
import java.awt.*;

public class MyFirstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//f.setDefaultCloseOperation(JFrame.Do_NOTHING_ON_CLOSE);
		f.setTitle("My First Frame");
		f.setSize(400, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.yellow);
		f.setLayout(null);

		JButton b1 = new JButton("Ok");
		b1.setBounds(20, 20, 60, 40);
		f.add(b1);

		JLabel l1 = new JLabel("Enter number");
		l1.setBounds(20, 80, 100, 40);
		f.add(l1);

		JTextField t1 = new JTextField();
		t1.setBounds(120, 90, 120, 23);
		f.add(t1);
		f.setVisible(true);
	}
}
