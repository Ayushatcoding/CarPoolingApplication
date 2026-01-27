public class Ride {

    private int id;
    private String source;
    private String destination;
    private int seats;
    private double fare;
    private User user;   // driver / owner of ride

    // Constructor (UPDATED)
    public Ride(int id, String source, String destination,
                int seats, double fare, User user) {

        this.id = id;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.fare = fare;
        this.user = user;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeats() {
        return seats;
    }

    public double getFare() {
        return fare;
    }

    public User getUser() {
        return user;
    }

    // SETTERS
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    // toString
    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", seats=" + seats +
                ", fare=" + fare +
                ", driver=" + user.getName() +
                '}';
    }
}
