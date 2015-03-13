package za.ac.cput.designpatterns.flyweightpattern;

/**
 * Created by student on 2015/03/13.
 */
public class FlyWeightKgConvertor implements Flyweight{
    String operation;

    public FlyWeightKgConvertor(){
        operation = "convertToKg";
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void convert(double c) {
        System.out.println(operation+" convert " + c + " from pounds to kg " + (c*0.453) );
    }
}
