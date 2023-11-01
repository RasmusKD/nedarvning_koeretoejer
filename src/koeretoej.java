public class koeretoej {
    protected double vaegtafgift;
    protected int registreringsnummer;

    public koeretoej() {
    }

    public koeretoej(double vaegtafgift, int registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }

    public double getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(double vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }

    public int getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(int registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

}
