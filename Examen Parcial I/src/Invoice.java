// Class Invoice
public class Invoice {
    private Reservation reservation;
    private double totalAmount;

    // Constructor to initialize the invoice
    public Invoice(Reservation reservation) {
        this.reservation = reservation;
        this.totalAmount = reservation.calculateCost();
    }

    // Getter for the reservation
    public Reservation getReservation() {
        return reservation;
    }

    // Getter for the total amount
    public double getTotalAmount() {
        return totalAmount;
    }
}