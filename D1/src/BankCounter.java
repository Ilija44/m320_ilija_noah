import java.sql.SQLOutput;
import java.util.Scanner;

public class BankCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account(1, 117.0, 199.0);
        Account account2 = new Account(2, 110.0, 222.0);
        Account account3 = new Account(3, 88.0, 500.0);

        while (true) {
            System.out.println("\n    Select an option:");
            System.out.println("|   1. Inquire Balance|");
            System.out.println("|   2. Deposit        |");
            System.out.println("|   3. Take away      |");
            System.out.println("|   4. Transfer       |");
            System.out.println("|   0. Exit           |");
            System.out.println("Enter your choice:     ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance of Account 1: " + account1.getBalance());
                    System.out.println("Balance of Account 2: " + account2.getBalance());
                    System.out.println("Balance of Account 3: " + account3.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to take off:");
                    double withdrawAmount = scanner.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter the amount to transfer:");
                    double transferAmount = scanner.nextDouble();
                    System.out.println("Enter the target account number:");
                    int targetAccountNumber = scanner.nextInt();

                    Account targetAccount;
                    switch (targetAccountNumber) {
                        case 1:
                            targetAccount = account1;
                            break;
                        case 2:
                            targetAccount = account2;
                            break;
                        case 3:
                            targetAccount = account3;
                            break;
                        default:
                            System.out.println("Invalid target account number.");
                            continue;
                    }

                    account1.transfer(targetAccount, transferAmount);
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }
}