package za.ac.cput.designpatterns.factorytest;

import junit.framework.TestCase;
import za.ac.cput.designpatterns.factorypattern.Course;
import za.ac.cput.designpatterns.factorypattern.coursefactory.CourseFactory;

/**
 * Created by student on 2015/03/08.
 */
public class CourseTest extends TestCase {
    CourseFactory courseFactory = new CourseFactory();
    Course course1;
    Course course2;


    @Override
    public void setUp() throws Exception {
        course1 = courseFactory.getMajorModule("IS300");
        course2 = courseFactory.getMajorModule("ComNet");
    }

    public void testCourse() throws Exception {
       assertEquals("Information Systems",course1.majorModule());
       assertEquals("Communication Networks",course2.majorModule());

    }
}
