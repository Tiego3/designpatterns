package za.ac.cput.designpatterns.bridgepattern;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Employee {

    Occupation occupation;
    double salary;

    public abstract void annualPay();

    public void  setOccupation(Occupation occupation){
        this.occupation = occupation;
    }

    public double getTaxedSalary(){
        if(salary<500000){
            return (salary - (salary*0.50));
        }
        else {
            return (salary - (salary*0.20));
        }
    }

}
