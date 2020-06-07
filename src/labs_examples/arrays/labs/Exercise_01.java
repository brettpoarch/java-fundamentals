package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int[] userNumbers = new int[10];
        int sum = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: " );
            userNumbers[i] = scanner.nextInt();
            sum += userNumbers[i];
        }


        System.out.println("The sum of the numbers entered is: " + sum);
        System.out.println("The average of the numbers entered is: " + sum / userNumbers.length);
    }

}