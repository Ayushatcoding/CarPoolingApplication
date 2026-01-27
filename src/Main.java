public class Main {

    public static void main(String[] args) {

        RideBookingSystem system = new RideBookingSystem();

        // Create users
        User user1 = new User(1, "Ritik", "ritik@gmail.com", "1234");
        User user2 = new User(2, "Aman", "aman@gmail.com", "abcd");

        // Create rides
        system.createRide(1, "Jaipur", "Delhi", 5, 725.00, user1);
        system.createRide(2, "Greater Noida", "Agra", 3, 340.00, user1);
        system.createRide(3, "Gurugram", "Faridabad", 2, 180.00, user2);
        system.createRide(4, "Gurugram", "Delhi", 2, 80.00, user2);
        system.createRide(5, "Gurugram", "Varanasi", 2, 340.00, user1);

        System.out.println("All Rides:");
        System.out.println(system.showAllRide());

        System.out.println("\nBooking Ride...");
        system.bookRide(4, user1, 1);
    }
}
