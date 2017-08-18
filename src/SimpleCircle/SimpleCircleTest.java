package SimpleCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class SimpleCircleTest {
    @Test
    public void SimpleCircleGetRadiusTest(){
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals(1.0,simpleCircle.get_radius(),0.1);
    }
    @Test
    public void SimpleCircleSetRadiusTest(){
        SimpleCircle simpleCircle = new SimpleCircle();
        simpleCircle.set_radius(3.0);
        Assert.assertEquals(3.0,simpleCircle.get_radius(),0.1);
    }
    @Test
    public void SimpleCircleGetAreaTest(){
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals(3.14,simpleCircle.getArea(),0.01);
    }
    @Test
    public void getCircumferenceTest(){
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals(6.28,simpleCircle.getCircumference(),0.01);
    }
    @Test
    public void SimpleCircle2GetAreaTest(){
        SimpleCircle simpleCircle = new SimpleCircle(2.0);
        Assert.assertEquals(12.56,simpleCircle.getArea(),0.01);
    }
    @Test
    public void SimpleCircleToStringTest(){
        SimpleCircle simpleCircle = new SimpleCircle(2.0);
        Assert.assertEquals("Circle[radius=2.0]",simpleCircle.toString());
    }
}
