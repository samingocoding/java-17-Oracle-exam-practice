package lambda_functional_interfaces;

public class MethodReferences {
    /**
     * A method reference lets us remove that redundancy
     * <p>
     * There are four formats for method references:
     * 1. static methods
     * 2. Instance methods on a particular object
     * 3. Instance methods on a parameter to be determined at runtime
     * 4. Constructors
     */

    public static void main(String[] args) {
        /**
         *  1. static methods
         *
         * */
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
        System.out.println(methodRef.round(100.1)); // 100


        /**
         * Instance Methods on a Particular Object
         *
         * */
        var str = "Zoo";
        StringStart methodRefInst = str::startsWith;
        StringStart lambdaInst = s -> str.startsWith(s);
        System.out.print(methodRefInst.beginningCheck(str)); // true
        /**
         * Instance Methods on a Parameter
         *
         * */
        StringParameterChecker methodRefParam = String::isEmpty;
        StringParameterChecker lambdaParam = s -> s.isEmpty();
        System.out.println(methodRefParam.check("Zoo")); // false

        /**
         * Calling Constructors
         *
         * A constructor reference is a special type of method reference
         * that uses new instead of a method and instantiates an object
         * */
        EmptyStringCreator methodRefConst = String::new;
         EmptyStringCreator lambdaConst = () -> new String();

         var myString = methodRefConst.create();
         System.out.println(myString.equals("Snake")); // false


    }
}

interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
// Exercise patience (omitted)
        trainer.speak(name);
    }

    public static void main(String[] args) {

        teacher("Samuel", System.out::println);
        teacher("Mahembe", s -> System.out.println(s));

    }
}

class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s); //placed implementation here
        //REMoving redudancy with method reference
        LearnToSpeak learner2 = System.out::println;
        //The :: operator tells Java to call the println() method later.
        DuckHelper.teacher(sound, learner2);
    }
}


/***
 * Static Methods
 * */

interface Converter {
    long round(double num);
}

/**
 * Instance Methods on a Particular Object
 */
interface StringStart {
    boolean beginningCheck(String prefix);
}

/**
 * Instance Methods on a Parameter
 */
interface StringParameterChecker {
    boolean check(String text);
}


/**
 * Calling Constructors
 */
interface EmptyStringCreator { String create();
}