package IndividualProject;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        TicketArrayList ticketList = new TicketArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n================ MENU ================");
            System.out.println("1 - Add Standard ticket / VIP ticket");
            System.out.println("2 - Update ticket by ID");
            System.out.println("3 - Delete ticket by ID");
            System.out.println("4 - Find ticket by ID");
            System.out.println("5 - Display all tickets");
            System.out.println("6 - Count tickets by type");
            System.out.println("0 - Exit");
            System.out.println("======================================");
            System.out.print("Choose an option: ");

            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Enter (1 - Add Standard Ticket / 2 - Add VIP Ticket): ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    if (choice == 1) {
                        StandardTicket st = new StandardTicket();
                        st.addTicketInfo();
                        ticketList.addTicketInfo(st);
                    } else if (choice == 2) {
                        VIPTicket vt = new VIPTicket();
                        vt.addTicketInfo();
                        ticketList.addTicketInfo(vt);
                    } else {
                        System.out.println("Invalid ticket type choice!");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    String idUp = sc.nextLine().trim();
                    ticketList.updateTicketInfo(idUp);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    String idDel = sc.nextLine().trim();
                    ticketList.deleteTicketById(idDel);
                    break;

                case 4:
                    System.out.print("Enter ID to find: ");
                    String idFind = sc.nextLine().trim();
                    ticketList.findTicketById(idFind);
                    break;

                case 5:
                    System.out.println("\n--- ALL TICKETS ---");
                    ticketList.displayAll();
                    break;

                case 6:
                    System.out.println("\n--- TICKET COUNT BY TYPE ---");
                    ticketList.countTicketByType();
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select between 0 and 6.");
            }
        }
    }
}
