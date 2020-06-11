package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {

        //Excercise 1)
        System.out.println("Excercise 1:");
        System.out.println("add method 1 = " + sum(3, 4));
        System.out.println("add method 2(overload) = " + sum(3, 4, 7));
        System.out.println();

        //Excercise 2)
        System.out.println("Excercise 2:");
        int num = 2;
        int newValue = passByValue(num);
        System.out.println("passByValue intial value = " + num + " returned value = " + newValue);
        System.out.println();

        Person me = new Person("Brett");
        System.out.println("Pass by reference intial name value = " + me.name);
        passByReference(me);
        System.out.println("Pass by reference new name value = " + me.name);
        System.out.println();

        //Excercise 3
        System.out.println("Excercise 3:");
        int largest = largestOfNums(2,100, 4,6);
        System.out.println(largest);
        System.out.println();

        //Excercise 4
        System.out.println("Excercise 4:");
        int howManyConsonants = countAllConsonants("Hello my name is Brett");
        System.out.println(howManyConsonants);

        //Excercise 5
        System.out.println("Excercise 5:");
        printAsciiArt();
        System.out.println();

        //Excercise 6
        System.out.println("Excercise 6");
        boolean prime = isNumberPrime(45);
        System.out.println(prime);
        System.out.println();

        //Excercise 7
        System.out.println("Excercise 7");
        int[] mixedArray = {100, 25, 375, 49};
        int[] largestAndSmallest = largestAndSmallest(mixedArray);
        for (int i = 0; i < largestAndSmallest.length; i++){
            System.out.print(largestAndSmallest[i] + " ");
        }
        System.out.println();

        //Excercise 8
        System.out.println("Excercise 8");
        ArrayList<Integer> allNumbers = numbersThatDivide(21, 3, 7);
        for (int number : allNumbers) {
            System.out.print(number + " ");
        }

        //Excercise 9
        System.out.println("Excercise 9");
        int[] arrayToBeReversed = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] reversedArray = reverse(arrayToBeReversed);
        for (int i = 0; i < reversedArray.length; i++){
            System.out.print(reversedArray[i] + " ");
        }

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int passByValue(int a) {
        a = 7;
        return a;
    }

    public static void passByReference(Person obj) {
        obj.name = "Regina";
    }

    public static int largestOfNums(int a, int b, int c, int d){
        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }
        return largest;
    }

    public static int countAllConsonants(String word){
        String vowels = "aeiou ";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.toLowerCase().charAt(i)) < 0 ) {
                count++;
            }
        }
        return count;
    }

    public static void printAsciiArt() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }
        }
    }

    public static boolean isNumberPrime(int isPrime) {
        if (isPrime <= 1) {
            return false;
        }

        for (int i = 2; i < isPrime; i++) {
            if (isPrime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] largestAndSmallest(int[] numbers) {
        int[] newArray = new int[2];

        newArray[0] = numbers[0];
        newArray[1] = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > newArray[0] || numbers[i] < newArray[1]) {
                if (numbers[i] > newArray[0]) {
                    newArray[0] = numbers[i];
                } else {
                    newArray[1] = numbers[i];
                }
            }
        }
        return newArray;
    }

    public static ArrayList<Integer> numbersThatDivide(int maxNum, int div1, int div2){
        ArrayList<Integer> arrayToReturn = new ArrayList<Integer>();

        for (int i = 1; i <= maxNum; i++){
            if (i % div1 == 0 && i % div2 == 0){
                arrayToReturn.add(i);
            }
        }

        return arrayToReturn;
    }

    public static int[] reverse(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }

        return array;
    }
}

class Person{
    String name;

    public Person(String name){
         this.name = name;
     }
}
