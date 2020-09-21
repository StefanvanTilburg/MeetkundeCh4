package controller;

import model.Cirkel;
import model.Punt;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
 */
public class MeetkundeLauncher {
    public static void main(String[] args) {

        // Input 3.2 Oefening 3.1
        Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(3, new Punt(1,4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);
        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length;
             arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());

            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getyCoordinaat());
        }
    }
}
