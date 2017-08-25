package InterfejsZadania;

/**
 * Created by RENT on 2017-08-23.
 */
public class Rower implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.println("Jade");
    }

    @Override
    public void hamuj() {
        System.out.println("aqmuje");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Wywracam sie");
    }
}
