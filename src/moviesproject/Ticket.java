package moviesproject;

import java.io.*;

public class Ticket
{
//    private String username;

    private static int ticketnum=0;
    private int price;
    private String tickettype;
    private int seatnum;
    private String timeticket;
    private String blockticket;


    public Ticket (String type, int seatnumber, String block, String time)
    {
//        username = name;
        seatnum = seatnumber; //Setting tickets seat number
        tickettype = type; //Setting ticket type
        blockticket = block; //Setting block
        timeticket = time; //Setting time
        ticketnum = readTicketNumberFromFile();
        ticketnum++; // Increment the ticket number for the new ticket
        saveTicketNumberToFile(ticketnum); // Save the updated ticket number to the file
        if ("Left Block".equals(blockticket))
        {

            if ("Adult".equals(type))
            {
                price = 5000; //Setting adult price
            }
            if ("OAP".equals(type))
            {
                price = 3000; //Setting OAP price
            }
            if ("Child".equals(type))
            {
                price = 2000;  //Setting child price
            }
        }

        if ("Middle Block".equals(blockticket))
        {

            if ("Adult".equals(type))
            {
                price = 10000; //Setting adult price
            }
            if ("OAP".equals(type))
            {
                price = 4000; //Setting OAP price
            }
            if ("Child".equals(type))
            {
                price = 3000;  //Setting child price
            }
        }

        if ("Right Block".equals(blockticket))
        {

            if ("Adult".equals(type))
            {
                price = 5000; //Setting adult price
            }
            if ("OAP".equals(type))
            {
                price = 3000; //Setting OAP price
            }
            if ("Child".equals(type))
            {
                price = 2000;  //Setting child price
            }
        }
    }
private static int readTicketNumberFromFile() {
        try {
            int savedTicketNumber;
            try (BufferedReader reader = new BufferedReader(new FileReader("ticketnum.txt"))) {
                savedTicketNumber = Integer.parseInt(reader.readLine());
            }
            return savedTicketNumber;
        } catch (IOException e) {
            // If the file doesn't exist or there's an error reading it, return 0
            return 0;
        }
    }
  private static void saveTicketNumberToFile(int ticketNumber) {
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("ticketnum.txt"))) {
                writer.write(String.valueOf(ticketNumber));
            }
        } catch (IOException e) {
        }
    }
    public int getSeatPrice()
    {
        return price;
    }
    public String getTime()
    {
        return timeticket;
    }
    public String getBlock()
    {
        return blockticket;
    }
    public String getType()
    {
        return tickettype;
    }
    public int getSeatNum()
    {
        return seatnum;
    }
    public static int getTicketnum() {
        return ticketnum;
    }
}
