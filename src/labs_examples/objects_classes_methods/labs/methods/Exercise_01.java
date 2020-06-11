package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("multiply " + Multiply(2,3));
        System.out.println("divide " + Divide(14, 7));
        Joke();
        System.out.println("30 years in seconds = " + YearInSeconds(30));
        System.out.println("you passed in " + HowManyArgs(1, 2, 3, 4, 5) + " numbers");


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int Multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int Divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void Joke(){
        System.out.println("Why did the banana go to the doctor?");
        System.out.println("Because it wasn’t peeling well.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static long YearInSeconds(int years){
        return years * 31556952;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int HowManyArgs(int... numbers) {
        int count = 0;

        for(int number : numbers) {
            count++;
        }

        return count;
    }





}
