package IndividualProject;

import java.util.Date;

public class VIPTicket extends Ticket {

    private String serviceInclude;
    private String comboFood;
    private boolean priorityEntry;

    public VIPTicket() {
    }

    public VIPTicket(String serviceInclude, String comboFood, boolean priorityEntry, String id, String movieName, Date showTime, String seatNumber, double price, boolean isSold) {
        super(id, movieName, showTime, seatNumber, price, isSold);
        this.serviceInclude = serviceInclude;
        this.comboFood = comboFood;
        this.priorityEntry = priorityEntry;
    }

    public String getServiceInclude() {
        return serviceInclude;
    }

    public void setServiceInclude(String serviceInclude) {
        this.serviceInclude = serviceInclude;
    }

    public String getComboFood() {
        return comboFood;
    }

    public void setComboFood(String comboFood) {
        this.comboFood = comboFood;
    }

    public boolean isPriorityEntry() {
        return priorityEntry;
    }

    public void setPriorityEntry(boolean priorityEntry) {
        this.priorityEntry = priorityEntry;
    }

    @Override
    public void addTicketInfo() {
        System.out.println("-----------VIP ticket------------");
        super.addTicketInfo();
        System.out.print("Enter service include: ");
        setServiceInclude(sc.nextLine());
        System.out.print("Enter combo Food: ");
        setComboFood(sc.nextLine());
        System.out.print("Priority Entry (true/false): ");
        setPriorityEntry(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public void updateTicketInfo() {
        System.out.println("-----------VIP ticket------------");
        super.updateTicketInfo();
        System.out.print("Update service include: ");
        setServiceInclude(sc.nextLine());
        System.out.print("Update combo Food: ");
        setComboFood(sc.nextLine());
        System.out.print("Update Priority Entry (true/false): ");
        setPriorityEntry(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public void displayInfo() {
        System.out.println("-----------VIP ticket------------");
        super.displayInfo();
        System.out.println("Service include: " + getServiceInclude());
        System.out.println("Combo food: " + getComboFood());
        System.out.println("Priority entry: " + isPriorityEntry());
    }
}
