package newton_sqrt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/7/17.
 */

public class NewtonianUnitTests {

    @Test
    public void checksSquareRootOf4Returns2() {
        double expected = 2.0;
        double actual = GetNewtonsMethod.getSquareRoot(4);
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void squareRootOf16Returns4() {
        double expected = 4.0;
        double actual = GetNewtonsMethod.getSquareRoot(16);
        assertEquals(expected, actual, 0.000001);
    }

}
