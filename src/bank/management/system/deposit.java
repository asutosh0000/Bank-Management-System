package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class deposit extends JFrame{

    String pin;
    JTextField textField;
    JButton deposit, cancel;

    deposit(String pin){
        this.pin = pin;
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image I2 = I1.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,180,400,35);
        label1.setForeground(Color.WHITE);
        image.add(label1);

        textField = new JTextField();
        textField.setBounds(460,230,320,25);
        textField.setBackground(new Color(65,125,125));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        deposit = new JButton("Deposit");
        deposit.setBackground(new Color(65,125,125));
        deposit.setBorderPainted(false);
        deposit.setOpaque(true);
        deposit.setForeground(Color.WHITE);
        deposit.setBounds(700,365,150,35);
        deposit.setFont(new Font("Raleway", Font.BOLD, 20));
        // deposit.addActionListener(this);
        image.add(deposit);

        cancel = new JButton("Cancel");
        // cancel.setBounds();



        setLayout(null);
        setLocation(0,0);
        setSize(1550,1080);
        setVisible(true);
    }
    public static void main(String[] args) {
        new deposit("");
    }
}
