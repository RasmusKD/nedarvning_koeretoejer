public class lastbil extends koeretoej{
    private int hestekraefter;
    private double lastkapacitet;

    public lastbil() {
    }

    public lastbil(int hestekraefter, double lastkapacitet) {
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    public lastbil(double vaegtafgift, int registreringsnummer, int hestekraefter, double lastkapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public double getLastkapacitet() {
        return lastkapacitet;
    }

    public void setLastkapacitet(double lastkapacitet) {
        this.lastkapacitet = lastkapacitet;
    }
}
