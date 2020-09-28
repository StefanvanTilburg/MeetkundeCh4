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
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean eenReturn = false;

        if (figuur instanceof Rechthoek) {
            if (((Rechthoek) figuur).getLengte() <= lengte &&
                    ((Rechthoek) figuur).getBreedte() <= breedte){
                eenReturn = true;
            }
        } else {
            if (((Cirkel) figuur).getStraal() <= breedte / 2) {
                eenReturn = true;
            }
        }

        return eenReturn;
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