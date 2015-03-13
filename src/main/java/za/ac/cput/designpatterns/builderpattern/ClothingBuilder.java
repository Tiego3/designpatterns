package za.ac.cput.designpatterns.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public interface ClothingBuilder {
    public void buildSize();
    public void buildColour();
    public void buildStyle();

    public Clothing getClothing();
}
