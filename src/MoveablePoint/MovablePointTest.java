package MoveablePoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class MovablePointTest {
    @Test
    public void setAndGetSpeedTest(){
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(21,34);
        Assert.assertArrayEquals(new float[]{21,34},movablePoint.getSpeed(),0.1f);
    }

    @Test
    public void movablePointTest(){
        MovablePoint movablePoint = new MovablePoint(4,3,3,3);
        movablePoint.move();
        Assert.assertEquals(7f , movablePoint.getX(), 0.01f);
        Assert.assertEquals(6f , movablePoint.getY(), 0.01f);
    }
}
