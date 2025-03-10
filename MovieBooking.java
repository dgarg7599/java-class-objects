import java.util.*;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked = false;

    // Method to book a ticket
    void bookTicket(String movie, int seat, double ticketPrice) {
        if (!isBooked) {
            this.movieName = movie;
            this.seatNumber = seat;
            this.price = ticketPrice;
            this.isBooked = true;
            System.out.println("Ticket successfully booked!");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    // Method to display ticket details
    void displayTicket() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: " + price);
        } else {
            System.out.println("seats not booked.");
        }
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Book the ticket
        ticket.bookTicket(movieName, seatNumber, price);

        // Display ticket details
        ticket.displayTicket();

        sc.close();
    }
}
/*Enter Movie Name: hi
Enter Seat Number: 2
Enter Ticket Price: 200
Ticket successfully booked!
Movie Name: hi
Seat Number: 2
Ticket Price: 200.0
 */