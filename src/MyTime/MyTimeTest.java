package MyTime;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTimeTest {
    @Test
    public void nextSecondTest(){
        MyTime myTime = new MyTime(12,11,59);
        myTime.nextSecond();
        Assert.assertEquals(12,myTime.getMinute());
    }
    @Test
    public void nextSecondTestWhen59MinProvided(){
        MyTime myTime = new MyTime(12,59,59);
        myTime.nextSecond();
        Assert.assertEquals(0,myTime.getSecond());
        Assert.assertEquals(0,myTime.getMinute());
        Assert.assertEquals(13,myTime.getHour());
    }
}
