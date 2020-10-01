package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
        File rechthoekenBestand = new File("resources/Rechthoek.csv");
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
        try {
            Scanner invoer = new Scanner(rechthoekenBestand);
            while (invoer.hasNextLine()) {
                String[] regelArray = invoer.nextLine().split(",");
                double lengte = Double.parseDouble(regelArray[0]);
                double breedte = Double.parseDouble(regelArray[1]);
                double xCoordinaat = Double.parseDouble(regelArray[2]);
                double yCoordinaat = Double.parseDouble(regelArray[3]);
                rechthoeken.add(new Rechthoek(lengte, breedte, new
                        Punt(xCoordinaat, yCoordinaat), regelArray[4]));
            }

        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }

        File uitvoerBestand = new File("resources/Rechthoeken.txt");
        try {
            PrintWriter printWriter = new PrintWriter(uitvoerBestand);
            for (Rechthoek rechthoek : rechthoeken) {
                printWriter.println(rechthoek);
                printWriter.println();
            }
            printWriter.close();
        } catch (IOException nietGemaakt) {
            System.out.println("Het bestand kan niet worden aangemaakt.");
        }
    }
}
