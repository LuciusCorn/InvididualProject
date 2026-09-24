package IndividualProject;

import java.util.ArrayList;

public class TicketArrayList {

    private final ArrayList<Ticket> ticketArrayList = new ArrayList<>();

    public void addTicketInfo(Ticket ticket) {
        ticketArrayList.add(ticket);
        System.out.println("Added successfully!");
    }

    public void updateTicketInfo(String id) {
        for (Ticket ticket : ticketArrayList) {
            if (ticket.getId().equalsIgnoreCase(id)) {
                ticket.updateTicketInfo();
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Not found id!");
    }

    public void deleteTicketById(String id) {
        boolean removed = ticketArrayList.removeIf(ticket -> ticket.getId().equalsIgnoreCase(id));
        if (removed) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Not found id!");
        }
    }

    public void findTicketById(String id) {
        for (Ticket ticket : ticketArrayList) {
            if (ticket.getId().equalsIgnoreCase(id)) {
                ticket.displayInfo();
                return;
            }
        }
        System.out.println("Not found id!");
    }

    public void displayAll() {
        if (ticketArrayList.isEmpty()) {
            System.out.println("No tickets available.");
            return;
        }
        for (Ticket ticket : ticketArrayList) {
            ticket.displayInfo();
        }
    }

    public void countTicketByType() {
        int countStandardTicket = 0;
        int countVIPTicket = 0;
        for (Ticket ticket : ticketArrayList) {
            if (ticket instanceof StandardTicket) {
                countStandardTicket++;
            } else if (ticket instanceof VIPTicket) {
                countVIPTicket++;
            }
        }
        System.out.println("Number of Standard tickets: " + countStandardTicket);
        System.out.println("Number of VIP tickets: " + countVIPTicket);
    }
}
