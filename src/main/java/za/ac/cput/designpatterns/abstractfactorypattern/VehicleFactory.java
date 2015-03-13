package za.ac.cput.designpatterns.abstractfactorypattern;

/**
 * Created by student on 2015/03/10.
 */
public class VehicleFactory {
    public TypeFactory getTypeFactory(String type){
        if("PublicTransport".equals(type)){
            return  new PublicTransportFactory();
        }
        else{
            return  new PrivateTransportFactory();
        }
    }
}
