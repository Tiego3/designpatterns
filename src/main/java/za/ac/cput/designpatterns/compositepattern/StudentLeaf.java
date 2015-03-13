package za.ac.cput.designpatterns.compositepattern;

/**
 * Created by student on 2015/03/12.
 */
public class StudentLeaf implements ComponentStudies{

    String studNumber;

    public StudentLeaf(String studNumber){
        this.studNumber = studNumber;
    }

    @Override
    public void course() {
         System.out.println("Software Development");
    }

    @Override
    public void motherModule() {
        System.out.println("Information Systems");
    }
}
