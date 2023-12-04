import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight {
    private List<Passenger> passengers;

    public Flight() {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the passenger:");
        String passengerName = sc.nextLine();
        Passenger passenger = new Passenger(passengerName);
        passengers.add(passenger);
        System.out.println(passengerName + " has been added.");
    }

    public void deletePassenger() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the name of the passenger:");
        String passengerName = sc1.nextLine();
        Passenger passengerToDelete = null;

        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(passengerName)) {
                passengerToDelete = passenger;
                break;
            }
        }
        if (passengerToDelete != null) {
            passengers.remove(passengerToDelete);
            System.out.println("Passenger " + passengerName + " has been removed.");
        }
    }

    public void displayPassengerList() {
        System.out.println("Passenger list:");
        for (Passenger p : passengers) {
            p.displayName();
        }
    }
}
