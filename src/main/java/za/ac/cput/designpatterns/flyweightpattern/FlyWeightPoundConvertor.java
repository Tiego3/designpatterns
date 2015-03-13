package za.ac.cput.designpatterns.flyweightpattern;

/**
 * Created by student on 2015/03/13.
 */
public class FlyWeightPoundConvertor implements Flyweight {

    String operation;

    public FlyWeightPoundConvertor(){
        operation = "convertToPound";
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void convert(double c) {
        System.out.println(operation+" convert " + c + " from kg to pounds " + (c*2.204) );
    }
}
