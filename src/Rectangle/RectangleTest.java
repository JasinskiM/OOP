package Rectangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class RectangleTest {
    @Test
    public void RectangleGetLength(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0,rectangle.get_length(),0.1);
    }

    @Test
    public void RectangleSetLength(){
        Rectangle rectangle = new Rectangle();
        rectangle.set_length(5.0f);
        Assert.assertEquals(5.0,rectangle.get_length(),0.1);
    }
    @Test
    public void RectangleGetWidth(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0,rectangle.get_width(),0.1);
    }
    @Test
    public void RectangleSetWidth(){
        Rectangle rectangle = new Rectangle();
        rectangle.set_width(4.0f);
        Assert.assertEquals(4.0f,rectangle.get_width(),0.1);
    }
    @Test
    public void getAreaWhenWidth3AndLength5(){
        Rectangle rectangle = new Rectangle(5.0f,3.0f);
        Assert.assertEquals(15.0,rectangle.getArea(),0.1);
    }
    @Test
    public void getPerimeterWhemLength3AndWidth19(){
        Rectangle rectangle = new Rectangle(3.0f,19.0f);
        Assert.assertEquals(22.0,rectangle.getPerimeter(),0.1);
    }
    @Test
    public void toStringTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals("Rectangle[length =1.0,width =1.0]",rectangle.toString());
    }
}
