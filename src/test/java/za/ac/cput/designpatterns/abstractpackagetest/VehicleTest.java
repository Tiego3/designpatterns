package za.ac.cput.designpatterns.abstractpackagetest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designpatterns.abstractfactorypattern.TypeFactory;
import za.ac.cput.designpatterns.abstractfactorypattern.VehicleFactory;
import za.ac.cput.designpatterns.abstractfactorypattern.vehicles.Vehicle;

/**
 * Created by student on 2015/03/10.
 */
public class VehicleTest extends TestCase {
    VehicleFactory vehicleFactory;

    TypeFactory typeFactory;
    TypeFactory typeFactory1;

    Vehicle v1;
    Vehicle v2;
    Vehicle v3;
    Vehicle v4;

    @Before
    public void setUp() throws Exception {
        vehicleFactory = new VehicleFactory();

        typeFactory = vehicleFactory.getTypeFactory("PrivateTransport");
        v1 = typeFactory.getVehicle("PrivateCar");
        v2 = typeFactory.getVehicle("MiniVan");

        typeFactory1 = vehicleFactory.getTypeFactory("PublicTransport");
        v3 = typeFactory1.getVehicle("Taxi");
        v4 = typeFactory1.getVehicle("Bus");


    }

    @Test
    public void testVehicle() throws Exception {
        Assert.assertEquals("bmw", v1.getBrandName());
        Assert.assertEquals("Toyota",v2.getBrandName());
        Assert.assertEquals("VW",v3.getBrandName());
        Assert.assertEquals("volvo",v4.getBrandName());
    }
}
