package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel     Deze class wordt gebruikt om cirkel gegevens in op te slaan
 */
public class Cirkel {
    private final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        this.setStraal(straal);
        this.setMiddelpunt(middelpunt);
        this.setKleur(kleur);
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), "wit");
    }

    public Cirkel() {
        this(1);
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    public double geefOmtrek() {
        return 2 * Math.PI * getStraal();
    }

    public double geefOppervlakte() {
        return Math.PI * getStraal() * getStraal();
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde " +
                "afstand tot een middelpunt hebben.";
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

}
