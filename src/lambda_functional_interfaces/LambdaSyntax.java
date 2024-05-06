package lambda_functional_interfaces;

import java.util.ArrayList;
import java.util.List;

public class LambdaSyntax {
    /***
     * Java realise on context figuring out what lambda expressions mean
     *
     * Context refers to where and how the lambda is interpreted
     * */

    public static void main(String[] args) {


//        Java tries to map our lambda to the abstract
//        method declaration in the CheckTrait interface
        //boolean test(Animal a);
//        Since that interface’s method takes an Animal, the lambda parameter has to be an Animal.

        List<Animal> animals = new ArrayList<>();


/**
 * These are the same
 * **/
        print(animals, a -> a.canHop());
        //parentheses around the lambda parameters can be omitted only if there is a single parameter

        print(animals, (Animal a) -> {
            return a.canHop(); //semicolon required if there is body and return statement as well
        });

        //They also can be used interchangeable
//        a -> { return a.canHop(); }
//        (Animal a) -> a.canHop()


        // You can have multiple parameters
//        (x, y) -> { return x.startsWith("test"); }  NB : Requires ( brackets on 2 parameters)
//        (String x, String y) -> x.startsWith("test")

//        Lambda can also be empty
//        s -> {} //isavalidlambda
    }

    private static void print(List<Animal> animals, CheckTrait checker) {

    }
}
