import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import Get.TicketDetails;

public class CustomerCancelTicket extends JFrame implements ActionListener {
    JLabel l1;
    JButton yes, no, back;
    String cname, cadd, cnum;

    public CustomerCancelTicket(String name, String add, String num) {
        cname = name;
        cadd = add;
        cnum = num;
        Container con = getContentPane();
        setLayout(new FlowLayout());
        l1 = new JLabel("Want to cancel ticket ");
        con.add(l1);
        con.add(new JButton("YES"));
        yes.addActionListener(this);
        no = new JButton("NO");
        con.add(no);
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customer();
                setVisible(false);
            }
        });
        back = new JButton("BACK");
        con.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerHomepage(cname, cadd, cnum);
                setVisible(false);
            }
        });
        setTitle("CANCEL TICKET");
        setSize(300, 130);
        setLocation(500, 230);
        setResizable(false);
        setVisible(true);
    }

     public static void main(String[] args) {
        new CustomerCancelTicket("kk", "rrr", "888yy");
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        java.util.List<TicketDetails> ticList = new ArrayList<TicketDetails>();
        try {

            Object obj;
            FileInputStream fis = new FileInputStream("TicketDetails.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            java.util.List<TicketDetails> ticList1 = new ArrayList<TicketDetails>();
            while ((obj = ois.readObject()) != null) {
                ticList1 = (List<TicketDetails>) obj;
                for (TicketDetails tic : ticList1) {
                    if (tic.getTicketNumber().equalsIgnoreCase(tnum)) {
                        JOptionPane.showMessageDialog(this,  tic.getName()+ " your ticket no is "+ tic.getTicketNumber() +
                                "\nSuccessfully removed.");

                    } else
                        ticList.add(tic);
                }
            }
            ois.close();
            fis.close();
        } catch (EOFException e1) {

        } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }


        try {
            FileOutputStream fos = new FileOutputStream("TicketDetails.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ticList);
            oos.close();
            fos.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}