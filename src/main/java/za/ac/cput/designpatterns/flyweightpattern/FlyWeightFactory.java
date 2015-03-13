package za.ac.cput.designpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/13.
 */
public class FlyWeightFactory {

    private static FlyWeightFactory flyWeightFactory;

    private Map<String, Flyweight> flyweightPool;

    private FlyWeightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();
    }

    public static FlyWeightFactory getInstance() {
        if (flyWeightFactory == null) {
            flyWeightFactory = new FlyWeightFactory();
        }
        return flyWeightFactory;
    }

    public Flyweight getFlyweight(String key) {
        if (flyweightPool.containsKey(key)) {
            return flyweightPool.get(key);
        } else {
            Flyweight flyweight;
            if ("pound".equals(key)) {
                flyweight = new FlyWeightPoundConvertor();
            } else {
                flyweight = new FlyWeightKgConvertor();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }
}
