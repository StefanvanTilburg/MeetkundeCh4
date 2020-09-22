package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel     Deze class wordt gebruikt om Rechthoek gegevens in op te slaan.
 */
public class Rechthoek {
    private final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.setLengte(lengte);
        this.setBreedte(breedte);
        this.setHoekpuntLinksBoven(hoekpuntLinksBoven);
        this.setKleur(kleur);
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte,new Punt(),"wit");
    }

    public Rechthoek() {
        this(2,1);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double geefOmtrek() {
        return (this.getLengte() + this.getBreedte()) *  2;
    }

    public double geefOppervlakte() {
        return this.getLengte() * this.getBreedte();
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
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

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
