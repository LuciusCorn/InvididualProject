package IndividualProject;

import java.util.Date;

public class StandardTicket extends Ticket {

    private String screenType;
    private String comboFood;

    public StandardTicket() {
    }

    public StandardTicket(String screenType, String comboFood, String id, String movieName, Date showTime, String seatNumber, double price, boolean isSold) {
        super(id, movieName, showTime, seatNumber, price, isSold);
        this.screenType = screenType;
        this.comboFood = comboFood;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getComboFood() {
        return comboFood;
    }

    public void setComboFood(String comboFood) {
        this.comboFood = comboFood;
    }

    @Override
    public void addTicketInfo() {
        System.out.println("-----------Standard ticket------------");
        super.addTicketInfo();
        System.out.print("Enter screenType: ");
        setScreenType(sc.nextLine());
        System.out.print("Enter Combo food: ");
        setComboFood(sc.nextLine());
    }

    @Override
    public void updateTicketInfo() {
        System.out.println("-----------Standard ticket------------");
        super.updateTicketInfo();
        System.out.print("Update screenType: ");
        setScreenType(sc.nextLine());
        System.out.print("Update Combo food: ");
        setComboFood(sc.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("-----------Standard ticket------------");
        super.displayInfo();
        System.out.println("Screen type: " + getScreenType());
        System.out.println("Combo food: " + getComboFood());
    }
}
