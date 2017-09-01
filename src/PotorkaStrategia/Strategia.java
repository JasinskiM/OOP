package PotorkaStrategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Strategia {
    private IStrategia _strategia ;

    public  void ustawStrategie(IStrategia strategia){
        _strategia = strategia;
    }

    public void doWork(){
        _strategia.zadanie();
    }



}
