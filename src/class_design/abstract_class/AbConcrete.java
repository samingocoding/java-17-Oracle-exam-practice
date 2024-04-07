package class_design.abstract_class;

public abstract class AbConcrete {

    abstract void showHorn();

    abstract void eatLeaf();
    abstract void getName();

    public AbConcrete() {
        System.out.println("Initialised Abstract Parent Class");
    }
}

abstract class Rhino extends AbConcrete {

    /**
     * Abstract classes can implement parent abstract class
     *and does nnot force child to implement the same*/
    void showHorn() {
    } // Inherited from Mammal

    public Rhino() {
        //Compiler puts super()
        System.out.println("Initialsed Child Abstract Class");
    }
}

/**
 * Concrete class is a non abstract class
 *
 * Rule of extending abstract class
 * 1. If extend should implement all abstract methods defined in the parent and not defined in parrent
 *
 * 2. Not forced to implemented already implemented methdos by parent from super parent abstract class
 *
 * */


class BlackRhino extends Rhino {
    //2. Not forced to implemented already implemented


    void eatLeaf() {
    } // Inherited from Mammal

    //Forced to implement all non parent abstract class methods
    @Override
    void getName() {

    }

    public static void main(String[] args) {
        /**
         * abstract classes are initialized with constructors in the same way as non-abstract classes
         * */
        new BlackRhino();
    }


}
