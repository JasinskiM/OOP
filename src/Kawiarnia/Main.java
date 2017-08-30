package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        Mleko mleko = new Mleko(czek);
        MlekoSojowe ms = new MlekoSojowe(mleko);
        BitaSmietana bs = new BitaSmietana(ms);
        System.out.printf("Nazwa: %s :: Cena: %.2f",bs.pobierzOpis(),bs.koszt());
    }
}
