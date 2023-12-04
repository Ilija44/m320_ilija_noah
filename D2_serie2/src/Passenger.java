public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Passenger: " + name);
    }

    public String getName() {
        return name;
    }
}
