package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht OOP Meetkunde (rode draad document)
 * <p>
 * Doel     Main methode voor Meetkunde opdracht.
 */
public class MeetkundeLauncher {
    public static void main(String[] args) {
        Cirkel mijnCirkel = new Cirkel(3, new Punt(2, 5), "groen");
        toonInformatie(mijnCirkel);

        Rechthoek mijnRechthoek = new Rechthoek(3, 4, new Punt(-2, 6),
                "blauw");
        toonInformatie(mijnRechthoek);

        Figuur[] figuren = new Figuur[3];
        figuren[0] = mijnCirkel;
        figuren[1] = mijnRechthoek;
        figuren[2] = new Cirkel(10, new Punt(-1,-3), "karmozijn");
        for (int figuurTeller = 0; figuurTeller < 3; figuurTeller++) {
            System.out.println(figuren[figuurTeller]);      // Zou ook toonInformatie methode kunnen gebruiken
            System.out.println();
        }

        // Boxing & unboxing & autoboxing
        // Converting primitive datatype to object is called boxing
        int integer1 = 3;
        int integer2 = Integer.valueOf(3);
        Integer integer3 = 3;
        Integer integer4 = Integer.valueOf(3);
        System.out.println(integer1 + "\n" + Integer.valueOf(integer2).toString()
                + "\n" + integer3 + "\n" + integer4.toString());
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }
}
