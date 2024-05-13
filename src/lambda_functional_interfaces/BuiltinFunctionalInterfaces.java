package lambda_functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.*;

public class BuiltinFunctionalInterfaces {

    public static void main(String[] args) {

        /**
         * Implementing Supplier
         * <p>
         * A Supplier is used when you want to generate or supply values without taking any input
         *
         * @FunctionalInterface public interface Supplier<T> {
         * T get(); }
         */

        Supplier<LocalDate> s1 = LocalDate::now;
//        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        System.out.println(d1); //2024-05-10

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1); // []
        System.out.println(s3); // lambda_functional_interfaces.BuiltinFunctionalInterfaces$$Lambda$16/0x000000b001001428@2ff4acd0
        //Our test class is named BuiltIns,
        // and it is in a package that we created named functionalinterface.
        // Then comes $$, which means that the class doesn’t exist in a class file on the file system.
        // It exists only in memory

        /**
         *
         * Implementing Consumer and BiConsumer
         *
         *  Use a Consumer when you want to do something with a parameter but not return anything
         *  @FunctionalInterface
         * public interface Consumer<T> {
         * void accept(T t);
         * // omitted default method }
         *
         * @FunctionalInterface
         * public interface BiConsumer<T, U> {
         * void accept(T t, U u);
         * // omitted default method }
         *
         *
        * */

        Consumer<String> c1 = System.out::println;
        //x -> System.out.println(x);

        // BiConsumer is called with two parameters. They don’t have to be the same type
        //Bi means 2
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        //(k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        System.out.println(map);


        /**
         * Implementing Predicate and BiPredicate
         *
         * Predicate is often used when filtering or matching
         * BiPredicate is just like a Predicate, except that it takes two parameters instead of one
         *
         * @FunctionalInterface
         * public interface Predicate<T> {
         * boolean test(T t);
         * // omitted default and static methods }
         *
         * @FunctionalInterface
         * public interface BiPredicate<T, U> {
         * boolean test(T t, U u);
         * // omitted default methods }
         * */

        Predicate<String> p1 = String::isEmpty;
        //s -> s.isEmpty();
        System.out.println(p1.test("")); // true

        BiPredicate<String, String> b2 = String::startsWith;
        //(string, prefix) -> string.startsWith(prefix);
        System.out.println(b2.test("chicken","chick"));

        /**
         * Implementing Function and BiFunction
         *
         * Function is responsible for turning one parameter into a value of a potentially different type and returning it
         * BiFunction is responsible for turning two parameters into a value and returning it
         *
         * @FunctionalInterface
         * public interface Function<T, R> {
         * R apply(T t);
         * // omitted default and static methods }
         *
         * @FunctionalInterface
         * public interface BiFunction<T, U, R> {
         * R apply(T t, U u);
         * // omitted default method }
         *
         * */

        Function<String, Integer> f1 = String::length;
        // x -> x.length();
        System.out.println(f1.apply("cluck")); // 5

        BiFunction<String, String, String> b4 = String::concat;
        //(string, toAdd) -> string.concat(toAdd);
        System.out.println(b4.apply("Sam","uel"));

        /**
         * Implementing UnaryOperator and BinaryOperator
         *
         * UnaryOperator and BinaryOperator are special cases of a Function.
         * They require all type parameters to be the same type.
         * A UnaryOperator transforms its value into one of the same type
         *
         * NB : UnaryOperator extends Function.
         * A BinaryOperator extends a BiFunction merging two values into one of the same type
         *
         * @FunctionalInterface
         * public interface UnaryOperator<T> extends Function<T, T> {
         * // omitted static method }
         * T apply(T t); // UnaryOperator
         * @FunctionalInterface
         * public interface BinaryOperator<T> extends BiFunction<T, T, T> {
         * // omitted static methods }
         *  T apply(T t1, T t2); // BinaryOperator
         * */
        UnaryOperator<String> u1 = String::toUpperCase;
        //x -> x.toUpperCase();
        System.out.println(u1.apply("chirp")); // CHIRP
        //(string, toAdd) -> string.concat(toAdd);

        BinaryOperator<String> b7 = String::concat;
        System.out.println(b7.apply("Mah","embe"));
    }


}


