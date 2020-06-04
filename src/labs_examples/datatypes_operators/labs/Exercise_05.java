package labs_examples.datatypes_operators.labs;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        if (a || b) {
            System.out.println("a or b is true");
        }

        if (a ^ b) {
            System.out.println("a or b is true");
        }

        boolean c = true;
        boolean d = true;

        if (c & d) {
            System.out.println("c and d are both true");
        }

        if (c && d) {
            System.out.println("c and d are both true");
        }

        if (a != b) {
            System.out.println("a does not equal b");
        }
    }

}

