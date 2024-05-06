package lambda_functional_interfaces;

public class FunctionalInterfaces {
    /***
     * A functional interface is an interface that contains a single abstract method.
     * single abstract method (SAM)
     * */
}

/**
 * The @FunctionalInterface annotation tells the compiler that you intend for the code to be a functional interface
 * <p>
 * not follow the rules for a functional interface, the compiler will give you an error.
 */

@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
}

@FunctionalInterface
interface Dance { // DOES NOT COMPILE
    void move();

//    void rest(); if uncommented
}

//Determining whether functional interface

interface Dash extends Sprint {
    //Is a FI  as it inherit the sprint() abstract method hence single
}

interface Skip extends Sprint {
    void skip();
    //Is not a FI  as it inherit the sprint() abstract method and also defines skip() hence 2 abstract methods

}

interface Sleep {
    private void snore() {
    }

    default int getZzz() {
        return 1;
    }
    //No abstract method here hence not fi
}

interface Climb {
    void reach();

    //IS FI as it has one abstract method reach();
    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}


/**
 * Adding Object Methods
 * <p>
 * Object has following methods
 * <p>
 * public String toString()
 * public boolean equals(Object)
 * public int hashCode()
 * <p>
 * NB: If a functional interface includes an abstract method with the same signature as a public method found in Object,
 * those methods do not count toward the single abstract method test
 */

//@FunctionalInterface does not compile
interface Soar {
    abstract String toString();
//    Since toString() is a public method implemented in Object,
//    it does not count toward the single abstract method test
}

@FunctionalInterface
interface Dive {
    String toString();

    public boolean equals(Object o);

    public abstract int hashCode();

    public void dive();
//dive() method is the single abstract method,
// while the others are not counted since they are public methods defined in the Object class.
}

interface Hibernate {
    String toString();

    public boolean equals(Hibernate o); // This ommition to   boolean equals(Object o) makes this a abstract method hence FI

    public abstract int hashCode();

    public void rest();
}