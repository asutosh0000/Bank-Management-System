package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class balanceEnquiry extends JFrame implements ActionListener{

    JLabel l2;
    JButton b1;
    String pin;
    balanceEnquiry(String pin){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1 = new JLabel("Your Current Balance is: ");
        l1.setBounds(430,180,700,35);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 15));
        image.add(l1);

        
        b1 = new JButton("Back");
        b1.setBackground(new Color(65,125,128));
        b1.setBorderPainted(false);
        b1.setOpaque(true);
        b1.setBounds(700,270,150,35);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        int balance = 0;

        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
        }

        l2 = new JLabel(""+balance);
        l2.setBounds(430,200,700,35);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway", Font.BOLD, 15));
        image.add(l2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new mainClass(pin);
    }
    public static void main(String[] args) {
        new balanceEnquiry("");
    }
}
