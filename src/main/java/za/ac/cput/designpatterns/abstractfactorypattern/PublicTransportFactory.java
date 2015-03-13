package za.ac.cput.designpatterns.abstractfactorypattern;

import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Bus;
import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Taxi;
import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Vehicle;

/**
 * Created by student on 2015/03/10.
 */
public class PublicTransportFactory extends TypeFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        if("Taxi".equals(vehicle)){
            return new Taxi();
        }
        else {
            return new Bus();
        }
    }
}
