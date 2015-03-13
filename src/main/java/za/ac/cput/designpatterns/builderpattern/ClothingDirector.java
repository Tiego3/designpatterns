package za.ac.cput.designpatterns.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public class ClothingDirector {
    private  ClothingBuilder clothingBuilder = null;

    public ClothingDirector(ClothingBuilder clothingBuilder){
        this.clothingBuilder = clothingBuilder;
    }

    public void constructClothes(){
        clothingBuilder.buildSize();
        clothingBuilder.buildColour();
        clothingBuilder.buildStyle();
    }

    public Clothing getClothing(){
        return  clothingBuilder.getClothing();
    }
}
