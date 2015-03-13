package za.ac.cput.designpatterns.compositestudiestest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designpatterns.compositepattern.ComponentStudies;
import za.ac.cput.designpatterns.compositepattern.Composite;
import za.ac.cput.designpatterns.compositepattern.StudentLeaf;

/**
 * Created by student on 2015/03/12.
 */
public class CompositeStudiesTest extends TestCase {

    StudentLeaf leaf, leaf1;
    Composite comp, comp1;

    @Before
    public void setUp() throws Exception {
        leaf = new StudentLeaf("213037041");
        leaf1 = new StudentLeaf("21333333");

        comp = new Composite();
        comp.add(leaf);

        comp1 = new Composite();
        comp1.add(leaf1);
    }

    @Test
    public void testCompositeStudTest() throws Exception {
        assertFalse(leaf1 == leaf);


    }
}
