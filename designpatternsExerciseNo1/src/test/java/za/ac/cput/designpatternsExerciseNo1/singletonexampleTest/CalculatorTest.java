package za.ac.cput.designpatternsExerciseNo1.singletonexampleTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.designpatternsExerciseNo1.singletonexample.Calculator;

/**
 * Created by student on 2015/03/13.
 */
public class CalculatorTest extends TestCase {
    Calculator testCalc;

    @Override
    public void setUp() throws Exception {
        testCalc = Calculator.getInstance();
    }

    public void testRectangle() throws Exception {
        assertEquals(20,testCalc.add(10, 10));
        assertEquals(100,testCalc.multiply(10,10));
        assertEquals(0,testCalc.substract(10,10));
    }
}
