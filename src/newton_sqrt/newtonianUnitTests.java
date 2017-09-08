package newton_sqrt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/7/17.
 */

public class newtonianUnitTests {

    @Test
    public void firstTest() {
        double expected = 2.0;
        double actual = GetNewtonsMethod.getSquareRoot(4);
        assertEquals(expected, actual, 0.000001);
    }

}
