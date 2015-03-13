package za.ac.cput.designpatterns.flyweightTest;

import junit.framework.TestCase;
import org.junit.Assert;
import za.ac.cput.designpatterns.flyweightpattern.FlyWeightFactory;
import za.ac.cput.designpatterns.flyweightpattern.Flyweight;

/**
 * Created by student on 2015/03/13.
 */
public class FlyweightTest extends TestCase{

    FlyWeightFactory flyWeightFactory;
    Flyweight flyweightPound;
    Flyweight flyweightKg;

    @Override
    public void setUp() throws Exception {
        flyWeightFactory = FlyWeightFactory.getInstance();
        flyweightPound = flyWeightFactory.getFlyweight("pound");
        flyweightPound.convert(10);

        flyweightKg = flyWeightFactory.getFlyweight("kg");
        flyweightKg.convert(10);
    }

    public void testFlyweight() throws Exception {
        Assert.assertNotEquals(flyweightKg,flyWeightFactory);
    }
}
