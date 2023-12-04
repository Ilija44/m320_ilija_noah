public class Goalie extends Spieler {
   public double koerperGroesse;

    public Goalie(String name, double koerperGroesse) {
        super(name);
        this.koerperGroesse = koerperGroesse;
    }

    @Override
    public void spielen() {
        System.out.println("Ich habe einen Schuss gehalten!");
    }

    @Override
   public void zeigeName() {
        super.zeigeName();
        System.out.println("Körpergrösse: " + koerperGroesse);
    }
}