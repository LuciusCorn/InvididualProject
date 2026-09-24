package IndividualProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Ticket implements ITicket {

    private String id;
    private String movieName;
    private Date showTime;
    private String seatNumber;
    private double price;
    private boolean isSold;

    protected static final Scanner sc = new Scanner(System.in);
    protected static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Ticket() {
    }

    public Ticket(String id, String movieName, Date showTime, String seatNumber, double price, boolean isSold) {
        this.id = id;
        this.movieName = movieName;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isSold = isSold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }

    @Override
    public void addTicketInfo() {
        System.out.print("Enter id: ");
        setId(sc.nextLine());
        System.out.print("Enter movie name: ");
        setMovieName(sc.nextLine());
        while (true) {
            System.out.print("Enter show time (dd/MM/yyyy HH:mm): ");
            String timeString = sc.nextLine();
            try {
                setShowTime(sdf.parse(timeString));
                break;
            } catch (ParseException ex) {
                System.out.println("Invalid date format! Please try again.");
            }
        }
        System.out.print("Enter seat number: ");
        setSeatNumber(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter price: ");
                setPrice(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter a valid price.");
            }
        }
        while (true) {
            try {
                System.out.print("Enter is sold (true/false): ");
                setSold(Boolean.parseBoolean(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("Please enter true or false.");
            }
        }
    }

    @Override
    public void updateTicketInfo() {
        System.out.print("Update movie name: ");
        setMovieName(sc.nextLine());
        while (true) {
            System.out.print("Update show time (dd/MM/yyyy HH:mm): ");
            String timeString = sc.nextLine();
            try {
                setShowTime(sdf.parse(timeString));
                break;
            } catch (ParseException ex) {
                System.out.println("Invalid date format! Please try again.");
            }
        }
        System.out.print("Update seat number: ");
        setSeatNumber(sc.nextLine());

        while (true) {
            try {
                System.out.print("Update price: ");
                setPrice(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price! Please try again.");
            }
        }
        System.out.print("Update is sold (true/false): ");
        setSold(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Movie name: " + getMovieName());
        System.out.println("Show time: " + (getShowTime() != null ? sdf.format(getShowTime()) : "N/A"));
        System.out.println("Seat number: " + getSeatNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Is sold: " + isSold());
    }
}
