package ADAPTERAZAFDAEF;

import java.util.Random;

/**
 * Created by RENT on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {

    double[] _analogData;
    @Override
    public double[] getAnalog() {
        return new double[0];
    }

    @Override
    public void setAnalog(double[] analogData) {
        Random random = new Random();
        _analogData = random.doubles(40,0.0,2.0).toArray();
        _analogData = analogData;
    }

    @Override
    public void printAnalog() {

    }
}
