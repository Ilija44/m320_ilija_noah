import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String,String>();
        try{
            File File1 = new File("src/airports.csv");
            Scanner Scan1 = new Scanner(File1);

            while(Scan1.hasNextLine()){
                String Input = Scan1.nextLine();
                String[] Airportsarray = Input.split(",");
                map1.put(Airportsarray[0],Airportsarray[1]);

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();//gibt Fehlermeldungen aus

        };
        while (true){
            Menu m = new Menu(map1);

        }



        }

    }

