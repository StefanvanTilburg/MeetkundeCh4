package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel     Deze class wordt gebruikt om Rechthoek gegevens in op te slaan.
 */
public class Rechthoek extends Figuur {
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
        this.setLengte(lengte);
        this.setBreedte(breedte);
        this.setHoekpuntLinksBoven(hoekpuntLinksBoven);
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte,new Punt(),DEFAULTWAARDE_KLEUR);
    }

    public Rechthoek() {
        this(2,1);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return (this.getLengte() + this.getBreedte()) *  2;
    }

    @Override
    public double geefOppervlakte() {
        return this.getLengte() * this.getBreedte();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLengte: " + lengte + "\nBreedte: " +
                breedte + "\nHoekpunt: " + hoekpuntLinksBoven.toString();
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public void setHoekpuntLinksBoven(Punt hoekpuntLinksBoven) {
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }
}
