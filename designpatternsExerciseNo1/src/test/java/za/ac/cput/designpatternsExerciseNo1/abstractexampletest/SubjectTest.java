package za.ac.cput.designpatternsExerciseNo1.abstractexampletest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designpatternsExerciseNo1.abstractexample.SecondYearSubjectFactory;
import za.ac.cput.designpatternsExerciseNo1.abstractexample.Subject;
import za.ac.cput.designpatternsExerciseNo1.abstractexample.SubjectFactory;
import za.ac.cput.designpatternsExerciseNo1.abstractexample.ThirdYearSubjectFactory;

/**
 * Created by student on 2015/03/13.
 */
public class SubjectTest extends TestCase {
    SecondYearSubjectFactory secondYearSubjectFactory;
    ThirdYearSubjectFactory thirdYearSubjectFactory;

    SubjectFactory subjectFactory;
    SubjectFactory subjectFactory1;

    Subject v1;
    Subject v2;
    Subject v3;
    Subject v4;

    @Before
    public void setUp() throws Exception {
        secondYearSubjectFactory = new SecondYearSubjectFactory();
        thirdYearSubjectFactory = new ThirdYearSubjectFactory();

      //  subjectFactory = secondYearSubjectFactory.getSubjectName("DS300S");
        v1 = subjectFactory.getSubjectName("Development Software 2");
        v2 = subjectFactory.getSubjectName("Technical Programming 1");

       // subjectFactory1 = thirdYearSubjectFactory.getSubjectName("TP300S");
        v3 = subjectFactory1.getSubjectName("Development Software 2");
        v4 = subjectFactory1.getSubjectName("Technical Programming 2");


    }

    @Test
    public void testSubject() throws Exception {
        Assert.assertEquals("Development Software 2", v1.getSubjectName());
        Assert.assertEquals("Technical Programming 1",v2.getSubjectName());
        Assert.assertEquals("Development Software 2",v3.getSubjectName());
        Assert.assertEquals("Technical Programming 2",v4.getSubjectName());
    }
}
