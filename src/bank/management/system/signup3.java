package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class signup3 extends JFrame implements ActionListener{
    JLabel label1, label2, label3,label4,label5,label6,label7,label8, label9,label10,label11,label12,label13,label14;
    JRadioButton r1,r2,r3,r4;
    JCheckBox s1,s2,s3,s4,s5,s6;
    ButtonGroup group = new ButtonGroup();
    JButton submit,cancel;
    String formno;


    signup3(String formno){
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
        r1.setBounds(100,150,200,30);
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(new Color(250,250,250));
        add(r1);

        r2 = new JRadioButton("Fixed Deposite");
        r2.setBounds(350,150,200,30);
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(new Color(250,250,250));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100,200,200,30);
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(new Color(250,250,250));
        add(r3);

        r4 = new JRadioButton("Reccuring Deposite");
        r4.setBounds(350,200,200,30);
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(new Color(250,250,250));
        add(r4);

        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        label4 = new JLabel("Card Number");
        label4.setBounds(100,270,200,30);
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label4);

        label5 = new JLabel("(Your 16-digit card number)");
        label5.setBounds(100,300,200,20);
        label5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(label5);

        label6 = new JLabel("XXXX-XXXX-XXXX-1957");
        label6.setBounds(350, 270, 400, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label6);

        label7 = new JLabel("(This will appears on yout atm card/cheque book and statements)");
        label7.setBounds(350, 300, 450,20 );
        label7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(label7);
        
        label8 = new JLabel("PIN");
        label8.setBounds(100,370,200,30);
        label8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label8);

        label9 = new JLabel("4-digit password");
        label9.setBounds(100,400,200,20);
        label9.setFont(new Font("Raleway", Font.BOLD, 12));
        add(label9);

        label10 = new JLabel("XXXX");
        label10.setBounds(350,370,200,30);
        label10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label10);

        label11 = new JLabel("Service Required:");
        label11.setBounds(100, 440, 200,30);
        label11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label11);

        s1 = new JCheckBox("ATM CARD");
        s1.setBounds(100,480,200,30);
        s1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s1);

        s2 = new JCheckBox("Cheque Book");
        s2.setBounds(350,480,200,30);
        s2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s2);

        s3 = new JCheckBox("e-statement");
        s3.setBounds(100,520,200,30);
        s3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s3);

        s4 = new JCheckBox("Email Alert");
        s4.setBounds(350,520,200,30);
        s4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s4);

        s5 = new JCheckBox("Internet Banking");
        s5.setBounds(100,560,200,30);
        s5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s5);

        s6 = new JCheckBox("Mobile banking");
        s6.setBounds(350,560,200,30);
        s6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(s6);

        label12 = new JLabel("Form No: ");
        label12.setBounds(600,5,100,30);
        label12.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label12);

        label13 = new JLabel("3472");
        label13.setBounds(700,5,100,30);
        label13.setFont(new Font("Rlaeway", Font.BOLD, 20));
        add(label13);

        submit = new JButton("Submit");
        submit.setBounds(100,600,120,30);
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.setBorderPainted(false);
        submit.setOpaque(true);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(330,600,120,30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 15));
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBorderPainted(false);
        cancel.setOpaque(true);
        cancel.addActionListener(this);
        add(cancel);





        setSize(850,800);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(111, 232, 208));
        setLayout(null);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = "";
        if(r1.isSelected()){
            atype = "Saving Account";
        }else if(r2.isSelected()){
            atype = "Fixed Deposite";
        }else if(r3.isSelected()){
            atype = "Current Account";
        }else{
            atype = "Reccuring Deposite";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong()%90000000L) + 1409963000000000L;
        String cardno = ""+Math.abs(first7);

        long first3 = (ran.nextLong()%9000L) + 1000L;
        String pin = ""+Math.abs(first3);

        String fac = "";
        if (s1.isSelected()) {
            fac += "ATM CARD";
        }else if (s2.isSelected()) {
            fac += "Cheque Book";
        }else if (s3.isSelected()) {
            fac += "e-statement";
        }else if (s3.isSelected()) {
            fac += "Email Alert";
        }else if (s3.isSelected()) {
            fac += "Internet Banking";
        }else if (s3.isSelected()) {
            fac += "Mobile banking";
        }

        try{
            if (e.getSource()==submit) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the field");
                }else{
                    con c1 = new con();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardno+"\nPin: "+pin);
                    new deposit(pin);
                    setVisible(false);
                }
            }else if (e.getSource() == cancel) {
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new signup3(" ");
    }
}
