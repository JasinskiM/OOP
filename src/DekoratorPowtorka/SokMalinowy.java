package DekoratorPowtorka;

/**
 * Created by RENT on 2017-09-01.
 */
public class SokMalinowy extends SkladnikiDekorator {

    private Bimber _bimber;
    public SokMalinowy(Bimber bimber){
        _bimber = bimber;
    }
    @Override
    public String getOpis() {
        return _bimber.getOpis()+ "  z sokiem malinowym";
    }
}
