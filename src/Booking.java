public class Booking {

    private int booking_id;
    private Ride ride;
    private User user;
    private int seats_booked;
    private double total_fare;

    public Booking(int booking_id, Ride ride, User user, int seats_booked) {
        this.booking_id = booking_id;
        this.ride = ride;
        this.user = user;
        this.seats_booked = seats_booked;
        this.total_fare = seats_booked * ride.getFare(); // FIX HERE
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", ride=" + ride +
                ", user=" + user +
                ", seats_booked=" + seats_booked +
                ", total_fare=" + total_fare +
                '}';
    }
}
