import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CustomerBookTicket extends JFrame implements ActionListener {
    JTextField source, destination, seats, date;
    JComboBox bustype;
    JLabel l1, l2, l3, l5, l6;
    JButton book, reset, back, exit;
    Container con;
    String[] type = {"AC", "Non-AC"};
    String cname, cadd, cnum;

    public CustomerBookTicket(String name, String add, String num) {
        cname = name;
        cadd = add;
        cnum = num;
        Container con = getContentPane();
        con.setLayout(new GridLayout(7, 2));
        Font f1 = new Font("Times New Roman", Font.BOLD, 15);
        setTitle("Customer Book Ticket");
        con.add(new JLabel("Book yourself a ticket: "));
        con.add(new JLabel(" "));
        l1 = new JLabel("                        ENTER SOURCE ");
        l1.setFont(f1);
        l1.setForeground(Color.BLACK);
        source = new JTextField(27);
        con.add(l1);
        con.add(source);
        l2 = new JLabel("                     ENTER DESTINATION ");
        l2.setFont(f1);
        l2.setForeground(Color.BLACK);
        destination = new JTextField(27);
        con.add(l2);
        con.add(destination);
        JPanel p1 = new JPanel();
        l3 = new JLabel("NUMBER OF SEATS ");
        l3.setFont(f1);
        l3.setForeground(Color.BLACK);
        seats = new JTextField(5);
        p1.add(l3);
        p1.add(seats);
        con.add(p1);
        JPanel p2 = new JPanel();
        l5 = new JLabel("BUS TYPE ");
        l5.setForeground(Color.BLACK);
        bustype = new JComboBox(type);
        p2.add(l5);
        p2.add(bustype);
        con.add(p2);
        l6 = new JLabel("                   ENTER DATE (DD/MM/YY) ");
        l6.setFont(f1);
        l6.setForeground(Color.BLACK);
        date = new JTextField(6);
        con.add(l6);
        con.add(date);
        reset = new JButton("RESET");
        con.add(reset);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                source.setText("");
                destination.setText("");
                seats.setText("");
                date.setText("");
            }
        });

        book = new JButton("BOOK");
        con.add(book);
        book.addActionListener(this);

        back = new JButton("BACK");
        con.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerHomepage(cname, cadd, cnum);
                setVisible(false);
            }
        });
        exit = new JButton("EXIT");
        con.add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        setSize(700, 450);
        setLocation(300, 150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   /* public static void main(String[] args) {
        new CustomerBookTicket("kk", "rrr", "888yy");
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        String so = source.getText();
        String des = destination.getText();
        String btype = (String) (bustype.getSelectedItem());
        String broute = so + "-" + des;
        int bseat = Integer.parseInt(seats.getText());
        String dat = date.getText();
        new BookTicket(cname, cadd, cnum, broute, btype, bseat, dat);
        setVisible(false);
    }
}