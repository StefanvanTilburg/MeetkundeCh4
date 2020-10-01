package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht OOP Meetkunde (rode draad document)
 * <p>
 * Doel     Main methode voor Meetkunde opdracht.
 */
public class MeetkundeLauncher {
    public static void main(String[] args) {
        ArrayList<String> regelsUitBestand = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");
        try {
            Scanner invoer = new Scanner(rechthoekenBestand);
            while (invoer.hasNextLine()) {
                regelsUitBestand.add(invoer.nextLine());
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        if (regelsUitBestand.size() > 0) {
            ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
            for (int arrayTeller = 0; arrayTeller < regelsUitBestand.size(); arrayTeller++) {
                String[] regelArray = regelsUitBestand.get(arrayTeller).split(",");
                double lengte = Double.parseDouble(regelArray[0]);
                double breedte = Double.parseDouble(regelArray[1]);
                double xCoordinaat = Double.parseDouble(regelArray[2]);
                double yCoordinaat = Double.parseDouble(regelArray[3]);
                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt
                        (xCoordinaat, yCoordinaat), regelArray[4]));
            }
            for (Rechthoek rechthoek : rechthoeken) {
                System.out.println(rechthoek);
                System.out.println();
            }
        }
    }
}
