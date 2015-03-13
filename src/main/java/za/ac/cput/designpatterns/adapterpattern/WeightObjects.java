package za.ac.cput.designpatterns.adapterpattern;

/**
 * Created by student on 2015/03/12.
 */
public class WeightObjects implements  Weight {

    Kilograms kilograms;

    public WeightObjects(){
        kilograms = new Kilograms();
    }

    @Override
    public double getWeightInPounds() {
        return kgToPound(kilograms.getWeight());
    }

    @Override
    public void settWeightInPounds(double weightInPounds) {
        kilograms.setWeight(poundsToKgs(weightInPounds));

    }

    @Override
    public double getWeightInKgs() {
        return kilograms.getWeight();

    }

    @Override
    public void setWeightInKgs(double weightInKgs) {
        kilograms.setWeight(weightInKgs);
    }

    private double poundsToKgs(double p){
        return (p*0.453);
    }

    private double kgToPound(double k){
        return (k*2.204);
    }
}
