package moviesproject;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountInfoFrame extends JFrame {
    public AccountInfoFrame() {
        setTitle("Account Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(4, 1)); // Use GridLayout to display each piece of information on a separate line
        getContentPane().setBackground(new Color(0, 0, 102)); // Dark blue background color

        String fileName = "registration_info.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String name = reader.readLine().replace("Name: ", "");
            String email = reader.readLine().replace("Email: ", "");
            String gender = reader.readLine().replace("Gender: ", "");
            String dob = reader.readLine().replace("Date of Birth: ", "");

            JLabel nameLabel = new JLabel("Name: " + name);
            nameLabel.setForeground(Color.WHITE);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set a bigger font
            add(nameLabel);

            JLabel emailLabel = new JLabel("Email: " + email);
            emailLabel.setForeground(Color.WHITE);
            emailLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set a bigger font
            add(emailLabel);

            JLabel genderLabel = new JLabel("Gender: " + gender);
            genderLabel.setForeground(Color.WHITE);
            genderLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set a bigger font
            add(genderLabel);

            JLabel dobLabel = new JLabel("Date of Birth: " + dob);
            dobLabel.setForeground(Color.WHITE);
            dobLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set a bigger font
            add(dobLabel);
        } catch (IOException ex) {
            JLabel errorLabel = new JLabel("Error reading data from file.");
            errorLabel.setForeground(Color.RED);
            add(errorLabel);
        }

        setVisible(true);
    }
}
