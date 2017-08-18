package Circle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class CircleTest {
    @Test
    public void circleAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(),0.01);
    }
    @Test
    public void circleDefaultRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.get_radious(),0.01);
    }
    @Test
    public void circleAreaRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(),0.01);
    }
    @Test
    public void circleRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.get_radious(),0.1);
    }
    @Test
    public void circleRadius2StringTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius =2.0,color =red]",circle.toString());
    }
    @Test
    public void circleColorGetTest() {
        Circle circle = new Circle();
        Assert.assertEquals("red", circle.getColor());
    }
    @Test
    public void circleColorSetTest() {
        Circle circle = new Circle();
        circle.setColor("blue");
        Assert.assertEquals("blue", circle.getColor());
    }
    @Test
    public void circleRadiusSetTest() {
        Circle circle = new Circle();
        circle.set_radious(3.0);
        Assert.assertEquals(3.0, circle.get_radious(),0.1);
    }
}
