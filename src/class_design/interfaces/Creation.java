package class_design.interfaces;

public interface Creation {
    //public interface class Creation does not compile interface is not a class

    /**
     * Rules
     *
     * 1.Class can implement an interface,
     * 2.Class cannot extend an interface.
     * 3.An interface can extend another interface
     * 4.An interface cannot implement another interface
     * 5.An Abstract class can implement multiple interfaces
     * 6.An Abstract class cant extend an interface
     * 7.
     *
     * **/



}

abstract class HarborSeal implements Nocturnal, CanFly {
   /**
    * HarborSeal class compiles because it is abstract and not required
    * to implement any of the abstract methods it inherits form (Nocturnal, CanFly)
    * */
}
//abstract class ExtendSeal extends Nocturnal{
//}  DOES NOT COMPILE abstract cant extend a interface
class CommonSeal extends HarborSeal {

    /***
     * CommonSeal class must override all inherited abstract methods. hunt() and Flap()
     * */
    @Override
    public int hunt() {
        return 0;
    }

    @Override
    public void flap() {
    }
}

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {
    /***
     *  Interface can extend another interface using the extends keyword
     * */
}

class Owl implements HasBigEyes{
    /**
     *
     *
     * **/
    public int hunt() { return 5; }
    public void flap() { System.out.println("Flap!"); }
}