package za.ac.cput.designpatterns.facadepattern;

/**
 * Created by student on 2015/03/13.
 */
public class Facade {

    public double salaryCalc(double d){
        Salary salary = new Salary();
        return salary.getSalary(d);
    }

    public double taxSalaryCalc(double d) {
        Salary salary = new Salary();
        TaxSalary taxSalary = new TaxSalary();
        return  taxSalary.getTaxSalary(salary,d);
    }

    public double netSalaryCalc(double d){
        Salary salary = new Salary();
        TaxSalary taxSalary = new TaxSalary();
        NetSalary netSalary = new NetSalary();
        return  netSalary.getNetSalary(salary,taxSalary,d);
    }
}
