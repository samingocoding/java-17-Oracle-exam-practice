package class_design.abstract_class;



/**
 * Correct order of defining abstract claass
 * 1.Abstract modifier can come before and after access modifier
 *
 * 2.Abstract modifier cant come  after class keyword
 * */

// public  class abstract AbstractOrder {
//} DOES not compile
abstract public class AbstractOrder {

    /**
     * Correct order of defining abstract method
     * 1.Abstract modifier can come before and after access modifier
     *
     * 2.Abstract modifier cant come  after return type
     * */
    abstract public int claw();

//    public int abstract howl(); DOES not compile

}
