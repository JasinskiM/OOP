package DekoratorPowtorka;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        Nalewka woda = new Nalewka();
        SokMalinowy sm = new SokMalinowy(woda);
        System.out.printf("Nazwa :: %s",sm.getOpis());
        SokWisniowy sw = new SokWisniowy(woda);
        System.out.printf("\nNazwa :: %s",sw.getOpis());

    }
}
