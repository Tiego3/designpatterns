package za.ac.cput.designpatternsExerciseNo1.builderexampletest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designpatternsExerciseNo1.builderexample.*;

/**
 * Created by student on 2015/03/13.
 */
public class CourseTest extends TestCase {
    DiplomaCourseBuilder diplomaCourseBuilder, diplomaCourseBuilder2;
    DiplomaCourseDirector diplomaCourseDirector, diplomaCourseDirector2;
    DiplomaCourse diplomaCourse, diplomaCourse2;

    @Before
    public void setUp() throws Exception {
        diplomaCourseBuilder = new SecondYearDiplomaCourseBuilder();
        diplomaCourseDirector = new DiplomaCourseDirector(diplomaCourseBuilder);
        diplomaCourseDirector.constructDiplomaCourse();
        diplomaCourse = diplomaCourseDirector.getDiplomaCourse();

        diplomaCourseBuilder2 = new ThirdYearDiplomaCourseBuilder();
        diplomaCourseDirector2 = new DiplomaCourseDirector(diplomaCourseBuilder2);
        diplomaCourseDirector2.constructDiplomaCourse();
        diplomaCourse2 = diplomaCourseDirector2.getDiplomaCourse();
    }

    @Test
    public void testDiplomaCourse() throws Exception {
        Assert.assertNotNull(diplomaCourse);
        Assert.assertNotNull(diplomaCourse2);

        System.out.println(diplomaCourse);
        System.out.println(diplomaCourse2);

    }
}
