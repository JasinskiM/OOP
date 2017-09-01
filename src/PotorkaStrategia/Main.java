package PotorkaStrategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        Strategia strategia = new Strategia();

        strategia.ustawStrategie(new WypisanieLiczbNieparzystych(31));
        strategia.doWork();

        strategia.ustawStrategie(new WypisanieLiczbParzystych(31));
    }
}
