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
}
