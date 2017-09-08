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
        double initialGuess = 0.0;
        double mostRecentGuess = 0.0;
        double newGuess = 0.0;
        double accuracy = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("This is Newton's Method. We're going to compute a square root by guessing at it slowly.");
        userNumber = scan.nextInt();
        getSquareRoot(userNumber);

    }

    static double getSquareRoot(int userNumber) {
        double squareRootOfUserNumber = Math.sqrt(userNumber);
        System.out.println(squareRootOfUserNumber);
        return squareRootOfUserNumber;
    }
}
