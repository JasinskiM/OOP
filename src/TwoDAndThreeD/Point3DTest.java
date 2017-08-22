package TwoDAndThreeD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point3DTest {
    @Test
    public void setAndGetXYZTest(){
        Point3D point3D = new Point3D();
        point3D.setXYZ(3,4,5);
        Assert.assertArrayEquals(new float[]{3,4,5}, point3D.getXYZ(),0.1f);
    }
}
