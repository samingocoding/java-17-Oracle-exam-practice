package lambda_functional_interfaces;

public class MethodReferences {
    /**
     *
     * A method reference lets us remove that redundancy
     *
     * There are four formats for method references:
     * 1. static methods
     * 2. Instance methods on a particular object
     * 3. Instance methods on a parameter to be determined at runtime
     * 4. Constructors
     * */
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
        teacher("Mahembe", s-> System.out.println(s));

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