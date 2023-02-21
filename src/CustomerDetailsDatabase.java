import java.awt.*;
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

import gui.CustomerDetails;

public class CustomerDetailsDatabase extends JFrame {
    JTable cusTable;
    String[] cols = {"Name", "Add", "Phone", "Email", "User Name", "Pass"};
    String[][] rows;

    public CustomerDetailsDatabase() {
        File f = new File("CustomerDetails.dat");
        Container con = getContentPane();
        setLayout(new BorderLayout());
        int r = 0;
        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream("CustomerDetails.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object obj;
                List<CustomerDetails> clist = new ArrayList<CustomerDetails>();
                while ((obj = ois.readObject()) != null) {
                    clist = (List<CustomerDetails>) obj;
                    rows = new String[clist.size()][cols.length];
                    for (CustomerDetails b : clist) {
                        rows[r][0] = b.getName();
                        rows[r][1] = b.getAdd();
                        rows[r][2] = b.getPhone();
                        rows[r][3] = b.getEmail();
                        rows[r][4] = b.getUsername();
                        rows[r][5] = String.valueOf(b.getPass());
                        r++;
                    }
                }

                ois.close();
                fis.close();
            } catch (EOFException e) {

            } catch (FileNotFoundException e) {
                JOptionPane.showConfirmDialog(this, "There is no Customer registered");

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (r != 0) {
            cusTable = new JTable(rows, cols);
            JScrollPane pane = new JScrollPane(cusTable);
            con.add(pane, "Center");
            setVisible(true);
            setSize(800, 200);
            setLocation(250, 200);
            setTitle("CUSTOMER DETAILS DATABASE");
            setResizable(false);
        }
    }

    public static void main(String[] args) {
        new CustomerDetailsDatabase();
    }
}
