package bank.management.system;

// import com.toedter.calendar.JDateChooser;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class signup extends JFrame implements ActionListener{
    Random ran = new Random();
    int temp = ran.nextInt(9000);
    int num = temp + 1000;
    JTextField textName, textFName, textEmail, textAdd, textPin, textBranch, textState;
    JDateChooser dataChooser; 
    JRadioButton g1,g2;
    JRadioButton m1,m2,m3;
    String first = String.valueOf(num);

    // JDateChooser dataChooser;
    signup(){
        super("Application Form: ");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form no. " + num);
        label1.setBounds(160,20,600,40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(160, 70, 600, 40);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Raleway", Font.BOLD, 25));
        add(label2);

        JLabel label3 = new JLabel("Personal Details:");
        label3.setBounds(160, 120, 600, 40);
        label3.setFont(new Font("Raleway", Font.BOLD, 25));
        label3.setForeground(Color.WHITE);
        add(label3);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        name.setBounds(100,170, 200,30);
        add(name);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 170, 400, 30);
        add(textName);

        JLabel fName = new JLabel("Father's Name: ");
        fName.setBounds(100,220,200,30);
        fName.setForeground(Color.WHITE);
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fName);

        textFName = new JTextField();
        textFName.setBounds(300, 220,400,30);
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textFName);

        JLabel DOB = new JLabel("Data of Birth: ");
        DOB.setBounds(100,270,200,30);
        DOB.setForeground(Color.WHITE);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        // JTextField textDOB = new JTextField();
        // textDOB.setBounds(300,290,400,40);
        // textDOB.setForeground(Color.WHITE);
        // textDOB.setFont(new Font("Raleway", Font.BOLD, 14));
        // add(textDOB);
        dataChooser = new JDateChooser();
        dataChooser.setForeground(Color.WHITE);
        dataChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dataChooser.setBounds(300, 270,400, 30);
        add(dataChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(100, 320, 200, 30);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);

        g1 = new JRadioButton("Male");
        g1.setBounds(300,320,200,30);
        g1.setForeground(Color.WHITE);
        g1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(g1);

        g2 = new JRadioButton("Female");
        g2.setBounds(500, 320, 200, 30 );
        g2.setForeground(Color.WHITE);
        g2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(g2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(g1);
        buttonGroup.add(g2);

        JLabel email = new JLabel("Email: ");
        email.setForeground(Color.WHITE);
        email.setBounds(100, 370, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);

        textEmail= new JTextField();
        textEmail.setBounds(300, 370, 400, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        JLabel marriage = new JLabel("Marrital Status: ");
        marriage.setForeground(Color.WHITE);
        marriage.setBounds(100, 420, 200, 30);
        marriage.setFont(new Font("Raleway", Font.BOLD, 20));
        add(marriage);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 420, 133, 30);
        m1.setForeground(Color.WHITE);
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(433, 420, 133, 30);
        m2.setForeground(Color.WHITE);
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(566, 420, 134,30);
        m3.setForeground(Color.WHITE);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);

        JLabel add = new JLabel("Address: ");
        add.setBounds(100, 470, 200, 30);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        add(add);

        textAdd = new JTextField();
        textAdd.setBounds(300, 470, 400, 30);
        textAdd.setFont( new Font("Raleway", Font.BOLD, 14));
        add(textAdd);

        JLabel pin = new JLabel("Pin Code: ");
        pin.setBounds(100, 520, 200, 30);
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setForeground(Color.WHITE);
        add(pin);

        textPin = new JTextField();
        textPin.setBounds(300, 520, 400, 30);
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPin);

        JLabel branch = new JLabel("Branch: ");
        branch.setBounds(100, 570, 200, 30);
        branch.setForeground(Color.WHITE );
        branch.setFont(new Font("Raleway", Font.BOLD, 20));
        add(branch);

        textBranch = new JTextField();
        textBranch.setBounds(300, 570, 400, 30);
        textBranch.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textBranch);

        JLabel state = new JLabel("State: ");
        state.setBounds(100, 620, 200, 30);
        state.setForeground(Color.WHITE);
        state.setFont (new Font("Raleway",Font.BOLD, 20));
        add(state);

        textState = new JTextField();
        textState.setBounds(300, 620, 400, 30);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textState);

        JButton next = new JButton("Next");
        next.setFont (new Font("Raleway", Font.BOLD, 14));
        next.setBounds(700,675, 100, 50 );
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setOpaque(true);
        next.setBorderPainted(false);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(100 ));
        setLayout(null);
        setSize(850,800);
        setLocation(350, 40);
        setVisible(true);



    };

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = String.valueOf(num);
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dataChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(g1.isSelected()){
            gender = "Male";
        }else if(g2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else if(m2.isSelected()){
            marital = "Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }
        String address = textAdd.getText();
        String pincode = textPin.getText();
        String branch = textBranch.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                con c1 = new con();
                String q = "Insert into signup value('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+pincode+"', '"+branch+"',  '"+state+"' )";
                c1.statement.executeUpdate(q);
                new signup2(first);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new signup();
    }
}
