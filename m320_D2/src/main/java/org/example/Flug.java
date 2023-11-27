package org.example;

import org.example.Passagier;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Flug {
    private List<Passagier> passagiere;

    public Flug() {
        this.passagiere = new ArrayList<>();
    }

    public void passagierAdden() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie den Namen des Passagiers ein:");
        String passagierName = sc.nextLine();
        Passagier passagier = new Passagier(passagierName);
        passagiere.add(passagier);
        System.out.println(passagierName + " wurde hinzugefügt.");
    }

    public void passagierDeleten() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Geben Sie den Namen des Passagiers ein:");
        String passagierName = sc1.nextLine();
        Passagier passagierToDelete = null;

        for (Passagier passagier : passagiere) {
            if (passagier.getName().equals(passagierName)) {
                passagierToDelete = passagier;
                break;
            }
        }
        if (passagierToDelete != null) {
            passagiere.remove(passagierToDelete);
            System.out.println("Passagier " + passagierName + " wurde entfernt.");
        }
    }

    public void passagierListeAusgeben() {
        System.out.println("Passagierliste :");
        for (Passagier p : passagiere) {
            p.nameAusgeben();
        }
    }
}