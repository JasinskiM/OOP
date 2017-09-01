package FasadaPowtorka;

/**
 * Created by RENT on 2017-09-01.
 */
public  class KokainaFasada {
    private Kokaina _kokaina;
    private Talk _talk;
    private CukierPuder _cukierpuder;
    public KokainaFasada(Kokaina kokaina,Talk talk, CukierPuder cukierPuder){
        _kokaina = kokaina;
        _talk = talk;
        _cukierpuder = cukierPuder;
    }

    public void mieszaj(){
        _cukierpuder.dodaj();
        _kokaina.dodaj();
        _talk.dodaj();
    }

}
