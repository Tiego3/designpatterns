package za.ac.cput.designpatterns.builderpatterntest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.designpatterns.builderpattern.*;

/**
 * Created by student on 2015/03/11.
 */
public class ClothingTest extends TestCase{

    ClothingBuilder clothingBuilder, clothingBuilder2;
    ClothingDirector clothingDirector, clothingDirector2;
    Clothing clothing, clothing2;

    @Before
    public void setUp() throws Exception {
        clothingBuilder = new DressClothingBuilder();
        clothingDirector = new ClothingDirector(clothingBuilder);
        clothingDirector.constructClothes();
        clothing = clothingDirector.getClothing();

        clothingBuilder2 = new PantsClothingBuilder();
        clothingDirector2 = new ClothingDirector(clothingBuilder2);
        clothingDirector2.constructClothes();
        clothing2 = clothingDirector2.getClothing();
    }

    @Test
    public void testClothing() throws Exception {
        Assert.assertNotNull(clothing);
        Assert.assertNotNull(clothing2);

        System.out.println(clothing);
        System.out.println(clothing2);

    }
}
