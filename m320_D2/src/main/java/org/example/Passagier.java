package org.example;

public class Passagier {
    private String name;

    public Passagier(String name) {
        this.name = name;
    }

    public void nameAusgeben() {
        System.out.println("Passagier: " + name);
    }

    public String getName() {
        return name;
    }
}