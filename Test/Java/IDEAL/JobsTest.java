
/**
 * Created by jelliott on 9/16/2015.
 */
package Java.IDEAL;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class JobsTest extends TestCase {
    Jobs job;

    @Test
    public void testGetIncome() throws Exception {

        System.out.println("NULL's Income: "+job.NOJOB.getIncome());
        Assert.assertEquals(0, job.NOJOB.getIncome());

        System.out.println("BEGGER's Income: "+job.BEGGER.getIncome());
        Assert.assertEquals(1, job.BEGGER.getIncome());

        System.out.println("VAGRANT's Income: "+job.VAGRANT.getIncome());
        Assert.assertEquals(1, job.VAGRANT.getIncome());

        System.out.println("INTERN's Income: "+job.INTERN.getIncome());
        Assert.assertEquals(0, job.INTERN.getIncome());

        System.out.println("PACKINGBOY's Income: "+job.PACKINGBOY.getIncome());
        Assert.assertEquals(15000, job.PACKINGBOY.getIncome());

        System.out.println("FIREFIGHTER's Income: "+job.FIREFIGHTER.getIncome());
        Assert.assertEquals(35000, job.FIREFIGHTER.getIncome());

        System.out.println("BANKTER's Income: "+job.BANKTER.getIncome());
        Assert.assertEquals(100000, job.BANKTER.getIncome());

        System.out.println("SCIENTIST's Income: "+job.SCIENTIST.getIncome());
        Assert.assertEquals(30000, job.SCIENTIST.getIncome());

        System.out.println("INDEPENDENT's Income: "+job.INDEPENDENT.getIncome());
        Assert.assertEquals(600000, job.INDEPENDENT.getIncome());

        System.out.println("BUSINESSOWNER's Income: "+job.BUSINESSOWNER.getIncome());
        Assert.assertEquals(1000000, job.BUSINESSOWNER.getIncome());

        System.out.println("KING's Income: "+job.KING.getIncome());
        Assert.assertEquals(5000000, job.KING.getIncome());

        System.out.println("SULTAN's Income: "+job.SULTAN.getIncome());
        Assert.assertEquals(9000000, job.SULTAN.getIncome());

        System.out.println("GOD's Income: "+job.GOD.getIncome());
        Assert.assertEquals(0, job.GOD.getIncome());

        System.out.println("OMEGA's Income: "+job.OMEGA.getIncome());
        Assert.assertEquals(100000000, job.OMEGA.getIncome());




    }
    @Test

    public void testGetPower() throws Exception {

        //System.out.println("\n\n\n\n");

        System.out.println(" NULL's Income: "+job.NOJOB.getInfluence());
        Assert.assertEquals(0, job.NOJOB.getInfluence());

        System.out.println(" BEGGER's Income: "+job.BEGGER.getInfluence());
        Assert.assertEquals(0, job.BEGGER.getInfluence());

        System.out.println("VAGRANT's Income: "+job.VAGRANT.getInfluence());
        Assert.assertEquals(1, job.VAGRANT.getInfluence());

        System.out.println("INTERN's Income: "+job.INTERN.getInfluence());
        Assert.assertEquals(4, job.INTERN.getInfluence());

        System.out.println("PACKINGBOY's Income: "+job.PACKINGBOY.getInfluence());
        Assert.assertEquals(400, job.PACKINGBOY.getInfluence());

        System.out.println("FIREFIGHTER's Income: "+job.FIREFIGHTER.getInfluence());
        Assert.assertEquals(1000, job.FIREFIGHTER.getInfluence());

        System.out.println("BANKTER's Income: "+job.BANKTER.getInfluence());
        Assert.assertEquals(5000, job.BANKTER.getInfluence());

        System.out.println("SCIENTIST's Income: "+job.SCIENTIST.getInfluence());
        Assert.assertEquals(400000, job.SCIENTIST.getInfluence());

        System.out.println("INDEPENDENT's Income: "+job.INDEPENDENT.getInfluence());
        Assert.assertEquals(900000, job.INDEPENDENT.getInfluence());

        System.out.println("BUSINESSOWNER's Income: "+job.BUSINESSOWNER.getInfluence());
        Assert.assertEquals(1000000, job.BUSINESSOWNER.getInfluence());

        System.out.println("KING's Income: "+job.KING.getInfluence());
        Assert.assertEquals(5000000, job.KING.getInfluence());

        System.out.println("SULTAN's Income: "+job.SULTAN.getInfluence());
        Assert.assertEquals(9000000, job.SULTAN.getInfluence());


        System.out.println("GOD's Income: "+job.GOD.getInfluence());
        Assert.assertEquals(100000000, job.GOD.getInfluence());

        System.out.println("OMEGA's Income: "+job.OMEGA.getInfluence());
        Assert.assertEquals(100000000, job.OMEGA.getInfluence());

    }
}