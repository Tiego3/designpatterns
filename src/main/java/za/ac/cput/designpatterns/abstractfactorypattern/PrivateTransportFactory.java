package za.ac.cput.designpatterns.abstractfactorypattern;

import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.MiniVan;
import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.PrivateCars;
import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Vehicle;

/**
 * Created by student on 2015/03/10.
 */
public class PrivateTransportFactory extends TypeFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        if("MiniVan".equals(vehicle)) {
            return new MiniVan();
        }
        else {
            return new PrivateCars();

        }

    }
}
