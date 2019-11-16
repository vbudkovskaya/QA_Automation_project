package homework1;

import java.util.Scanner;

/**
 * The Calculator class provides the results of addition, subtraction,
 * multiplication and division of two given numbers
 */

public class Calculator {

    public static void main(String Args[]) {

        // Ask the user to enter the first number
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        //Ask the user to enter the second number
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        /*
        This block of code calculates and prints the output of addition, subtraction,
        multiplication, division of the two numbers that were entered by the user
         */
        // Calculate and print sum of two numbers
        if (num1 == num2) {
            int sumDouble = Plus.calculateSumDouble(num1, num2);
            System.out.println("The result of addition when numbers are equal is " + sumDouble);
        } else {
            int sum = Plus.calculateSum(num1, num2);
            System.out.println("The result of addition is " + sum);
        }
        // Calculate and print subtraction of two numbers
        int subtraction = Minus.subtractNumber(num1, num2);
        System.out.println("The result of subtraction is " + subtraction);

        // Calculate and print multiplication of two numbers
        int multiplication = Multiply.multiplyNumbers(num1, num2);
        System.out.println("The result of multiplication is " + multiplication);

        // Calculate and print the division of two numbers
        int division = Divide.divideNumbers(num1, num2);
        System.out.println("The result of division is " + division);
        System.out.println("The result of division is ");
    }
}








