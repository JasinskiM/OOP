package PotorkaStrategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class WypisanieLiczbNieparzystych implements IStrategia {

    private int _x;

    public WypisanieLiczbNieparzystych(int x){
        _x = x;
    }


    @Override
    public void zadanie() {
        for (int i = 1; i <= _x ; i++) {
            if (i % 2 == 1)
            System.out.println(i);
        }
    }
}
