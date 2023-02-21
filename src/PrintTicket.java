import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrintTicket extends JFrame implements ActionListener {
    Container con;
    JLabel l1;
    JButton yes, no, back;

    public PrintTicket() {
        con = getContentPane();
        con.setLayout(new GridLayout(4,2));
        l1 = new JLabel("Want to print ticket ");
        con.add(l1);
        yes=new JButton("YES");
        con.add(yes);
        yes.addActionListener(this);
        no = new JButton("NO");
        con.add(no);
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ConfirmSeat();
                setVisible(false);
            }
        });
        back = new JButton("BACK");
        con.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdministratorHomePage();
                setVisible(false);
            }
        });
        setVisible(true);
        setTitle("PRINT TICKET");
        setSize(350, 180);
        setLocation(500, 230);
        setResizable(false);
    }
    public static void main(String[] args) {
        new PrintTicket();
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        new Print();
    }
}
