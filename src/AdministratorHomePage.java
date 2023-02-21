import java.awt.Color;
import java.awt.Container;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("A.2.a")
public class AdministratorHomePage extends JFrame implements ActionListener {
    private JButton b1, b2, b3, b4, b5, back;
    private JLabel label;

    public AdministratorHomePage() {
        Container con = getContentPane();
        con.setLayout(new GridLayout(4, 2));
        Font f = new Font("Curlz MT", Font.BOLD, 14);
        Font f1 = new Font("Times New Roman", Font.BOLD, 14);
        label = new JLabel("ADMINISTRATOR HOME PAGE");
        label.setFont(f);
        label.setForeground(Color.BLACK);
        con.add(label);
        con.add(new JLabel(" "));

        b1 = new JButton("CUSTOMER DETAILS");
        b1.setFont(f1);
        b2 = new JButton("BUS DETAILS");
        b2.setFont(f1);
        b3 = new JButton("ADD NEW BUS");
        b3.setFont(f1);
        b4 = new JButton("REMOVE BUS");
        b4.setFont(f1);
        b5 = new JButton("CONFIRM AND PRINT TICKET");
        b5.setFont(f1);
        back = new JButton("SIGN OUT");
        back.setFont(f1);
        con.add(b1);
        con.add(b2);
        con.add(b3);
        con.add(b4);
        con.add(b5);
        con.add(back);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerDetailsDatabase();

            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BusDetailsDatabase();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddNewBus();
                setVisible(false);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RemoveBus();
                setVisible(false);
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ConfirmSeat();
                setVisible(false);
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainLogin();
                setVisible(false);

            }
        });

        setSize(575, 270);
        setLocation(400, 200);
        setResizable(false);
        setTitle(" ADMINISTRATOR HOME PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String args[]) {
        new AdministratorHomePage();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {


    }


}
