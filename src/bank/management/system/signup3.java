package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class signup3 extends JFrame{
    JLabel label1, label2, label3,label4,label5;
    JRadioButton r1,r2,r3,r4;


    signup3(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,5,100,100);
        add(image);

        label1 = new JLabel("Page no. 3");
        label1.setBounds(300,20,200,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label1);

        label2 = new JLabel("Account Details");
        label2.setBounds(300, 70, 200,40);
        label2.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label2);

        label3 = new JLabel("Account Type");
        label3.setBounds(100,130,200,40);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);


        setSize(850,800);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(34, 40, 143));
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new signup3();
    }
}
