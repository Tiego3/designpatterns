package za.ac.cput.designpatterns.abstractfactorypattern;

import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Vehicle;

/**
 * Created by student on 2015/03/10.
 */
public abstract class TypeFactory {
    public abstract Vehicle getVehicle(String type);
}
