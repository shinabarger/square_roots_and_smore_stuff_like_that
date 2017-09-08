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
        int initialGuess = 0;
        int mostRecentGuess = 0;
        int newGuess = 0;
        double accuracy = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("This is Newton's Method. We're going to compute a square root by guessing at it slowly.");
        userNumber = scan.nextInt();
        double squareRootOfUserNumber = Math.sqrt(userNumber);

        initialGuess = userNumber / 2;
        mostRecentGuess = initialGuess;

        while(accuracy < .000001 && squareRootOfUserNumber != newGuess) {

            newGuess = ((userNumber/mostRecentGuess) + mostRecentGuess)/2;
            System.out.println("Guess is: " + newGuess);
            accuracy = Math.abs(newGuess - mostRecentGuess);
        }

        System.out.println("Newton square root is: " + newGuess);




    }
}
