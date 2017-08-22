package CircleCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class CylinderTest {
    @Test
    public void CylinderSetAndGetHeightTest(){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        Assert.assertEquals(5,cylinder.getHeight(),0.01);
    }

    @Test
    public void getVolumeTest(){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.set_radious(2);
        Assert.assertEquals(62.8,cylinder.getVolume(),0.1);
    }
}
