import javax.swing.*;
import java.awt.*;
public class MySecondGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame f=new JFrame();

f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
f.setTitle("My First Frame");
f.setSize(400,300);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.green);
f.setLayout(null);



JButton b1=new JButton("ok");
b1.setBounds(20,20,60,40);
f.add(b1);


f.setVisible(true);
}
}