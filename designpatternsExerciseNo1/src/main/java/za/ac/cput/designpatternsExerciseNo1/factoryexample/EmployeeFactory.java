package za.ac.cput.designpatternsExerciseNo1.factoryexample;

/**
 * Created by student on 2015/03/13.
 */
public class EmployeeFactory {
    private static EmployeeFactory employeeFactory = null;
    public EmployeeFactory() {
    }
    public static EmployeeFactory getEmployeeFactoryInstance() {
        if (employeeFactory == null)
            return new EmployeeFactory();
        return employeeFactory;
    }
    public Employee getEmployeeRole(String employee) {
        if ("Lecturer".equalsIgnoreCase(employee)) {
            return new Lecturer();
        } else {
            return new Secretary();
        }
    }
}
