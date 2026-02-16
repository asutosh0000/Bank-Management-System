package bank.management.system;

import java.awt.Image;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class deposit extends JFrame{

    String pin;

    deposit(String pin){
        this.pin = pin;
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image I2 = I1.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(0,0,1500,800);
        add(image);



        setLayout(null);
        setLocation(0,0);
        setSize(1500,1000);
        setVisible(true);
    }
    public static void main(String[] args) {
        new deposit("");
    }
}
