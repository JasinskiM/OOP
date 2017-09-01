package PotorkaStrategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class WypisanieLiczbParzystych implements IStrategia {

    private int _x;
    public WypisanieLiczbParzystych(int x){
        _x = x;
    }
    @Override
    public void zadanie() {
        for (int i = 0; i <_x ; i++) {
            if (i%2 == 0)
                System.out.println(i);
        }
    }
}
