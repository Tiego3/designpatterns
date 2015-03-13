package za.ac.cput.designpatternsExerciseNo1.abstractexample;

/**
 * Created by student on 2015/03/13.
 */
public class SecondYearSubjectFactory implements SubjectFactory {
    @Override
    public Subject getSubjectName(String subjectCode) {
        if("DS200S".equals(subjectCode)){
            return new SecondYearDS();
        }
        else
            return new SecondYearTP();
    }
}
