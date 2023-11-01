public class bus extends koeretoej{
    private int passagerer;
    private int antaldoere;

    public bus() {
    }

    public bus(int passagerer, int antaldoere) {
        this.passagerer = passagerer;
        this.antaldoere = antaldoere;
    }

    public bus(double vaegtafgift, int registreringsnummer, int passagerer, int antaldoere) {
        super(vaegtafgift, registreringsnummer);
        this.passagerer = passagerer;
        this.antaldoere = antaldoere;
    }

    public int getPassagerer() {
        return passagerer;
    }

    public void setPassagerer(int passagerer) {
        this.passagerer = passagerer;
    }

    public int getAntaldoere() {
        return antaldoere;
    }

    public void setAntaldoere(int antaldoere) {
        this.antaldoere = antaldoere;
    }

}
