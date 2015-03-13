package za.ac.cput.designpatternsExerciseNo1.factoryexampletest;

import junit.framework.TestCase;
import za.ac.cput.designpatternsExerciseNo1.factoryexample.Employee;
import za.ac.cput.designpatternsExerciseNo1.factoryexample.EmployeeFactory;

/**
 * Created by student on 2015/03/13.
 */
public class EmployeeTest extends TestCase {
    EmployeeFactory employeeFactory = new EmployeeFactory();
    Employee employee1;
    Employee employee2;


    @Override
    public void setUp() throws Exception {
        employee1 = employeeFactory.getEmployeeRole("Lecturer");
        employee2 = employeeFactory.getEmployeeRole("Secretary");
    }

    public void testEmployee() throws Exception {
        assertEquals("Lecturer at CPUT", employee1.role());
        assertEquals("Secretary at CPUT", employee2.role());

    }
}
