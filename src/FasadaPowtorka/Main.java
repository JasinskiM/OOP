package FasadaPowtorka;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        KokainaFasada kf = new KokainaFasada(new Kokaina(), new Talk(), new CukierPuder());
        kf.mieszaj();

    }
}
