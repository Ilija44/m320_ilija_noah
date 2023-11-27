import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private static List<Person> People = new ArrayList<>();

    public Person(String name) {
        this.name = name;
        People.add(this);
    }

    public String getName() {
        return name;
    }


    public static void printPeople() {
        for (Person person : People) {
            System.out.println("Name : " + person.getName());
        }
    }
}