package WydawcaISubskrybent;

/**
 * Created by RENT on 2017-08-30.
 */
public class KubaM implements IOdbiorca {
    private IWydawca _gazeta;

    public KubaM(IWydawca gazeta) {
        zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("HURrRaaa ! JEST NUMER %s Gazety!\n", numer);
    }

    public void rezygnujZGazety() {
        _gazeta.usunPrenumeratora(this);
    }

    public void zaprenumerujGazete(IWydawca gazeta) {
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);
    }
}
