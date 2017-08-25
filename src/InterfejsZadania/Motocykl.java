package InterfejsZadania;

/**
 * Created by RENT on 2017-08-23.
 */
public class Motocykl implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.println("Jade M");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje M");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Przewracam sie M");
    }

    public void dodajGazu(){
        System.out.println("Dodaje gazu");
    }
}
