package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class signup3 extends JFrame{
    JLabel label1, label2, label3,label4,label5;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup group = new ButtonGroup();


    signup3(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,5,100,100);
        add(image);

        label1 = new JLabel("Page no. 3");
        label1.setBounds(300,20,200,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label1);

        label2 = new JLabel("Account Details");
        label2.setBounds(300, 60, 200,40);
        label2.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label2);

        label3 = new JLabel("Account Type");
        label3.setBounds(100,110,200,40);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,140,150,40);
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(250,250,250));
        add(r1);

        r2 = new JRadioButton("Fixed Deposite");
        r2.setBounds(250,140,150,40);
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(250,250,250));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(400,140,150,40);
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(250,250,250));
        add(r3);

        r4 = new JRadioButton("Reccuring Deposite");
        r4.setBounds(550,140,180,40);
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(250,250,250));
        add(r4);

        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);


        setSize(850,800);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(111, 232, 208));
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new signup3();
    }
}
