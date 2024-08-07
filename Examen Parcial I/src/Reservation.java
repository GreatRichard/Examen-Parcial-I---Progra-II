import java.time.LocalDate;

// Class Reservation
public class Reservation {
    private Room room;
    private Customer customer;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    // Constructor to initialize reservation attributes
    public Reservation(Room room, Customer customer, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getter and setter for the room
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    // Getter and setter for the customer
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter and setter for the check-in date
    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    // Getter and setter for the check-out date
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    // Method to calculate the cost of the reservation
    public double calculateCost() {
        long days = java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return days * room.getPricePerNight();
    }
}