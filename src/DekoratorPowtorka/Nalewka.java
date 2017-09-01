package DekoratorPowtorka;

/**
 * Created by RENT on 2017-09-01.
 */
public class Nalewka extends Bimber {


    @Override
    public String getOpis() {
        return "Uzylismy "+iloscJednostek()+" Jednostek wody,do sporzadzenia "+ procent()+" % nalewki";
    }

    public int iloscJednostek() {
        int licznik = 0;

        for (int i = 90 ; i >= 34 ; i-= 8){
            if (i >34) licznik++;

        }
        return licznik;
    }

    public int procent(){
        int x = iloscJednostek() * 8;
        setProcent(90 - x);
        return getProcent();
    }
}
