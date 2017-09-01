package DekoratorPowtorka;



/**
 * Created by RENT on 2017-09-01.
 */
public abstract class Bimber {
    private int _procent;

    public int getProcent(){
        return _procent;
    }
    public void setProcent(int procent){
        _procent = procent;
    }
    protected String opis;
    public String getOpis(){
        return opis;
    }


}
