package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel     Class om punt gegevens in op te slaan.
 */
public class Punt {
    private double xCoordinaat;
    private double yCoordinaat;

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.setxCoordinaat(xCoordinaat);
        this.setyCoordinaat(yCoordinaat);
    }

    public Punt() {
        this(0,0);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", xCoordinaat, yCoordinaat);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public void setxCoordinaat(double xCoordinaat) {
        this.xCoordinaat = xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }

    public void setyCoordinaat(double yCoordinaat) {
        this.yCoordinaat = yCoordinaat;
    }
}
