package KlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("Za moich czasow.........!");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.println("Wali lasko\n");
    }

    public void zapalPapierosa(){
        System.out.println("Pale papierosa\n");
    }
}
