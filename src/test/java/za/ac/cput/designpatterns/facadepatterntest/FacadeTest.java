package za.ac.cput.designpatterns.facadepatterntest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.designpatterns.facadepattern.Facade;

/**
 * Created by student on 2015/03/13.
 */
public class FacadeTest extends TestCase{

    Facade facade = new Facade();
    double d = 100.00;

    @Test
    public void testFacade() throws Exception {
        assertEquals(100.00, facade.salaryCalc(d));
        assertEquals(20.00,facade.taxSalaryCalc(d));
        assertEquals(80.00, facade.netSalaryCalc(d));
    }
}
