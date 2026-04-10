

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainClass extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    mainClass(String pin){
        this.pin =pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label = new JLabel("Please select your transaction:");
        label.setBounds(450,170,350,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setOpaque(true);
        b1.setBorderPainted(false);
        b1.setBounds(680,270,160,27);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("WITHDRAWL");
        b2.setBounds(680,320,160,27);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setOpaque(true);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(680,370,160,27);
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.setOpaque(true);
        b3.setBorderPainted(false);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(680,420,160,27);
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.setOpaque(true);
        b4.setBorderPainted(false);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("CHANGE PIN");
        b5.setBounds(410,270,150,27);
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.setOpaque(true);
        b5.setBorderPainted(false);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE INQ");
        b6.setBounds(410,320,150,27);
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.setOpaque(true);
        b6.setBorderPainted(false);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(410,370,150,27);
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.setOpaque(true);
        b7.setBorderPainted(false);
        b7.addActionListener(this);
        image.add(b7);
        

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            new deposit(pin);
            setVisible(false);
        }else if(e.getSource()==b2){
            new withdrawl(pin);
            setVisible(false);
        }else if(e.getSource()==b3){
            new fastCash(pin);
            setVisible(false);
        }else if(e.getSource()==b6) {
            new balanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource()==b7){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new mainClass("");
    }
}
