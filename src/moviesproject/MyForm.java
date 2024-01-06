
package moviesproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MyForm extends JFrame implements ActionListener  {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField temail;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JLabel res;
	private JTextArea resadd;

	private final String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private final String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private final String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019","2020","2021","2022","2023","2024" };
        public MyForm()
	{
                 // Check if registration_info.txt is not empty
    File file = new File("registration_info.txt");
    if (file.exists() && file.length() > 0) {
        JOptionPane.showMessageDialog(null, "You Are Logged in");
        return;
    }

		setTitle("Registration Form");
		setBounds(300, 90, 500, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
                setBackground(Color.blue);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(100, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 25);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Email");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		temail = new JTextField();
		temail.setFont(new Font("Arial", Font.PLAIN, 15));
		temail.setSize(150, 25);
		temail.setLocation(200, 150);
		c.add(temail);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("BirthDate");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(60, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(260, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(80, 20);
		year.setLocation(320, 250);
		c.add(year);

		

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);
 
		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);
		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
        @Override
        @SuppressWarnings("ResultOfObjectAllocationIgnored")
	public void actionPerformed(ActionEvent e)
	{
            if (e.getSource() == sub) {
               if (term.isSelected()) {
                   String fileName = "registration_info.txt";
                   try (FileWriter writer = new FileWriter(fileName)) {
                       String name = tname.getText();
                       String email = temail.getText();
                       String gender = male.isSelected() ? "Male" : "Female";
                       String dob = date.getSelectedItem() + " " + month.getSelectedItem() + " " + year.getSelectedItem();

                       String data = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender + "\nDate of Birth: " + dob;
                       writer.write(data);
                       res.setText("Registration Successfully. Data saved to " + fileName);
                   } catch (IOException ex) {
                       res.setText("Error occurred while saving data.");
                   }
               } else {
                   res.setText("Please accept the terms & conditions.");
    }
}

		else if (e.getSource() == reset) {
			String def = " ";
			tname.setText(def);
			tadd.setText(def);
			temail.setText(def);
			res.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
        }
    }

