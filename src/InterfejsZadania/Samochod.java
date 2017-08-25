package InterfejsZadania;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements ICzteroKolowy {
    @Override
    public void jedz() {
        System.out.println("Jade");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Jade na czolowke\n");
    }
}
