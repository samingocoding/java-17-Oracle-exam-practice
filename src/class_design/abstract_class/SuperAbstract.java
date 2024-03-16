package class_design.abstract_class;

public abstract class SuperAbstract {


    /**
     * Rules you need to be aware of abstract classes:
     *
     * 1. Only instance methods can be marked abstract within a class, not variables, constructors, or static methods.
     *
     * 2. An abstract method can only be declared in an abstract class.
     *
     * 3. A non-abstract class that extends an abstract class must implement all inherited abstract methods.
     *
     * 4. Overriding an abstract method follows the existing rules for overriding methods that you
     * learned about earlier in the chapter.
     *
     * */

    public abstract String getSound();
    /**
     * Abstract classes can have non abstract methods
     *  */
    public void bark() { System.out.println(getSound()); }

    public static void main(String[] args) {
          /**
           *            *Rule  Me :
           *            * You cant initialise an abstract class
           *  */
//        SuperAbstract superAb= new SuperAbstract(); Does not compile

    }
}

