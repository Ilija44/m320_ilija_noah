import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flug flug = new Flug();
        Scanner scanner = new Scanner(System.in);
        int eingabe;

        do {
            System.out.println("\nWas willst du machen?");
            System.out.println("Schreibe 1 für 'Passagier hinzufügen'");
            System.out.println("Schreibe 2 für 'Passagier entfernen'");
            System.out.println("Schreibe 3 für 'Passagierliste zeigen'");
            eingabe = scanner.nextInt();
            scanner.nextLine();

            switch (eingabe) {
                case 1:
                    flug.passagierAdden();
                    break;
                case 2:
                    flug.passagierDeleten();
                    break;
                case 3:
                    flug.passagierListeAusgeben();
                    break;
            }
        } while (eingabe != 0);
    }
}
