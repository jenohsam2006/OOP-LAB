package URK24CS1154;
class TicketBooking {
    private int totalTickets = 1;    
    public synchronized void bookTicket(String userName) {
        if (totalTickets > 0) {
            System.out.println(userName + " is trying to book a ticket...");
            try {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
            totalTickets--;
            System.out.println(userName + " successfully booked the ticket!");
        } 
        else {
            System.out.println(userName + " sorry, ticket is already booked!");
        }
    }
}
class UserThread extends Thread {
    private TicketBooking booking;
    private String userName;
    public UserThread(TicketBooking booking, String userName) {
        this.booking = booking;
        this.userName = userName;
    }
    public void run() {
        booking.bookTicket(userName);
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        UserThread user1 = new UserThread(booking, "User 1");
        UserThread user2 = new UserThread(booking, "User 2");
        user1.start();
        try {
            Thread.sleep(200); 
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
        user2.start();
    }
}





package URK24CS1154;
import java.util.Scanner;
class FlowerShop {
    public void deliverFlower(String customerName, String flowerType) {
        System.out.println(customerName + " has ordered " + flowerType + ".");
        System.out.println("Processing " + customerName + "'s order...");
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
 System.out.println("Order for " + customerName + " (Flower: " + flowerType + ") has been delivered!\n");
    }
}
class CustomerOrder extends Thread {
    private FlowerShop shop;
    private String customerName;
    private String flowerType;
    public CustomerOrder(FlowerShop shop, String customerName, String flowerType) {
        this.shop = shop;
        this.customerName = customerName;
        this.flowerType = flowerType;
    }
    public void run() {
        shop.deliverFlower(customerName, flowerType);
    }
}
public class FlowerShopDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlowerShop shop = new FlowerShop();
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        CustomerOrder[] orders = new CustomerOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Flower type: ");
            String flower = sc.nextLine();
            orders[i] = new CustomerOrder(shop, name, flower);
        }
        System.out.println("\nStarting flower deliveries...\n");
        for (CustomerOrder order : orders) {
            order.start();
            try {
                order.join(); 
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}
