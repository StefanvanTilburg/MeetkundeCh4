package model;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht OOP Meetkunde oefeningen
 * <p>
 * Doel     Klasse Oppervlak. Bereken het totaal oppervlak van opgegeven figuren.
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    public ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        mijnFiguren.add(figuur);
    }

    @Override
    public String toString() {
        String eenReturn = "";

        if (!mijnFiguren.isEmpty()) {
            for (Figuur figuur : mijnFiguren) {
                eenReturn += figuur.toString() + "\n\n";
            }
        }

        return eenReturn;
    }
}