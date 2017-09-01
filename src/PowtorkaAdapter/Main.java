package PowtorkaAdapter;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<IBosh> kawa = new ArrayList<>();
        KapsulkiTassimo kt = new KapsulkiTassimo();
        DolceGusto dg = new DolceGusto();
        DolceGustoAdapter ba = new DolceGustoAdapter(dg);

        kawa.add(ba);
        kawa.add(kt);
    }
}
