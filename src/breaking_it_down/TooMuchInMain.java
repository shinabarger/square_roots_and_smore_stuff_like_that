package breaking_it_down;

import java.util.Scanner;

public class TooMuchInMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        int answer;
        char operator = 'q';
        boolean keepCalculating = true;
        int whichNumber = 0;


        while (keepCalculating) {

            operator = doCalculation(scan, operator);

            if (operator == 'q') {
                break;
            }

            whichNumber = 1;
            System.out.println("Enter operand " + whichNumber);
            String userInput;
            userInput = getOperandAndValidateThatItIsAValidNumber(scan);

            operand1 = Integer.parseInt(userInput);

            whichNumber = 2;
            System.out.println("Enter operand " + whichNumber);
            userInput = getOperandAndValidateThatItIsAValidNumber(scan);

            operand2 = Integer.parseInt(userInput);

            answer = doArithmetic(operand1, operand2, operator);

            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + answer);

            System.out.println("=======================");
        }

        System.out.println("Finished Calculations");

    }

    private static char doCalculation(Scanner scan, char operator) {
        boolean operator_is_good = false;

        do {
            System.out.print("Enter an Operator: + - * / q for quit: ");
            String strOperator = scan.nextLine();
            strOperator = strOperator.trim();
            if (strOperator.length() == 0)
                continue; // Need to try this again with no input
            operator = strOperator.charAt(0);
            operator_is_good = false;
            switch (operator) {
                case 'q':
                case '+':
                case '-':
                case '*':
                case '/':
                    operator_is_good = true;
                    break;
                default:
                    System.out.println("Your operator is bad ... try again:");
                    break;
            }
        } while (!operator_is_good);
        return operator;
    }

    private static int doArithmetic(int operand1, int operand2, char operator) {
        int answer;

        switch (operator) {
            case '+':
                answer = operand1 + operand2;
                break;
            case '-':
                answer = operand1 - operand2;
                break;
            case '*':
                answer = operand1 * operand2;
                break;
            case '/':
                answer = operand1 / operand2;
                break;
            default:
                System.out.println("We shouldn't get here in doArithmentic!!!!");
                answer = -1;
                break;
        }
        return answer;
    }

    private static String getOperandAndValidateThatItIsAValidNumber(Scanner scan) {
        boolean operand_is_bad;
        String input;
        do {
            operand_is_bad = false;
            input = scan.nextLine();
            input = input.trim();
            if (input.length() == 0)
                operand_is_bad = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c < '0' || c > '9') {
                    // Oops, bad digit
                    operand_is_bad = true;
                    System.out.println("Your last input was bad, try again");
                }
            }
        } while (operand_is_bad);
        return input;
    }
} // end of class TooMuchInMain
