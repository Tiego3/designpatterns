package za.ac.cput.designpatternsExerciseNo1.abstractexample;

/**
 * Created by student on 2015/03/13.
 */
public class ThirdYearSubjectFactory implements SubjectFactory {
    @Override
    public Subject getSubjectName(String subjectCode) {
        if("DS300S".equals(subjectCode)){
            return new ThirdYearDS();
        }
        else
            return new ThirdYearTP();
    }
}
