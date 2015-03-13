package za.ac.cput.designpatterns.adapterpattern;

/**
 * Created by student on 2015/03/12.
 */
public class Kilograms {
    double weightInKgs;

    public Kilograms(){

    }

    public double getWeight(){
        return weightInKgs;
    }

    public void setWeight(double weightInKgs){
        this.weightInKgs = weightInKgs;
    }
}
