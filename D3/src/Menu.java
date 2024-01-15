import java.util.Scanner;

public class Menu {
    void Menu()
    {
        System.out.println("Welche Flaeche willst du berechnen ? ");
        Scanner Scan1 = new Scanner(System.in);
        String Input = Scan1.next();
        switch (Input){
            case "Dreieck":
                System.out.println("Grundseite des Dreiecks in cm angeben:");
                Input = Scan1.next();
                double Laenge = StringToDouble(Input);
                System.out.println("Hoehe des Dreicks in cmangeben: ");
                Input = Scan1.next();
                double Breite = StringToDouble(Input);
                Dreieck Dreieck1 = new Dreieck();
                System.out.println(Dreieck1.FlaechenBerechnung(Laenge,Breite));
                break;
            case "Quadrat":
                System.out.println("Länge des Quadrats in cm angeben:");
                Input = Scan1.next();
                Laenge = StringToDouble(Input);
                System.out.println("Breite des Quadrats in cm angeben: ");
                Input = Scan1.next();
                Breite = StringToDouble(Input);
                Quadrat Quadrat1 = new Quadrat();
                System.out.println(Quadrat1.FlaechenBerechnung(Laenge,Breite));
                break;
        };


    };
    double StringToDouble(String Input)
    {
        return Double.parseDouble(Input);

    };
}
