package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht OOP Meetkunde (rode draad document)
 * <p>
 * Doel     Main methode voor Meetkunde opdracht.
 */
public class MeetkundeLauncher {
    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(10, 7);
        oppervlak.voegFiguurToe(new Rechthoek(3, 3, new Punt(0, 7), "rood"));
        oppervlak.voegFiguurToe(new Rechthoek(3, 2, new Punt(0, 4), "geel"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(0, 2), "groen"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(3, 7), "paars"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 4, new Punt(5, 7), "oranje"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 3, new Punt(5, 3), "blauw"));
        System.out.println(oppervlak);

        Oppervlak oppervlak2 = new Oppervlak(10, 7);
        oppervlak2.voegFiguurToe(new Rechthoek(4, 3, new Punt(0, 7), "rood"));
        oppervlak2.voegFiguurToe(new Cirkel(4, new Punt(1.5, 1.5), "geel"));
        oppervlak2.voegFiguurToe(new Rechthoek(9, 8, new Punt(3, 2), "groen"));
        oppervlak2.voegFiguurToe(new Rechthoek(4, 1, new Punt(5, 7), "oranje"));
        oppervlak2.voegFiguurToe(new Cirkel(2, new Punt(8, 5), "paars"));
        oppervlak2.voegFiguurToe(new Rechthoek(11, 3, new Punt(5, 3), "blauw"));
        System.out.println(oppervlak2);
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }
}
