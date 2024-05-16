package lambda_functional_interfaces;

import java.util.ArrayList;
import java.util.List;

public class LambdaIntro {
    /***
     * A lambda expression is a block of code that gets passed around
     *
     * */

    public static void main(String[] args) {
// list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
// pass class that does check
        /**
         * We can replace the call to another class by using a lambda expression
         *
         * We call this deffered execution
         * Deferred execution means that code is specified now but will run later.
         * In this case, “later” is inside the print() method body, as opposed to when
         * it is passed to the method.
         * */
      //  print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
// General check
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}

//EXAMPLE
//For example, we want to print all animals that can hop
//Define an interface to generalize this concept and support a large variety of checks

record Animal(String species, boolean canHop, boolean canSwim) {
}

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}