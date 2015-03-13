package za.ac.cput.designpatterns.factorypattern.coursefactory;

import za.ac.cput.designpatterns.factorypattern.CommunicationNetworks;
import za.ac.cput.designpatterns.factorypattern.SoftwareDevelopment;
import za.ac.cput.designpatterns.factorypattern.Course;

/**
 * Created by student on 2015/03/08.
 */
public class CourseFactory {
    public Course getMajorModule(String majorModule){
        if("IS300".equals(majorModule)) {
            return new SoftwareDevelopment();
        }
        else {
            return new CommunicationNetworks();
        }
    }
}
