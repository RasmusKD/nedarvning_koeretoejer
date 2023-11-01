public class personvogn extends koeretoej{
    private double hastighed;
    private String motorstoerrelse;
    private int hestekraefter;

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }

    public String getMotorstoerrelse() {
        return motorstoerrelse;
    }

    public void setMotorstoerrelse(String motorstoerrelse) {
        this.motorstoerrelse = motorstoerrelse;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public personvogn(double vaegtafgift, int registreringsnummer, double hastighed, String motorstoerrelse, int hestekraefter) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.motorstoerrelse = motorstoerrelse;
        this.hestekraefter = hestekraefter;
    }

}
