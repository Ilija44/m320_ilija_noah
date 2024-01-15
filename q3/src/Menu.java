import java.util.Map;
import java.util.Scanner;

public class Menu {
    Menu(Map<String,String> map1){
        System.out.println("A: Alles anzeigen ");
        System.out.println("B: Nach Key suchen");
        System.out.println("C: Key entfernen");
        Scanner Scan1 = new Scanner(System.in);
        String Input = Scan1.nextLine();
        switch(Input)
        {
            case "A":
                for (Map.Entry e : map1.entrySet())
                {
                    System.out.println("Key: "+ e.getKey()+" Value: "+ e.getValue());}
                break;
            case "B":
                System.out.println("Welchen AirportCode suchst du ? ");
                Scan1 = new Scanner(System.in);
                Input = Scan1.nextLine();
                for (Map.Entry e : map1.entrySet())
                {
                    if(e.getKey().equals(Input)){
                        System.out.println("Key: "+ e.getKey()+" Value: "+ e.getValue());
                    }
                }
                break;
            case "C":
                System.out.println("Welchen AirportCode willst du entfernen ? ");
                Scan1 = new Scanner(System.in);
                Input = Scan1.nextLine();
                for (Map.Entry e : map1.entrySet())
                {
                    if(e.getKey().equals(Input)){
                        map1.remove(e.getKey());

                    }
                }

                break;
        }
    }
}
