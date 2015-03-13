package za.ac.cput.designpatterns.facadepattern;

/**
 * Created by student on 2015/03/13.
 */
public class TaxSalary {

    public double getTaxSalary(Salary sal,double tSal){
        return 0.20 * sal.getSalary(tSal);
    }

}
