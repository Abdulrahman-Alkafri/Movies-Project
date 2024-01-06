package moviesproject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Ticketing extends JFrame implements ActionListener{
       

    private static final long serialVersionUID = 1L;
    private Choice movies;
    JTextField seat, totalcost,usernamefld;
    Choice type, block, time;// Choices for the GUI
    JLabel typelbl, blocklbl, timelbl, inputseatlbl, totallbl, title,username,movieselection;
    JButton submitbut, showbut, paybut;
    String selectedtime, total, selectedseat, selectedblock, tickettype;
    int timechoice, convertedseat1, convertedseat2, totalprice;
    int totaltickets = 0, currenti;
    Seat leftside1[][] = new Seat [4] [4];
    Seat midside1[][] = new Seat [4] [4];
    Seat rightside1[][] = new Seat [4] [4]; // Each one of these creates an array for each block

    Seat leftside3[][] = new Seat [4] [4];
    Seat midside3[][] = new Seat [4] [4];
    Seat rightside3[][] = new Seat [4] [4];

    Seat leftside5[][] = new Seat [4] [4];
    Seat midside5[][] = new Seat [4] [4];
    Seat rightside5[][] = new Seat [4] [4];

    Seat leftside7[][] = new Seat [4] [4];
    Seat midside7[][] = new Seat [4] [4];
    Seat rightside7[][] = new Seat [4] [4];

    Seat leftside9[][] = new Seat [4] [4];
    Seat midside9[][] = new Seat [4] [4];
    Seat rightside9[][] = new Seat [4] [4];

    Ticket tickets[] = new Ticket[30]; //Array for storing the tickets booked
    public Ticketing()
    {
        movies = new Choice();
        // Add movies from file to choice
        addMoviesFromFileToChoice("movie_names.txt");
        setSize(800,500);
        setLocation(200,200);
        setResizable(false);
        setLayout(new FlowLayout());
        ImageIcon imgtitle = new ImageIcon("title.gif");
        title = new JLabel(imgtitle);
        typelbl = new JLabel("Ticket Type: ");
        typelbl.setFont(new Font("Verdana", Font.BOLD, 22));
        type = new Choice();
        type.add("Adult");
        type.add("Child");
        type.add("OAP");
        blocklbl = new JLabel("Block:");
        blocklbl.setFont(new Font("Verdana", Font.BOLD, 22));
        block = new Choice();
        block.add("Left Block");
        block.add("Middle Block");
        block.add("Right Block");
        timelbl = new JLabel("Time: ");
        timelbl.setFont(new Font("Verdana", Font.BOLD, 22));
        time = new Choice();
        time.add("13:00");
        time.add("15:00");
        time.add("17:00");
        time.add("19:00");
        time.add("21:00");
        paybut = new JButton("Pay");
        paybut.setBackground(Color.white);
        inputseatlbl = new JLabel ("Enter Seat Num: ");
        inputseatlbl.setFont(new Font("Verdana", Font.BOLD, 22));
        seat = new JTextField(2);
        seat.setFont(new Font("Verdana", Font.BOLD, 20));
        seat.setHorizontalAlignment(SwingConstants.CENTER);
        totallbl = new JLabel ("Total Price: ");
        totallbl.setFont(new Font("Verdana", Font.BOLD, 22));
        totalcost = new JTextField(7);
        totalcost.setFont(new Font("Verdana", Font.BOLD, 22));
        totalcost.setHorizontalAlignment(SwingConstants.CENTER);
        totalcost.setEditable(false);
        submitbut = new JButton("Submit");
        submitbut.setBackground(Color.white);
        showbut = new JButton("Show");
        showbut.setBackground(Color.white);
        username = new JLabel("Enter Your Name : ");
        username.setFont(new Font("Verdana",Font.BOLD,22));
        usernamefld = new JTextField(15);
        usernamefld.setFont(new Font("Verdana", Font.BOLD, 20));
        usernamefld.setHorizontalAlignment(SwingConstants.CENTER);
         movieselection = new JLabel("Select A Movie : ");
        movieselection.setFont(new Font("Verdana",Font.BOLD,22));
        movieselection.setLocation(400, 300);   
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
		/* The following delcarations
		initialise the variables for
		the positions of the blocks */

        int xleft = 0;
        int yleft = 0;
        int xmid = 0;
        int ymid = 0;
        int xright = 0;
        int yright = 0;


        xleft = 50;
        yleft = 310; //Initial positions
        int totalleftside1 = 0; //'Total' is the total and is used to label the seats

        for (int i = 0; i < leftside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside1[i][j]=new Seat(totalleftside1, 0, xleft, yleft);
                xleft += 50; //Moving the next seat along the x position by 50
                totalleftside1 ++; //Adding one to the total for the next seat
            }
            xleft = 50; //Moving back to the left for the next row
            yleft += 30; //Moving down for the next row
        }

        xmid = 300;
        ymid = 310; //Initial positions
        int totalmidside1 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < midside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside1[i][j]=new Seat(totalmidside1, 0, xmid, ymid);
                xmid += 50; //Moving the next seat along the x position by 50
                totalmidside1 ++; //Adding one to the total for the next seat
            }
            xmid = 300; //Moving back to the left for the next row
            ymid += 30;  //Moving down for the next row
        }

        xright = 550;
        yright = 310; //Initial positions
        int totalrightside1 = 0; //'Total' is the total and is used to label the seats
        for (int i = 0; i < rightside1.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside1[i][j]=new Seat(totalrightside1, 0, xright, yright);
                xright += 50; //Moving the next seat along the x position by 50
                totalrightside1 ++; //Adding one to the total for the next seat
            }
            xright = 550; //Moving back to the left for the next row
            yright += 30; //Moving down for the next row
        }

        /* The next lines of code perform the same processes as the ones before such as positions for each block */

        xleft = 50;
        yleft = 310;
        int totalleftside3 = 0;

        for (int i = 0; i < leftside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside3[i][j]=new Seat(totalleftside3, 0, xleft, yleft);
                xleft += 50;
                totalleftside3 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside3 = 0;
        for (int i = 0; i < midside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside3[i][j]=new Seat(totalmidside3, 0, xmid, ymid);
                xmid += 50;
                totalmidside3 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside3 = 0;
        for (int i = 0; i < rightside3.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside3[i][j]=new Seat(totalrightside3, 0, xright, yright);
                xright += 50;
                totalrightside3 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside5 = 0;

        for (int i = 0; i < leftside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside5[i][j]=new Seat(totalleftside5, 0, xleft, yleft);
                xleft += 50;
                totalleftside5 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside5 = 0;
        for (int i = 0; i < midside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside5[i][j]=new Seat(totalmidside5, 0, xmid, ymid);
                xmid += 50;
                totalmidside5 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside5 = 0;
        for (int i = 0; i < rightside5.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside5[i][j]=new Seat(totalrightside5, 0, xright, yright);
                xright += 50;
                totalrightside5 ++;
            }
            xright = 550;
            yright += 30;
        }


        xleft = 50;
        yleft = 310;
        int totalleftside7 = 0;

        for (int i = 0; i < leftside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside7[i][j]=new Seat(totalleftside7, 0, xleft, yleft);
                xleft += 50;
                totalleftside7 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside7 = 0;
        for (int i = 0; i < midside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside7[i][j]=new Seat(totalmidside7, 0, xmid, ymid);
                xmid += 50;
                totalmidside7 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside7 = 0;
        for (int i = 0; i < rightside7.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside7[i][j]=new Seat(totalrightside7, 0, xright, yright);
                xright += 50;
                totalrightside7 ++;
            }
            xright = 550;
            yright += 30;
        }

        xleft = 50;
        yleft = 310;
        int totalleftside9 = 0;

        for (int i = 0; i < leftside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                leftside9[i][j]=new Seat(totalleftside9, 0, xleft, yleft);
                xleft += 50;
                totalleftside9 ++;
            }
            xleft = 50;
            yleft += 30;
        }

        xmid = 300;
        ymid = 310;
        int totalmidside9 = 0;
        for (int i = 0; i < midside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                midside9[i][j]=new Seat(totalmidside9, 0, xmid, ymid);
                xmid += 50;
                totalmidside9 ++;
            }
            xmid = 300;
            ymid += 30;
        }

        xright = 550;
        yright = 310;
        int totalrightside9 = 0;
        for (int i = 0; i < rightside9.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rightside9[i][j]=new Seat(totalrightside9, 0, xright, yright);
                xright += 50;
                totalrightside9 ++;
            }
            xright = 550;
            yright += 30;
        }
        /* Adding the labels and text boxes to the screen */

        getContentPane().add(title);
        getContentPane().add(typelbl);
        getContentPane().add(type);
        getContentPane().add(blocklbl);
        getContentPane().add(block);
        getContentPane().add(timelbl);
        getContentPane().add(time);
        getContentPane().add(showbut);
        getContentPane().add(inputseatlbl);
        getContentPane().add(seat);
        getContentPane().add(submitbut);
        getContentPane().add(totallbl);
        getContentPane().add(totalcost);
        getContentPane().add(paybut);
        getContentPane().add(username);
        getContentPane().add(usernamefld);
        getContentPane().add(movieselection);
        getContentPane().add(movies);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Color mycolor = new Color(255,255,255);
        getContentPane().setBackground(mycolor);

        submitbut.addActionListener(this);
        showbut.addActionListener(this); //Action listener for each individual button
        paybut.addActionListener(this);
    }
        @Override
    public void paint(Graphics graf)
    {
        super.paint(graf);

        switch(timechoice)
        {
            case 1:
                for (int i = 0; i < leftside1.length; i++) //Looping throw the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside1[i][j].display(graf); //Displaying the left side @ 1
                        midside1[i][j].display(graf); //Displaying the mid side @ 1
                        rightside1[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
            case 3:
                for (int i = 0; i < leftside3.length; i++) //Looping through the leftside at 3 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside3[i][j].display(graf); //Displaying the left side @ 3
                        midside3[i][j].display(graf); //Displaying the mid side @ 3
                        rightside3[i][j].display(graf); //Displaying the right side @ 3
                    }
                }
                break;
            case 5:
                for (int i = 0; i < leftside5.length; i++) //Looping through the leftside at 5 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside5[i][j].display(graf); //Displaying the left side @ 5
                        midside5[i][j].display(graf); //Displaying the mid side @ 5
                        rightside5[i][j].display(graf); //Displaying the right side @ 5
                    }
                }
                break;
            case 7:
                for (int i = 0; i < leftside7.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside7[i][j].display(graf); //Displaying the left side @ 7
                        midside7[i][j].display(graf); //Displaying the mid side @ 7
                        rightside7[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
            case 9:
                for (int i = 0; i < leftside9.length; i++) //Looping through the leftside at 7 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside9[i][j].display(graf); //Displaying the left side @ 7
                        midside9[i][j].display(graf); //Displaying the mid side @ 7
                        rightside9[i][j].display(graf); //Displaying the right side @ 7
                    }
                }
                break;
            default:
                /* Used as what appears when the program starts */
                for (int i = 0; i < leftside1.length; i++) //Looping through the leftside at 1 block - gives initial size
                {
                    for (int j = 0; j < 4; j++) //Looping through each row fully
                    {
                        leftside1[i][j].display(graf); //Displaying the left side @ 1
                        midside1[i][j].display(graf); //Displaying the mid side @ 1
                        rightside1[i][j].display(graf); //Displaying the right side @ 1
                    }
                }
                break;
        }
    }
    @Override
    public void actionPerformed(ActionEvent ev)
    {
        selectedblock = block.getSelectedItem(); //The values neeeded to book seats and check for availability taken from text boxes
        selectedtime = time.getSelectedItem();
        tickettype = type.getSelectedItem();

        if (ev.getSource() == submitbut)
        {
            selectedseat = seat.getText();
            int selectseat =0;
            try{
                selectseat = Integer.parseInt(selectedseat);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"Invalid Seat Number!!\n Please Enter A Valid Number","Out Of Range",JOptionPane.ERROR_MESSAGE);
                seat.setText("");
                return;
            }

			/* The following set of if statements checks for seat number and converts it
			to an X, Y position which can be used for booking */
            if(selectseat<0||selectseat>15)
            {
                JOptionPane.showMessageDialog(this,"Invalid Seat Number!!\n Please Enter A Valid Number","Out Of Range",JOptionPane.ERROR_MESSAGE);
                seat.setText("");
                return;
            }
            if (selectseat == 0)
            {convertedseat1 = 0;
                convertedseat2 = 0;}
            if (selectseat == 1)
            {convertedseat1 = 0;
                convertedseat2 = 1;}
            if (selectseat == 2)
            {convertedseat1 = 0;
                convertedseat2 = 2;}
            if (selectseat == 3)
            {convertedseat1 = 0;
                convertedseat2 = 3;}
            if (selectseat == 4)
            {convertedseat1 = 1;
                convertedseat2 = 0;}
            if (selectseat == 5)
            {convertedseat1 = 1;
                convertedseat2 = 1;}
            if (selectseat == 6)
            {convertedseat1 = 1;
                convertedseat2 = 2;}
            if (selectseat == 7)
            {convertedseat1 = 1;
                convertedseat2 = 3;}
            if (selectseat == 8)
            {convertedseat1 = 2;
                convertedseat2 = 0;}
            if (selectseat == 9)
            {convertedseat1 =2;
                convertedseat2 = 1;}
            if (selectseat == 10)
            {convertedseat1 = 2;
                convertedseat2 = 2;}
            if (selectseat == 11)
            {convertedseat1 = 2;
                convertedseat2 = 3;}
            if (selectseat == 12)
            {convertedseat1 = 3;
                convertedseat2 = 0;}
            if (selectseat == 13)
            {convertedseat1 = 3;
                convertedseat2 = 1;}
            if (selectseat == 14)
            {convertedseat1 = 3;
                convertedseat2 = 2;}
            if (selectseat == 15)
            {convertedseat1 = 3;
                convertedseat2 = 3;}

            if (selectedtime.equals("13:00")) //If they are trying to book a ticket a 1 o'clock
            {
                timechoice = 1;
                repaint();
                if (selectedblock.equals("Left Block")) // If they are trying to book a seat in the left block
                {
                    int iftaken = leftside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        leftside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint(); //Re-displays it
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock.equals("Middle Block"))  // If they are trying to book a seat in the middle block
                {
                    int iftaken = midside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked"); //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        midside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime); //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice();  //Gets the seat price using the getSeatPrice() method
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
                if (selectedblock.equals("Right Block"))  // If they are trying to book a seat in the right block
                {
                    int iftaken = rightside1[convertedseat1][convertedseat2].isTaken(); //Uses the istaken() method to see if it is taken
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");  //Seat is taken and outputs an error message
                    }
                    else if (iftaken == 0)
                    {
                        rightside1[convertedseat1][convertedseat2].setSeat(); //Sets the seat to booked
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);  //Creates a new ticket objects in the tickets array
                        int tempprice = tickets[totaltickets].getSeatPrice(); //Gets the seat price using the getSeatPrice() method
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice)); //Updates and adds to the text box
                        totaltickets += 1; //Updates the total amount of tickets booked
                        seat.setText("");
                    }
                }
            }

            /* Code is replicated for each of the times the user wants to book*/

            if (selectedtime.equals("15:00"))
            {
                timechoice = 3;
                repaint();

                if (selectedblock.equals("Left Block"))
                {
                    int iftaken = leftside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock.equals("Middle Block"))
                {
                    int iftaken = midside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if (selectedblock.equals("Right Block"))
                {
                    int iftaken = rightside3[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside3[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }

            }
            if ("17:00".equals(selectedtime))
            {
                timechoice = 5;
                repaint();

                if ("Left Block".equals(selectedblock))
                {
                    int iftaken = leftside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Middle Block".equals(selectedblock))
                {
                    int iftaken = midside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Right Block".equals(selectedblock))
                {
                    int iftaken = rightside5[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside5[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if ("19:00".equals(selectedtime))
            {
                timechoice = 7;
                repaint();

                if ("Left Block".equals(selectedblock))
                {
                    int iftaken = leftside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Middle Block".equals(selectedblock))
                {
                    int iftaken = midside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Right Block".equals(selectedblock))
                {
                    int iftaken = rightside7[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside7[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
            if ("21:00".equals(selectedtime))
            {
                timechoice = 9;
                repaint();

                if ("Left Block".equals(selectedblock))
                {
                    int iftaken = leftside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        leftside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Middle Block".equals(selectedblock))
                {
                    int iftaken = midside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        midside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
                if ("Right Block".equals(selectedblock))
                {
                    int iftaken = rightside9[convertedseat1][convertedseat2].isTaken();
                    if (iftaken == 1)
                    {
                        JOptionPane.showMessageDialog(null, "This seat is taken and cannot be booked");
                    }
                    else if (iftaken == 0)
                    {
                        rightside9[convertedseat1][convertedseat2].setSeat();
                        repaint();
                        tickets[totaltickets] = new Ticket(tickettype, selectseat, selectedblock, selectedtime);
                        int tempprice = tickets[totaltickets].getSeatPrice();
                        totalprice += tempprice;
                        totalcost.setText("SP"+ Integer.toString(totalprice));
                        totaltickets += 1;
                        seat.setText("");
                    }
                }
            }
        }
        if (ev.getSource() == showbut)
        {
            /* If the user has clicked the show button it sets a variable and then repaints the desired time */

            if ("13:00".equals(selectedtime))
            {
                timechoice = 1;
                repaint();
            }
            if ("15:00".equals(selectedtime))
            {
                timechoice = 3;
                repaint();
            }
            if ("17:00".equals(selectedtime))
            {
                timechoice = 5;
                repaint();
            }
            if ("19:00".equals(selectedtime))
            {
                timechoice = 7;
                repaint();
            }
            if("21:00".equals(selectedtime))
            {
                timechoice = 9;
                repaint();
            }

        }

       if (ev.getSource() == paybut) //Pay button to generate tickets
        {
           if((usernamefld.getText().equals(""))||(totalcost.getText().equals("")))
           {
               JOptionPane.showMessageDialog(null, "Please Complete All Fields","Fields Requires",JOptionPane.ERROR_MESSAGE);
               return;
           }
            try{
                FileWriter stream= new FileWriter("tickets.txt",true); //Opening the tickets.txt file
               try (BufferedWriter output = new BufferedWriter(stream)) {
                   for (int i = 0; i < totaltickets; i++) //Looping through the number of tickets booked
                   {
                       /* Getting the variables needed from methods related to the object */
                       int ticketid = Ticket.getTicketnum();
                       int seatnum = tickets[i].getSeatNum();
                       int ticketprice = tickets[i].getSeatPrice();
                       String ticketType = tickets[i].getType();
                       String tickettime = tickets[i].getTime();
                       String ticketblock = tickets[i].getBlock();
                       String newline = System.getProperty("line.separator");
                       output.write("Ticket ID: "+ticketid);
                       output.write(newline);
                       output.write("User Name : "+usernamefld.getText());
                       output.write(newline);
                       output.write(newline);
                       output.write("Ticket Details");
                       output.write(newline);
                       output.write(newline);
                       output.write("Movie Name: "+movies.getItem(movies.getSelectedIndex()));
                       output.write(newline); 
                       output.write("Seat Number: " + seatnum); //Writing ticketnum
                       output.write(newline);
                       output.write("Ticket Price: " + ticketprice);
                       output.write(newline);
                       output.write("Ticket Type: " + ticketType);
                       output.write(newline);
                       output.write("Ticket Time: " + tickettime);
                       output.write(newline);
                       output.write("Ticket Block: " + ticketblock);
                       output.write(newline);
                       output.write("____________________________________________________________________________________");
                       output.write(newline);
                   }
               }
            }catch (IOException e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());}
            JOptionPane.showMessageDialog(null, "These tickets have been printed out to the file 'tickets.txt'"); //Success message
            for(int i=0; i < tickets.length; i++)
            {
                tickets[i] = null; //Setting the tickets array values to null so new tickets can be booked
            }
            totaltickets = 0;
            totalprice = 0;
            totalcost.setText("");
            seat.setText(""); 
            usernamefld.setText("");
        }
    }
    public void addMovieToChoice(String movieName) {
        movies.add(movieName);
        saveMovieNameToFile(movieName);
    }
    private void saveMovieNameToFile(String movieName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("movie_names.txt", true))) {
            writer.write(movieName);
            writer.newLine();
        } catch (IOException e) {
        }
    }
     public void addMoviesFromFileToChoice(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                movies.add(line);
            }
        } catch (IOException e) {
        }
    }public Choice getMovieChoice() {
        return movies;
    }
     
}

