package howDoIApproachProgramming;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/7/17.
 *
 * DISCLAIMER
 *
 * THIS CODE IS FROM FOLLOWING A VIDEO. I DIDN'T WRITE IT.
 *
 * Some thing I would do differently if I did write it:
 * - write better variable names, using camelCase
 * - not have everything happen within one method, I would extract it out so you can test that each method
 * - declacre all the variables at the top instead of where they start all willy nilly
 * - other things that are TBD
 */
public class SineCalculator {

    public static void main() {
        double angle_degrees = 0.0;
        double angle_radians = 0.0;
        int n = 0;
        int sign = 0;
        double nFactorial = 0.0;
        double xPower = 0.0;
        double guess = 0.0;
        double delta = 0.0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the angle for Sine Calculation: ");
        angle_degrees = keyboard.nextDouble();
        angle_radians = angle_degrees * Math.PI/180.0;

        n = 1;
        sign = 1;
        nFactorial = 1;
        xPower = angle_radians;
        guess = angle_radians;
        delta = 1000;

        while(delta >= .00000001) {
            n += 2;
            xPower = xPower * angle_radians * angle_radians;
            nFactorial = nFactorial * n * (n-1);
            sign = -sign;
            double next_term = sign * xPower / nFactorial;

            double next_guess = guess + next_term;
            delta = guess - next_guess;
            if (delta < 0)
                delta = - delta;
            guess = next_guess;
            System.out.println("N=" + n + " guess=" + guess + " delta=" + delta);
        }

        System.out.println("DONE");
        System.out.println("My guess =" + guess + " Math.sin(angle)=" + Math.sin(angle_radians));






    }
}
