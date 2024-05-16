package lambda_functional_interfaces;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PrimitivesFunctionalInterfaces {
    /***
     *
     * They are for the double, int, and long types.
     * There is one exception, which is BooleanSupplier
     */

    public static void main(String[] args) {
        /**
         * Functional Interfaces for boolean
         *
         * @FunctionalInterface
         * public interface BooleanSupplier {
         * boolean getAsBoolean(); }
         *
         *
         * */

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;

        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());

        /**
         * `For other refer for java package classes in
         *
         java.util.function
         * */

        /**
         *Listing Parameters
         * In the exam they will make you identify the type of parameter
         * **/

        Predicate<String> p = x -> true;
        Predicate<String> p1 = (var x) -> true;
        Predicate<String> p2 = (String x) -> true;
// A lambda infers the types from the sur- rounding context  hence parameter is string Predicate<String>


        /**
         * Using Local Variables Inside a Lambda Body
         *
         *
         * Java doesn’t let you create a local variable with the same name as one already declared in that scope
         * **/

//        (a, b) -> { int a = 0; return 5; } // DOES NOT COMPILE because you redeclared a


    }

    /**
     * Since lambda parameters are just like method parameters, you can add modifiers to them
     */
    public void counts(List<Integer> list) {
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
//Invalid and invalid Parameter List Formats
//        (var x, y) -> "Hello";  // no compile should have var or remove
//        (var x, Integer y) -> true; // inconsistency use of var
//        (String x, var y, Integer z) -> true 8: (Integer x, y) -> "goodbye";  // obviouse

    }

    public void variables(int a) {
        int b = 1;
//
//        Predicate<Integer> p1 = a -> {  a is being redeclared
//            int b = 0;  b is already defined
//            int c = 0;
//            return b == c;
//        }  here a semicolon is required for closing p1


        //REplace with method references if block is big

    }
}


class Crow {

    /***
     * Referencing Variables from the Lambda Body
     *
     *  lambda can access an instance variable, method parameter, or local variable under certain conditions
     *
     * 1. lambdas cannot access are variables that are not final or effectively final (local variables and method parameter)
     * 2. Allows static , instance and lambda parameters even when they are not effective final
     **/
    private String color; //instance variable

    public void caw(String name) {
        String volume = "loudly";
        name = "Caty";  //not effectively final here method param
        color = "black";  //instance no pressure
//        Consumer<String> consumer = s -> System.out.println(name + " says "
//                + volume + " that she is " + color);
        volume = "softly"; //not effectively final here local variable


    }

    public void setColor(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);

    }
}
