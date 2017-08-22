package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class BookTest{
    @Test
    public void getNameAndAuthorAndPriceAndQtyTest(){
        Book book2 = new Book("LotR",new Author("Tolkien","Email",'m'),23.99,12);
        Assert.assertEquals("LotR",book2.getName());
        Assert.assertEquals(23.99, book2.getPrice(),0.01);
        Assert.assertEquals(12, book2.getQty(),0.01);

    }
}
