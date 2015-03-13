package za.ac.cput.designpatterns.singletontest;

import junit.framework.TestCase;
import za.ac.cput.designpatterns.singleton.Areas;

/**
 * Created by student on 2015/03/08.
 */
public class AreasTest extends TestCase{

    Areas testAreas;

    @Override
    public void setUp() throws Exception {
        testAreas = Areas.getInstance();
    }

    public void testRectangle() throws Exception {
        assertEquals(100,testAreas.rectangel(10,10));
    }
}
