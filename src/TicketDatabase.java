import java.awt.BorderLayout;
import java.awt.Container;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gui.TicketDetails;


public class TicketDatabase extends JFrame {
    JTable ticketTable;
    String[] cols = {"Ticket Number", "Passenger Name","Mobile No","Route","Departure Time","Date"};
    String[][] rows;

    public TicketDatabase() {
        File f = new File("TicketDetails.dat");
        Container con = getContentPane();
        setLayout(new BorderLayout());
        int r = 0;
        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream("TicketDetails.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object obj;
                List<TicketDetails> tlist = new ArrayList<TicketDetails>();
                while ((obj = ois.readObject()) != null) {
                    tlist = (List<TicketDetails>) obj;
                    rows = new String[tlist.size()][cols.length];
                    for (TicketDetails t : tlist) {
                        rows[r][0] = String.valueOf(t.getTicketNumber());
                        rows[r][1] = t.getName();
                        rows[r][2] = t.getMobileNo();
                        rows[r][3]= t.getRoute();
                        rows[r][4] = t.getDepartureTime();
                        rows[r][5] = t.getDate();
                        r++;
                    }
                }

                ois.close();
                fis.close();
            } catch (EOFException e) {

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No database is created");

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (r != 0) {
            ticketTable = new JTable(rows, cols);
            JScrollPane pane = new JScrollPane(ticketTable);
            con.add(pane, "Center");
            setVisible(true);
            setSize(600, 200);
            setLocation(500, 200);
            setTitle("TICKET BOOK DATABASE");
            setResizable(false);
        } else
            JOptionPane.showMessageDialog(this, "There is no ticket booked");
    }

    public static void main(String[] args) {
        new TicketDatabase();
    }
}
