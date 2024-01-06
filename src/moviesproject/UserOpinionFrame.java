package moviesproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserOpinionFrame extends JFrame {
    private JTextField textField;
    private JRadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;
    private JTextArea textArea;
    private final Choice movies;

    public UserOpinionFrame() {
        setTitle("User Opinion Frame");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setBounds(500,300,1000,100);
        getContentPane().setBackground(new Color(240, 240, 240)); // Set background color
        // Radio buttons
        radioButton1 = new JRadioButton(" Perfect");
        radioButton2 = new JRadioButton("Good");
        radioButton3 = new JRadioButton("Fine");
        radioButton4 = new JRadioButton("Not Bad");
        radioButton5 = new JRadioButton("Bad");

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        radioButtonGroup.add(radioButton3);
        radioButtonGroup.add(radioButton4);
        radioButtonGroup.add(radioButton5);

        // Text area with placeholder
        textArea = new JTextArea("Write your opinion");
        textArea.setMargin(new Insets(5, 5, 5, 5)); // Set margin
        textArea.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textArea.getText().equals("Write your opinion")) {
                    textArea.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textArea.getText().isEmpty()) {
                    textArea.setText("Write your opinion");
                }
            }
        });

        // AWT Choice for movie selection
        movies = new Choice();
        movies.setFont(new Font("Verdana",Font.BOLD,12));
        movies.add("The Godfather");
        movies.add("Monster Inc");
        movies.add("Home Alone");
        movies.add("Inside Out");
        movies.add("Toy Story");
        movies.add("Up");
        movies.add("The Matrix");
        movies.add("Fight Club");
        movies.add("The Dark Knight");
        movies.add("Annabelle");
        movies.add("IT");
        movies.add("ORPHAN");
        movies.add("WONKA");
        movies.add("Family Plan");
        movies.add("Aquaman");
        movies.add("Intersteller");
        movies.add("Tenet");

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(Color.BLUE);  // Initial background color
        submitButton.setForeground(Color.WHITE); // Initial foreground color
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                submitButton.setBackground(Color.RED);  // Change background color to red on mouse enter
                submitButton.setForeground(Color.WHITE); // Change foreground color to white on mouse enter
            }

            @Override
            public void mouseExited(MouseEvent e) {
                submitButton.setBackground(Color.BLUE);  // Change background color back to initial color on mouse exit
                submitButton.setForeground(Color.WHITE); // Change foreground color back to initial color on mouse exit
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = "Text: " + textField.getText() + "\n";
                userInput += "Opinion: " + textArea.getText() + "\n";
                userInput += "Movie: " + movies.getSelectedItem() + "\n";
                userInput += "Rating: ";
                if (radioButton1.isSelected()) {
                    userInput += "Perfect";
                } else if (radioButton2.isSelected()) {
                    userInput += "Good";
                } else if (radioButton3.isSelected()) {
                    userInput += "Fine";
                } else if (radioButton4.isSelected()) {
                    userInput += "Not Bad";
                } else if (radioButton5.isSelected()) {
                    userInput += "Bad";
                }
                                try (PrintWriter writer = new PrintWriter(new FileWriter("userRating.txt", true))) {
                    writer.println(userInput);
                     writer.println("____________________________________________________________________________________");
                    JOptionPane.showMessageDialog(UserOpinionFrame.this, "Data has been send successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Close the frame
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(UserOpinionFrame.this, "Failed to send data", "Error", JOptionPane.ERROR_MESSAGE);
               }
                }
        });


        // Set layout using GridBagLayout for better control over component alignment and margins
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Set margins

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Enter your text:"), gbc);
        textField = new JTextField(20);
        gbc.gridy++;
        add(textField, gbc);

        gbc.gridy++;
        add(radioButton1, gbc);

        gbc.gridy++;
        add(radioButton2, gbc);

        gbc.gridy++;
        add(radioButton3, gbc);

        gbc.gridy++;
        add(radioButton4, gbc);

        gbc.gridy++;
        add(radioButton5, gbc);

        gbc.gridy++;
        add(new JLabel("Write your opinion:"), gbc);

        gbc.gridy++;
        add(textArea, gbc);

        gbc.gridy++;
        add(new JLabel("Best movie you loved:"), gbc);

        gbc.gridy++;
        add(movies, gbc);

        gbc.gridy++;
        add(submitButton, gbc);

        pack();
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
