package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel     Deze class wordt gebruikt om cirkel gegevens in op te slaan
 */
public class Cirkel extends Figuur {
    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.setStraal(straal);
        this.setMiddelpunt(middelpunt);
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Cirkel() {
        this(1);
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * getStraal();
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * getStraal() * getStraal();
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde " +
                "afstand tot een middelpunt hebben.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nStraal: " + straal + "\nMiddelpunt: " +
                middelpunt.toString();
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) throws IllegalArgumentException {
        if (straal <= 0) {
            throw new IllegalArgumentException("De straat moet positief zijn.");
        }
        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

}
