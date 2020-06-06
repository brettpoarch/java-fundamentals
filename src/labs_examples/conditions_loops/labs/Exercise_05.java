package labs_examples.conditions_loops.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers");
        System.out.print("Input the larger number: ");
        float largerNum = scanner.nextInt();
        System.out.print("Input the smaller number: ");
        float smallNum = scanner.nextInt();
        float count = largerNum - smallNum;
        float sum = 0;
        float average = 0;

        for (float i = smallNum; i <= largerNum; i++) {
            sum += i;
        }

        average = sum / count;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
