package za.ac.cput.designpatterns.singleton;

/**
 * Created by student on 2015/03/08.
 */
public class Areas {
    private static Areas area = null;

    private Areas(){}

    public static Areas getInstance(){
        if(area == null){
            area = new Areas();
        }
        return area;
    }

    public int rectangel(int length,int width){
        return length*width;
    }

    public int triangel(int base, int height){
        return (1/2)*base*height;
    }
}
