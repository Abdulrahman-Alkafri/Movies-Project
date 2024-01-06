package moviesproject;

import javax.swing.*;
import java.io.*;

public class Reservations extends JFrame {
    private JTextArea textarea;

    public Reservations() {
        setTitle("Reservations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 50, 700, 500);
        setResizable(false);
        textarea = new JTextArea();
        textarea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textarea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        BufferedReader bf = null;
        String newline = System.getProperty("line.separator");

        try {
            bf = new BufferedReader(new FileReader("tickets.txt"));
            String str;
            boolean isEmpty = true;

            while ((str = bf.readLine()) != null) {
                textarea.append(str);
                textarea.append(newline);
                isEmpty = false; // File is not empty
            }

            if (isEmpty) {
                JOptionPane.showMessageDialog(null, "The reservations file is empty");
                dispose(); // Close the frame
            }
        } catch (IOException e) {
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {  
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reservations().setVisible(true);
            }
        });
    }
}
