package za.ac.cput.designpatterns.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public class DressClothingBuilder implements ClothingBuilder {
    private  Clothing clothing;

    public DressClothingBuilder(){
        clothing = new Clothing();
    }

    @Override
    public void buildSize() {
        clothing.setSize("Medium");
    }

    @Override
    public void buildColour() {
        clothing.setColour("Pink");
    }

    @Override
    public void buildStyle() {
        clothing.setStyle("Casual");
    }

    @Override
    public Clothing getClothing() {
        return clothing;

    }
}
