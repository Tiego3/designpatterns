package za.ac.cput.designpatterns.adapterpattern;

/**
 * Created by student on 2015/03/12.
 */
public interface Weight {
    public  double getWeightInPounds();

    public void settWeightInPounds(double weightInPounds);

    public double getWeightInKgs();

    public  void setWeightInKgs(double weightInKgs);
}
