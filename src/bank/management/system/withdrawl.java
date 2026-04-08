package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton withdraw, next;

    withdrawl(String pin) {
        this.pin = pin;
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image I2 = I1.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(440, 180, 400, 35);
        label1.setForeground(Color.WHITE);
        image.add(label1);

        JLabel label2 = new JLabel("(Maximum withdral is 10000)");
        label2.setBounds(540, 205, 400, 25);
        label2.setFont(new Font("Raleway", Font.BOLD, 12));
        label2.setForeground(new Color(184, 180, 169));
        image.add(label2);

        textField = new JTextField();
        textField.setBounds(460, 250, 320, 25);
        textField.setBackground(new Color(65, 125, 125));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        withdraw = new JButton("Withdraw");
        withdraw.setBackground(new Color(65, 125, 125));
        withdraw.setBorderPainted(false);
        withdraw.setOpaque(true);
        withdraw.setForeground(Color.WHITE);
        withdraw.setBounds(700, 365, 150, 30);
        withdraw.setFont(new Font("Raleway", Font.BOLD, 20));
        withdraw.addActionListener(this);
        image.add(withdraw);

        next = new JButton("Cancel");
        next.setForeground(Color.WHITE);
        next.setBackground(new Color(65, 125, 125));
        next.setOpaque(true);
        next.setBorderPainted(false);
        next.setBounds(700, 410, 150, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.addActionListener(this);
        image.add(next);

        // cancel.setBounds();

        setLayout(null);
        setLocation(0, 0);
        setSize(1550, 1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == withdraw) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amout you want to withdraw");
                } else {
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposite")) {
                            balance += Integer.parseInt(resultSet.getString(amount));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString(amount));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate(
                            "insert into bank values('" + pin + "', '" + date + "', 'withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + "Debited Successfully");
                    setVisible(false);
                    new mainClass(pin);
                }
            } catch (Exception E) {

            }
        }else if(e.getSource()==next){
            setVisible(false);
            new mainClass(pin);
        }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
