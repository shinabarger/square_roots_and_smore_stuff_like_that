package string_methods;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/8/17.
 */
public class MyStringMethods {

    private String myString = "";

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

    void readString() {
        // Prompt the user and read in a String from a Scanner class from the keyboard
        // with the nextLine() method and store it in "myStr"
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
    }

    void setString(String string) {
        myString = string;
    }

    static int countOccurrences(String userString) {
        // use indexOf and return the number of occurrences of the string "s" in "myStr"
        // I have no idea why you would want to use indexOf to check if a string contains s instead of many different options
        // this for loop is wildly complicated and confusing. this problem has been solved lots over at https://stackoverflow.com/a/1816989/6679563
        int numberOfOccurencesOfS = 0;

        for (int i = 0; i < userString.length(); i++) {
            int locatioOfS = userString.indexOf('s');
            if (locatioOfS >= 0 ) {
                numberOfOccurencesOfS++;
            }
        }



        return numberOfOccurencesOfS;
    }

    int countOccurrences(char c) {
        // use indexOf and return the number of occurrences of the character "c" in "myStr"
        int numberOfOccurancesOfC = 0;

        return numberOfOccurancesOfC;
    }

    int countUpperCaseLetters() {
        // return the number of upper case letters in "myStr"
        int numberOfUpperCaseLetters = 0;

        return numberOfUpperCaseLetters;
    }

    int countLowerCaseLetters() {
        // return the number of lower case letters in "myStr"
        int numberOfLowerCaseLetters = 0;

        return numberOfLowerCaseLetters;
    }

    void printCounts(String string, char character) {
        System.out.println("***************************************");
        System.out.println("Analyzing: myStr=" + myString);
        System.out.println("Number of Upper case letters=" +
                countUpperCaseLetters());
        System.out.println("Number of Lower case letters=" +
                countLowerCaseLetters());
        System.out.println("Number of " + string + " is " + countOccurrences(string));
        System.out.println("Number of " + character + " is " + countOccurrences(character));
    }
}

