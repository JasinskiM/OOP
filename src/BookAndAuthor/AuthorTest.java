package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class AuthorTest {

    @Test
    public void getNameAndEmailAndGenderTest(){
        Author author = new Author("Andrzej","EMAJL",'m');
        Assert.assertEquals("Andrzej",author.getName());
        Assert.assertEquals("EMAJL",author.getEmail());
        Assert.assertEquals('m',author.getGender(),'1');
    }

    @Test
    public void setEmailTest(){
        Author author = new Author("","",'m');
        author.setEmail("Kaczucha");
        Assert.assertEquals("Kaczucha",author.getEmail());
    }
}
