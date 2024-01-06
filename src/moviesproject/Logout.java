/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesproject;
import java.io.File;
import javax.swing.JOptionPane;

public class Logout {
    public Logout() {
        String fileName = "registration_info.txt";
        File file = new File(fileName);
        
        if (file.exists()) {
            file.delete();
            JOptionPane.showMessageDialog(null, "All registration info deleted.");
        } else {
            JOptionPane.showMessageDialog(null, "No registration info found.");
        }
    }
}


