package za.ac.cput.designpatterns.bridgepattern;

/**
 * Created by student on 2015/03/13.
 */
public class Lecturer extends Employee {

    public Lecturer(Occupation occupation){
            this.salary = 5000;
            this.occupation = occupation;
    }

    @Override
    public void annualPay() {
    }
}
