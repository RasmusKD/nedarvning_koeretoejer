import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        personvogn p1 = new personvogn(100, 111, 120, "v6", 120);
        bus b1 = new bus(100, 111, 120, 2);
        lastbil l1 = new lastbil(100, 100, 100, 100);

        ArrayList<koeretoej> tabel = new ArrayList<>();
        tabel.add(p1);
        tabel.add(b1);
        tabel.add(l1);
        udskriv(tabel);

    }
    public static void udskriv(ArrayList <koeretoej> k){
        for (int i = 0; i < k.size(); i++){
            System.out.println("Køretøj " + (i + 1));
            System.out.println("Registreringsnummer " + k.get(i).getRegistreringsnummer());
            System.out.println("Vægtafgift " + k.get(i).getVaegtafgift());
            if (k.get(i) instanceof personvogn) {
                System.out.println("Motorstoerrelse " + ((personvogn) k.get(i)).getMotorstoerrelse());
                System.out.println("Hestekraefter " + ((personvogn) k.get(i)).getHestekraefter());
                System.out.println("Hastighed " + ((personvogn) k.get(i)).getHastighed());
            }
            if (k.get(i) instanceof bus) {
                System.out.println("Antal døre " + ((bus) k.get(i)).getAntaldoere());
                System.out.println("Passagerer " + ((bus) k.get(i)).getPassagerer());
            }
            if (k.get(i) instanceof lastbil) {
                System.out.println("Hestekræfter " + ((lastbil) k.get(i)).getHestekraefter());
                System.out.println("Lastkapacitet " + ((lastbil) k.get(i)).getLastkapacitet());
            }
        }
    }
}