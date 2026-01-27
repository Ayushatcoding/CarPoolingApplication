import java.util.ArrayList;
import java.util.List;

public class RideBookingSystem {

    private List<User> users = new ArrayList<>();
    public List<Ride> rideList = new ArrayList<>();

    // SIGNUP
    public void signup(User user) {
        if (user == null) {
            System.out.println("Invalid user details");
            return;
        }
        users.add(user);
        System.out.println("Signup successful for: " + user.getEmail());
    }

    // LOGIN
    public User login(String email, String password) {
        if (email == null || email.trim().isEmpty() || password == null) {
            System.out.println("Your email or password is incorrect");
            return null;
        }

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful");
                return user;
            }
        }

        System.out.println("Invalid credentials");
        return null;
    }

    // UPDATE USER DETAILS
    public void updateUserDetails(int userId, String newName) {
        for (User user : users) {
            if (user.getId() == userId) {
                user.setName(newName);
                System.out.println("User details updated");
                return;
            }
        }
        System.out.println("User not found");
    }

    // DELETE ACCOUNT
    public void deleteAccount(int userId) {
        users.removeIf(user -> user.getId() == userId);
        System.out.println("Account deleted successfully");
    }

    // CREATE RIDE
    public void createRide(int id, String source, String destination,
                           int seats, double fare, User user) {

        Ride ride = new Ride(id, source, destination, seats, fare, user);
        rideList.add(ride);
        System.out.println("Ride Created: " + ride);
    }

    // SHOW ALL RIDES
    public List<Ride> showAllRide() {
        return rideList;
    }

    // SEARCH RIDE
    public List<Ride> searchRide(String source, String destination, int seats) {
        List<Ride> availableRide = new ArrayList<>();

        for (Ride ride : rideList) {
            if (ride.getSource().equals(source)
                    && ride.getDestination().equals(destination)
                    && ride.getSeats() >= seats) {

                availableRide.add(ride);
            }
        }
        return availableRide;
    }

    // UPDATE RIDE
    public void updateRide(int rideId, int newSeats, double newFare) {
        for (Ride ride : rideList) {
            if (ride.getId() == rideId) {
                ride.setSeats(newSeats);
                ride.setFare(newFare);
                System.out.println("Ride updated successfully");
                return;
            }
        }
        System.out.println("Ride not found");
    }

    // DELETE RIDE
    public void deleteRide(int rideId) {
        rideList.removeIf(ride -> ride.getId() == rideId);
        System.out.println("Ride deleted successfully");
    }

    // BOOK RIDE
    public void bookRide(int id, User user, int seatsBooked) {
        for (Ride ride : rideList) {
            if (ride.getId() == id) {
                if (ride.getSeats() >= seatsBooked) {
                    ride.setSeats(ride.getSeats() - seatsBooked);
                    System.out.println("Ride booked successfully by " + user.getName());
                } else {
                    System.out.println("Not enough seats available");
                }
                return;
            }
        }
        System.out.println("Ride not found");
    }
}
