package moviesproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Deletion extends JFrame {

    public Deletion() {
        setTitle("Ticket Deletion");
        setSize(300, 100);
        setResizable(false);
        setBounds(450, 50, 300, 100);
        JTextField ticketIDField = new JTextField(3);
        ticketIDField.setHorizontalAlignment(JTextField.CENTER);

        JButton actionButton = new JButton("Delete Ticket");
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ticketID = ticketIDField.getText();
                boolean ticketFound = false; // Flag to track if the ticket is found
                try {
                    File inputFile = new File("tickets.txt");
                    File tempFile = new File("tempfile.txt");

                    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                        String currentLine;
                        boolean deleteTicket = false; // New variable to control ticket deletion

                        while ((currentLine = reader.readLine()) != null) {
                            if (currentLine.contains("Ticket ID: " + ticketID)) {
                                deleteTicket = true;
                                ticketFound = true; // Set the flag to true if the ticket is found
                                continue; // Skip writing this line
                            }
                            if (deleteTicket && currentLine.contains("____________________________________________________________________________________")) {
                                deleteTicket = false;
                                continue; // Skip writing this line
                            }
                            if (!deleteTicket) {
                                writer.write(currentLine + System.getProperty("line.separator"));
                            }
                        }
                    }
                    // Delete the original file
                    if (!inputFile.delete()) {
                        return;
                    }
                    // Rename the temp file to the original file
                    if (!tempFile.renameTo(inputFile)) {
                        return;
                    }
                    if (ticketFound) {
                        JOptionPane.showMessageDialog(null, "Ticket deletion successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No such ticket found", "Ticket Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }
                    SwingUtilities.getWindowAncestor((Component) e.getSource()).dispose();

                } catch (IOException ex) {
                    // Print the exception for debugging
                    
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(ticketIDField);
        panel.add(actionButton);

        add(panel, BorderLayout.CENTER);
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Deletion().setVisible(true);
            }
        });
    }
}
