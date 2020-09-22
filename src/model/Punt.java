package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
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
