package DekoratorPowtorka;

import Kawiarnia.*;

/**
 * Created by RENT on 2017-09-01.
 */
public class SokWisniowy extends SkladnikiDekorator {
    private Bimber _bimber;
    public SokWisniowy(Bimber bimber){
        _bimber = bimber;
    }

    @Override
    public String getOpis() {
        return _bimber.getOpis()+" z sokiem wiśniowym";
    }
}
