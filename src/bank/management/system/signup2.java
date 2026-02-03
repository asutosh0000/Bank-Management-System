package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signup2 extends JFrame implements ActionListener{

    String formno;
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    int fieldWidth = 200;
    JTextField panField, adharField;
    JRadioButton s1Button, s2Button, e1Button,e2Button;
    ButtonGroup buttonGroup1, buttonGroup2;
    JButton next;



    signup2(String firse){
        super("Applicatio Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);

        this.formno = formno;

        l1 = new JLabel("Page 2: ");
        l1.setFont(new Font("Raleway",Font.BOLD, 25 ));
        l1.setBounds(300,30,400,30);
        add(l1);

        l2 = new JLabel("Additional Details");
        l2.setBounds(300, 70, 400, 30 );
        l2.setFont(new Font("Raleway", Font.BOLD, 25));
        add(l2);

        l3 = new JLabel("Religion: ");
        l3.setBounds(100,120, 200, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l3);

        String religions[] = {"Select", "Hindu", "Muslim", "Sikh", "Isai", "Other"};
        comboBox = new JComboBox<>(religions);
        comboBox.setBackground(new Color(120, 130,23));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, fieldWidth, 30);
        add(comboBox); 

        l4 = new JLabel("Catagory: ");
        l4.setBounds(100, 160, 200, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l4);

        String catagory[] = {"Select", "General", "OBC", "SC", "ST"};
        comboBox2 = new JComboBox<>(catagory);
        comboBox2.setBackground(new Color(200,200,200));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 160, fieldWidth,30);
        add(comboBox2);

        l5 = new JLabel("Income: ");
        l5.setBounds(100, 200, 200, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l5);


        String income[] = {"Select", "Null", "<1,50,000", "<2,50,000", "<5,00,000", "<10,00,000", ">10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(200,200,200));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 200, fieldWidth,30);
        add(comboBox3);

        l6 = new JLabel("Education: ");
        l6.setBounds(100,240,200,30);
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l6);

        String education[] = {"Select", "Non Graduate","Graduate", "Post Graduate", "Doctorate", "Other"};
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(200,200,200));
        comboBox4.setBounds(350,240,fieldWidth,30);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox4);

        l7 = new JLabel("Occupation:");
        l7.setBounds(100, 280, 200, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l7);

        String occupation[] = {"Select", "Student", "Salaried", "Self Emplaoyer", "Bussiness", "Retired"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBounds(350, 280, fieldWidth, 30);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBackground(new Color(200,200,200));
        add(comboBox5);

        l8 = new JLabel("Pan No:");
        l8.setBounds(100, 320, 200, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l8);

        panField = new JTextField();
        panField.setBounds(350, 320, fieldWidth, 30);
        panField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(panField);

        l9 = new JLabel("Adhar No:");
        l9.setBounds(100, 360, 200, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l9);

        adharField = new JTextField();
        adharField.setBounds(350, 360, fieldWidth, 30);
        adharField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(adharField);

        l10 = new JLabel("Senior Citizen:");
        l10.setBounds(100, 400, 200, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l10);

        s1Button = new JRadioButton("Yes");
        s1Button.setBackground(new Color(200,200,200));
        s1Button.setBounds(350,400,100,30);
        s1Button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(s1Button);

        s2Button = new JRadioButton("No");
        s2Button.setBackground(new Color(200,200,200));
        s2Button.setBounds(450,400,100,30);
        s2Button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(s2Button);

        l11 = new JLabel("Existing Account:");
        l11.setBounds(100, 440, 200, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l11);

        e1Button = new JRadioButton("Yes");
        e1Button.setBackground(new Color(200,200,200));
        e1Button.setBounds(350,440,100,30);
        e1Button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(e1Button);
        e2Button = new JRadioButton("No");
        e2Button.setBackground(new Color(200,200,200));
        e2Button.setBounds(450,440,100,30);
        e2Button.setFont(new Font("Raleway", Font.BOLD, 14));
        add(e2Button);

        // buttonGroup2.add(e1Button);
        // buttonGroup2.add(e2Button);

        l12 = new JLabel("Form No. ");
        l12.setBounds(620,10,150,30);
        l12.setFont(new Font("Raleway", Font.BOLD, 25));
        add(l12);

        l13 = new JLabel(formno);
        l13.setBounds(790, 10,100,30);
        l13.setFont(new Font("Raleway", Font.BOLD, 25));
        add(l13);

        next = new JButton("Next");
        next.setBounds(700,650,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBorderPainted(false);
        next.setOpaque(true);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        add(next);


        setSize(850, 750);
        setLocation(450, 80);
        setLayout(null);
        getContentPane().setBackground(new Color(250,134,1));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
    }
    public static void main(String[] args) {
        new signup2("");
        
    }
}
