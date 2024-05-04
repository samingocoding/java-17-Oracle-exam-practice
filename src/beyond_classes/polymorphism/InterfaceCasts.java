package beyond_classes.polymorphism;

public class InterfaceCasts {
    public static void main(String[] args) {
        /**
         * Instances support multiple inheritance,
         * This limits the compiler to reason about them.
         * While a given class may not implement an interface,
         * it’s possible that some subclass may implement the interface.
         * When holding a refer-ence to a particular class,
         * the compiler doesn’t know which specific subtype it is holding
         * Like here Wolf does not inherit Dog but maybe wolf can have some subtypes who do inherit Dog
         *
         * */
        Wolf wolfy = new Wolf();
        Dog badWolf = (Dog)wolfy;    //Won't compile if wolf was final he wont have
    }
}

interface Canine {}
interface Dog {}
class Wolf implements Canine {}

/**
 * The compiler does not allow a cast from an interface reference to an object reference
 * if the object type cannot possibly implement the interface, such as if the class is marked final
 * */

//final class Wolf implements Canine {}

