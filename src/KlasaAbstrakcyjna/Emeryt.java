package KlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class Emeryt {
    public static final  int IloscOczu = 2;
    public abstract void krzyczNaDzieci();

    public abstract void walczOMiejsceWAutobusie();

    public void biegnijDoSklepu(int odleglosc, int predkosc){
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kiuelbe bede za"+czas);
    }
}
