package class_design.abstract_class;


public class Fox extends SuperAbstract {
    public String getSound() {
        return "Squeak!";
    }
    /**
     * You cant define an abstract class in a concrete class
     * */
//    public abstract void peck(); Does not compile

    public static void main(String[] args) {
        SuperAbstract w = new Fox();
        w.bark(); // Squeak!
        /**
         * The  Parent abstract clas scan be used for refrence but the method is taken from the concrete class
         * */
    }
}