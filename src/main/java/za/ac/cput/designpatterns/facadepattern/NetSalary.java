package za.ac.cput.designpatterns.facadepattern;

/**
 * Created by student on 2015/03/13.
 */
public class NetSalary {

    public double getNetSalary(Salary sal,TaxSalary tSal, double nSal){
        return sal.getSalary(nSal) - tSal.getTaxSalary(sal,nSal);
    }
}
