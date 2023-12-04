import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("\nWhat do you want to do?");
            System.out.println("Type 1 for 'Add Passenger'");
            System.out.println("Type 2 for 'Remove Passenger'");
            System.out.println("Type 3 for 'Show Passenger List'");
            System.out.println("Type 0 to 'Exit'");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    flight.addPassenger();
                    break;
                case 2:
                    flight.deletePassenger();
                    break;
                case 3:
                    flight.displayPassengerList();
                    break;
            }
        } while (input != 0);
    }
}
