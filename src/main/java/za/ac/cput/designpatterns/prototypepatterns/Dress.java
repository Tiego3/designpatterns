package za.ac.cput.designpatterns.prototypepatterns;

/**
 * Created by student on 2015/0/12.
 */
public class Dress implements Prototype {
    String label;

    public Dress(String label){
        this.label = label;
    }

    @Override
    public Prototype doClothing() {
        return new Dress(label);
    }
}
