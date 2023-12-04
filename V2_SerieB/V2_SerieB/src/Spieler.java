public class Spieler {
    public String name;

    public Spieler(String name) {
        this.name = name;
    }
    public void zeigeName() {
        System.out.println("Spieler: " + name);
    }
    public void spielen() {
        System.out.println("Ich bin ein Spieler");
    }
}