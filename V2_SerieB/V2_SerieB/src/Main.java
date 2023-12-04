public class Main {
    public static void main(String[] args) {
        Goalie g = new Goalie("Noah", 1.85);
        Angreifer a = new Angreifer("Ilija");
        Verteidiger v = new Verteidiger("Henri");


        Mannschaft m = new Mannschaft();
        m.spielerListe.add(g);
        m.spielerListe.add(a);
        m.spielerListe.add(v);

        m.zeigeMannschaft();
    }
}