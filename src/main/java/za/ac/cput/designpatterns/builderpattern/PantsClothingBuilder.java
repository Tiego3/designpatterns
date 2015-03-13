package za.ac.cput.designpatterns.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public class PantsClothingBuilder implements ClothingBuilder {
    private  Clothing clothing;

    public PantsClothingBuilder(){
        clothing = new Clothing();
    }

    @Override
    public void buildSize() {
        clothing.setSize("Medium");
    }

    @Override
    public void buildColour() {
        clothing.setColour("Black");
    }

    @Override
    public void buildStyle() {
        clothing.setStyle("Formal");
    }

    @Override
    public Clothing getClothing() {
        return clothing;
    }
}
