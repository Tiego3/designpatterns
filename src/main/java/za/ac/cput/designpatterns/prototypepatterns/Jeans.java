package za.ac.cput.designpatterns.prototypepatterns;

/**
 * Created by student on 2015/03/12.
 */
public class Jeans implements Prototype {

    String label;

    public Jeans(String label){
        this.label = label;
    }

    @Override
    public Prototype doClothing() {
        return new Jeans(label);
    }
}
