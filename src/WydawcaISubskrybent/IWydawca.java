package WydawcaISubskrybent;

/**
 * Created by RENT on 2017-08-30.
 */
public interface IWydawca {
    void dodajPrenumeratora(IOdbiorca prenumerator);
    void usunPrenumeratora(IOdbiorca prenumerator);
    void wyslijNowyNumer();
}
