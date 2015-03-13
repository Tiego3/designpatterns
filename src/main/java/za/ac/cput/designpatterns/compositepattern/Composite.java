package za.ac.cput.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class Composite implements ComponentStudies {
    List<ComponentStudies> componentStudieses = new ArrayList<ComponentStudies>();

    @Override
    public void course() {
        for(ComponentStudies componentStudies:componentStudieses){
            componentStudies.course();
        }
    }

    @Override
    public void motherModule() {
        for(ComponentStudies componentStudies:componentStudieses){
            componentStudies.motherModule();
        }
    }

    public void add(ComponentStudies componentStudies) {
        componentStudieses.add(componentStudies);
    }

    public void remove(ComponentStudies componentStudies) {
        componentStudieses.remove(componentStudies);
    }

    public List<ComponentStudies> getComponentsStudies() {
        return componentStudieses;
    }

    public ComponentStudies getComponent(int index) {
        return componentStudieses.get(index);
    }

}
