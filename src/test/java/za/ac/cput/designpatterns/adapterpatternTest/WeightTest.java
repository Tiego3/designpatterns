package za.ac.cput.designpatterns.adapterpatternTest;

import junit.framework.TestCase;
import org.junit.Assert;
import za.ac.cput.designpatterns.adapterpattern.Weight;
import za.ac.cput.designpatterns.adapterpattern.WeightObjects;

/**
 * Created by student on 2015/03/12.
 */
public class WeightTest extends TestCase{
    Weight weight;

    @Override
    public void setUp() throws Exception {
        weight = new WeightObjects();
        weight.setWeightInKgs(10);
        weight.settWeightInPounds(20);
    }

    public void testWeight() throws Exception {
       assertEquals(9.06, weight.getWeightInKgs());
       assertEquals(19.96824, weight.getWeightInPounds());
    }

}
