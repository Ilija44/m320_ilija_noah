import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    public List<Spieler> spielerListe;

    public Mannschaft() {
        spielerListe = new ArrayList<>();
    }

    public void zeigeMannschaft() {
        for (Spieler spieler : spielerListe) {
            spieler.zeigeName();
            spieler.spielen();
            if (spieler instanceof Angreifer) {
                Angreifer a = (Angreifer) spieler;
                a.jobTraining();
            }

            System.out.println();        }

    }
}