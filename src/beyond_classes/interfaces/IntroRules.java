package beyond_classes.interfaces;

//public abstract interface intor
public interface IntroRules {
    /***
     * Interface Rules
     *
     * Interfaces are implicitly abstract.
     * Interface variables are implicitly public, static, and final.
     * Interface methods without a body are implicitly abstract.
     * Interface methods without the private modifier are implicitly public.
     */
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;

    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();

    //converted to ... by compiler
//    public static final int MAX_HEIGHT = 10;
//    public final static boolean UNDERWATER = true;
//    public abstract void fly(int speed);
//    public abstract void takeoff();
//    public abstract double dive();

    /***
     *
     * Interface modifiers should be either public or package access
     *
     * private int count = 4; // DOES NOT COMPILE
     * protected void step(); // DOES NOT COMPILE
     */


}

/***
 * Java supports inheriting two abstract methods that have compatible method declarations.*
 *
 */


 interface Herbivore {
    public void eatPlants();
}

 interface Omnivore {
    public void eatPlants();

    // incompatible declaration
     //public int eatPlants();
}

class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {

    }
}
