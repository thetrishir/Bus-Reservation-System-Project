import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Customer extends JFrame implements ActionListener {

    private JButton button1, button2, button3, button4;
    JLabel label;

    public Customer() {
        Container con = getContentPane();
        con.setLayout(new GridLayout(5, 2));
        Font f = new Font("ARIAL", Font.BOLD, 15);
        label = new JLabel(" WELCOME CUSTOMER ");
        label.setFont(f);
        label.setForeground(Color.BLACK);
        button1 = new JButton("Login");
        button2 = new JButton("Register");
        button3 = new JButton("Back");
        button4 = new JButton("Exit");
        con.add(label);
        con.add(new JLabel(""));
        con.add(new JLabel("Register, if you have no account"));
        con.add(new JLabel(""));
        con.add(button1);
        con.add(button2);
        con.add(button3);
        con.add(button4);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerLogin();
                setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerRegister();
                setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainLogin();
                setVisible(false);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        setSize(380, 260);
        setLocation(400, 200);
        setResizable(false);
        setTitle("CUSTOMER SIGN-IN HOME PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Customer();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
