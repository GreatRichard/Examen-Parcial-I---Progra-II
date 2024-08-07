import java.util.ArrayList;
import java.util.List;

// Class Customer extending Person
public class Customer extends Person {
    private String id;
    private List<Reservation> reservations; // List of reservations made
    private List<Invoice> invoices; // List of invoices generated

    // Constructor to initialize the name and ID of the customer
    public Customer(String name, String id) {
        super(name);
        this.id = id;
        this.reservations = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    // Getter for the ID
    public String getId() {
        return id;
    }

    // Setter for the ID
    public void setId(String id) {
        this.id = id;
    }

    // Getter for the list of reservations
    public List<Reservation> getReservations() {
        return reservations;
    }

    // Getter for the list of invoices
    public List<Invoice> getInvoices() {
        return invoices;
    }

    // Method to add a reservation
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Method to add an invoice
    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }
}