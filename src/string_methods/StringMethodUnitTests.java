package string_methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/7/17.
 *
 * Many of these tests simply will not work due to how the code is being forced to run. Bummer, but that's just how it goes when you use GLOBAL variables. Gross!
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

    @Test
    public void seeIfThreeSsReturnTheNumberThree() {
        int expected = 3;
        int actual = MyStringMethods.countOccurrences("sss");
        assertEquals(expected, actual);
    }

    @Test
    public void seeIfcReturns1ForCharacter() {
        int expected = 1;
        int actual = MyStringMethods.countOccurrences('c');
        assertEquals(expected, actual);
    }

    @Test
    public void seeIfsReturns0ForCharacter() {
        int expected = 0 ;
        int actual = MyStringMethods.countOccurrences('s');
        assertEquals(expected, actual);
    }

    @Test
    public void countUpperCaseLettersReturns1() {
        int expected = 1 ;
        int actual = MyStringMethods.countUpperCaseLetters("A");
        assertEquals(expected, actual);
    }

    @Test
    public void countUpperCaseLettersReturns2() {
        int expected = 2 ;
        int actual = MyStringMethods.countUpperCaseLetters("AB");
        assertEquals(expected, actual);
    }

    @Test
    public void countLowerCaseLettersReturns1() {
        int expected = 1 ;
        int actual = MyStringMethods.countLowerCaseLetters("a");
        assertEquals(expected, actual);
    }


}
