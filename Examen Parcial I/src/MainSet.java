import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

// Main class to test the system using Set
public class Main {
    public static void main(String[] args) {
        // Create rooms
        Room room1 = new Room(101, "single", 100.0);
        Room room2 = new Room(102, "double", 250.0);
        Room room3 = new Room(103, "suite", 500.0);

        // Create customers
        Customer customer1 = new Customer("Richard Meyer", "C001");
        Customer customer2 = new Customer("Edith Ponce", "C002");

        // Create sets to store rooms, customers, reservations, and invoices
        Set<Room> rooms = new HashSet<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Set<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);

        // Create a reservation
        try {
            if (room1.getStatus().equals("available")) {
                Reservation reservation = new Reservation(room1, customer1, LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 5));
                customer1.addReservation(reservation);

                // Generate invoice
                Invoice invoice = new Invoice(reservation);
                customer1.addInvoice(invoice);

                // Print details
                System.out.println("Reservation made successfully:");
                System.out.println("Customer: " + customer1.getName());
                System.out.println("Room: " + room1.getNumber());
                System.out.println("Total cost: " + invoice.getTotalAmount());
            } else {
                throw new RoomNotAvailableException("The room is not available.");
            }
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Show reservation and invoice information
        for (Reservation res : customer1.getReservations()) {
            System.out.println("Reservation by: " + res.getCustomer().getName());
            System.out.println("Room: " + res.getRoom().getNumber());
        }

        for (Invoice fac : customer1.getInvoices()) {
            System.out.println("Invoice for: " + fac.getReservation().getCustomer().getName());
            System.out.println("Total amount: " + fac.getTotalAmount());
        }
    }
}