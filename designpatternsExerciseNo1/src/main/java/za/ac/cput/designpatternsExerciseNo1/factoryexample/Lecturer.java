package za.ac.cput.designpatternsExerciseNo1.factoryexample;

/**
 * Created by student on 2015/03/13.
 */
public class Lecturer implements Employee{
    @Override
    public String role() {
        return "Lecturer at CPUT";
    }
}
