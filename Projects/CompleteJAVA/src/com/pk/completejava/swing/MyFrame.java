package com.pk.completejava.swing;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // create a constructor to call automatically when the object is created
    MyFrame() {
        // create a frame with title
        this.setTitle("My Frame"); // set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setSize(500, 500); // set the x-dimension and y-dimension of the frame
        this.setResizable(true); // prevent frame from being resized
        this.setVisible(true); // make the frame visible

        // Insert an image and convert it to icon
        ImageIcon icon = new ImageIcon("src/com/pk/completejava/swing/PKComputerWhite.png"); // create an ImageIcon
        this.setIconImage(icon.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(155,0,255)); // change color of background

        // create a label
        JLabel label = new JLabel();
        label.setText("Hello, World!"); // set text of label
        this.add(label); // add label to frame

        ImageIcon image = new ImageIcon("src/com/pk/completejava/swing/PKComputerWhite.png"); // create an ImageIcon
        label.setIcon(image); // set image to label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        // image size and alignment
        label.setIconTextGap(25); // set gap of text to image
        label.setForeground(new Color(255, 0, 0)); // set color of text






    }

}
