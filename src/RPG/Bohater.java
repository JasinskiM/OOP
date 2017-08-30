package RPG;

/**
 * Created by RENT on 2017-08-30.
 */
public class Bohater {
    private String _imie;
    private Tarcza _tarcza;
    private Miecz _miecz;
    private Plecak _plecak;

    public Bohater(String imie, Tarcza tarcza, Miecz miecz, Plecak plecak){
        _imie = imie;
        _tarcza = tarcza;
        _miecz = miecz;
        _plecak = plecak;
    }
}
