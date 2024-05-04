package beyond_classes.polymorphism;


/**
 * polymorphism, the property of an object to take on many different forms
 * <p>
 * Java object may be accessed using:
 * <p>
 * 1. A reference with the same type as the object
 * 2. A reference that is a superclass of the object
 * 3. A reference that defines an interface the object implements or inherits
 */
public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        /***
         * NB:  one object, Lemur, is created.
         * Polymorphism enables an instance of Lemur to be reassigned or passed to a method using one of its supertypes,
         * such as Primate or HasTail.
         *
         * Once the object has been assigned to a new reference type, only the methods and vari- ables available
         * to that reference type are callable on the object without an explicit cast.
         *
         * */

        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
       // System.out.println(hasTail.age); // DOES NOT COMPILE coz  HasTail has no age

        Primate primate = lemur;
        System.out.println(primate.hasHair());
    //    System.out.println(primate.isTailStriped()); // DOES NOT COMPILE cause Primate has no isTailStriped


        /**
         *OBJECT AND REFERENCE
         *
         *
         * two rules:
         * 1. The type of the object determines which properties exist within the object in memory.
         * 2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
         * */
        Lemur lemurReference = new Lemur(); // Object is Lemur in memory
        Object lemurAsObject = lemur; // The type of reference is Object hence


        /***
         *
         * Casting Objects
         *
         *We can reclaim those references by casting the object back to the specific subclass it came from
         *
         * We summarize these concepts into a set of rules for you to memorize for the exam:
         * 1. Casting a reference from a subtype to a supertype doesn’t require an explicit cast.
         * 2. Casting a reference from a supertype to a subtype requires an explicit cast.
         * 3. At runtime, an invalid cast of a reference to an incompatible type results in a ClassCastException being thrown.
         * 4. The compiler disallows casts to unrelated types.
         * */

        Lemur lemurCast = new Lemur();  //SubClass type Lemur
        Primate primateImplicit = lemur; // Implicit Cast to supertype () Primate
        Lemur lemur2Explicit = (Lemur)primate; // Explicit Cast to subtype From super to subtype
       /// Lemur lemur3 = primate; // DOES NOT COMPILE (missing cast) from super to Sub type

        /***
         *
         * Disallowed Casts
         *
         * While they both extend Object implicitly,
         * they are considered unrelated types since one cannot be a subtype of the other.
         * */
        Lemur disallowed = new Lemur();
       // Bird  bird= (Bird) disallowed; // DOES NOT COMPILE
    }
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

class Bird {}

