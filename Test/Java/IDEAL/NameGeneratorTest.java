package IDEAL;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jelliott on 9/17/2015.
 */
public class NameGeneratorTest extends TestCase {

    @After
    public void runBeforeTest(){
        NameGenerator name = new NameGenerator(false);
        System.out.println(name.getFirstName());
        System.out.println(name.getLastName());
    }

    @Test
    public void testGetFirstName() throws Exception {

        NameGenerator name = new NameGenerator();
        Assert.assertTrue(name.getFirstName(), true);
        //System.out.println(name.getFirstName());


    }
    @Test
    public void testGetLastName() throws Exception {
        NameGenerator name = new NameGenerator();
        Assert.assertTrue(name.getFirstName(), true);

        //System.out.println(name.getLastName());

    }
}