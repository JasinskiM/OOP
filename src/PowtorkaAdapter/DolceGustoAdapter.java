package PowtorkaAdapter;

/**
 * Created by RENT on 2017-09-01.
 */
public class DolceGustoAdapter implements IBosh {
    INescafe _nescafe;
    public DolceGustoAdapter(INescafe nescafe){
        _nescafe = nescafe;
    }

    @Override
    public void kawa() {

    }
}
