package controller;

import model.*;

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
        Scanner invoer = new Scanner(System.in);

        boolean onjuisteInvoer = true;

        while (onjuisteInvoer) {
            System.out.print("Geef een straal: ");
            double straal = invoer.nextDouble();
            try {
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                System.out.println(ingevoerdeCirkel);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }

        onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Geef een lengte: ");
            double lengte = invoer.nextDouble();
            System.out.print("Geef een breedte: ");
            double breedte = invoer.nextDouble();
            try {
                Rechthoek ingevoerdeRechthoek = new Rechthoek(lengte, breedte);
                System.out.println(ingevoerdeRechthoek);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }
    }
}
