package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate valyue, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        char character = 'a';
        byte byteNum = 1;
        short shortNum = 32000;
        int integerNum = 2000000;
        long longNum = 9000000000L;
        float floatNum = 9324.43F;
        double doubleNum = 232.87;
        boolean truthy = true;

        System.out.println("character = "  + character);
        System.out.println("byteNum = " + byteNum);
        System.out.println("shortNum = " + shortNum);
        System.out.println("integerNum = " + integerNum);
        System.out.println("longNum = " + longNum);
        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("truthy = " + truthy);

    }

}