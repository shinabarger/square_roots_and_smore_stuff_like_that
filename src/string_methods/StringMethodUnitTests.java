package string_methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/7/17.
 */

public class StringMethodUnitTests {

    @Test
    public void firstTest1() {
        int expected = 1;
        int actual = MyStringMethods.countOccurrences("s");
        assertEquals(expected, actual);
    }

    @Test
    public void seeIfTwoSsReturnTheNumber2() {
        int expected = 2;
        int actual = MyStringMethods.countOccurrences("ss");
        assertEquals(expected, actual);
    }

}
