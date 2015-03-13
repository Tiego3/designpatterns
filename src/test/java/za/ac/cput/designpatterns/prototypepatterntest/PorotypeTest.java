package za.ac.cput.designpatterns.prototypepatterntest;

import junit.framework.TestCase;
import org.junit.Assert;
import za.ac.cput.designpatterns.prototypepatterns.Dress;
import za.ac.cput.designpatterns.prototypepatterns.Jeans;

/**
 * Created by student on 2015/03/12.
 */
public class PorotypeTest extends TestCase{
    Dress dress;
    Jeans jean;

    @Override
    public void setUp() throws Exception {
        dress = new Dress("CountryRoad");
        jean = new Jeans("Diesel");
    }

    public void testPrototype() throws Exception {
       Assert.assertNotEquals(jean, dress);
    }
}
