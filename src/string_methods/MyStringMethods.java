package string_methods;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/8/17.
 */
public class MyStringMethods {

    private static String myString = "";

    public static void main(String[] args) {
        MyStringMethods myStringMethods = new MyStringMethods();

        myStringMethods.readString();
        myStringMethods.printCounts("big", 'a');

        myStringMethods.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
        myStringMethods.printCounts("van", 'a');

        MyStringMethods myStringMethods2 = new MyStringMethods();
        myStringMethods2.setString("the elephant in the room wouldn't budge");
        myStringMethods2.printCounts("the", 'i');
    }

    static int countUpperCaseLetters(String myString) {
        // return the number of upper case letters in "myStr"
        int numberOfUpperCaseLetters = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isUpperCase(myString.charAt(i))) numberOfUpperCaseLetters++;
        }
        return numberOfUpperCaseLetters;
    }

    static int countLowerCaseLetters(String myString) {
        // return the number of lower case letters in "myStr"
        int numberOfLowerCaseLetters = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isLowerCase(myString.charAt(i))) numberOfLowerCaseLetters++;
        }

        return numberOfLowerCaseLetters;
    }

    static int countOccurrences(String userString) {
        // use indexOf and return the number of occurrences of the string "s" in "myStr"
        // I have no idea why you would want to use indexOf to check if a string contains s instead of many different options
        // this for loop is wildly complicated and confusing. this problem has been solved lots over at https://stackoverflow.com/a/1816989/6679563
        int numberOfOccurencesOfS = 0;

        for (int i = 0; i < userString.length(); i++) {
            int locatioOfS = userString.indexOf('s');
            if (locatioOfS >= 0) {
                numberOfOccurencesOfS++;
            }
        }

        return numberOfOccurencesOfS;
    }

    static int countOccurrences(char characterInput) {
        // use indexOf and return the number of occurrences of the character "c" in "myStr"
        // there is no indexOf for character in the java documentation. Is this a trick question? https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
        // We'll just turn the character into a string so we can see what letter it is using indexOf
        // also worth noting - having two different methods with the SAME name with DIFFERENT variables as parameters is not best practice

        String checkThisLetter = String.valueOf(characterInput);

        int numberOfOccurrencesOfC = 0;
        int locationOfC = checkThisLetter.indexOf('c');
        if (locationOfC >= 0) {
            numberOfOccurrencesOfC++;
        }

        return numberOfOccurrencesOfC;
    }

    String readString() {
        // Prompt the user and read in a String from a Scanner class from the keyboard
        // with the nextLine() method and store it in "myStr"
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in the desired String: ");
        myString = scan.nextLine();
        return myString;
    }

    void setString(String string) {
        myString = string;
    }

    public void printCounts(String s, char c) {
        System.out.println("***************************************");
        System.out.println("Analyzing: myStr=" + myString);
        System.out.println("Number of Upper case letters=" + countUpperCaseLetters(myString));
        System.out.println("Number of Lower case letters=" + countLowerCaseLetters(myString));
        System.out.println("Number of " + s + " is " + countOccurrences(s));
        System.out.println("Number of " + c + " is " + countOccurrences(c));
    }
}

