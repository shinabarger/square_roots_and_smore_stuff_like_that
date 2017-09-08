package newton_sqrt;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/7/17.
 */
public class GetNewtonsMethod {

    public static void main() {

        runNewtonsMethodProgram();
    }

    static void runNewtonsMethodProgram() {
        int userNumber = 0;

        double squareRootOfNumber = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("This is Newton's Method. We're going to compute a square root by guessing at it slowly.");
        userNumber = scan.nextInt();
        squareRootOfNumber = getSquareRoot(userNumber);

        getNewtonSquareRoot(userNumber);
        System.out.println("The normal square root is " + squareRootOfNumber);

    }

    static double getNewtonSquareRoot(int userNumber) {
        double newtonSquareRoot = 0;

        double guess = userNumber;
        double accuracy = userNumber + 1;

        while (accuracy > 0.0000001) {
            guess = (userNumber / guess + guess) / 2;
            //System.out.println(guess);
            accuracy = Math.abs(guess - userNumber / guess);
        }

        newtonSquareRoot = guess;
        System.out.println("The newton square root is: " + newtonSquareRoot);

        return newtonSquareRoot;
    }

    static double getSquareRoot(int userNumber) {
        double squareRootOfUserNumber = Math.sqrt(userNumber);

        return squareRootOfUserNumber;
    }
}
