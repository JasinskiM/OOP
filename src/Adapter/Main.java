package Adapter;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();
        IndykAdapter ia = new IndykAdapter(indyk);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(ia);
        uruchomKwakanieILatanie(ptaki);
    }

    public static void uruchomKwakanieILatanie(ArrayList<IKaczka> ptaki){
        for (IKaczka kaczka :ptaki) {
            kaczka.kwacz();
            kaczka.lataj();
        }

    }
}
