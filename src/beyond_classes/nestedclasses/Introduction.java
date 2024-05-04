package beyond_classes.nestedclasses;


/***
 * A nested class is a class that is defined within another class. A nested class can come in one of four flavors.
 *
 * Inner class: A non-static type defined at the member level of a class
 * Static nested class: A static type defined at the member level of a class
 * Local class: A class defined within a method body
 * Anonymous class: A special case of a local class that does not have a name*/
public class Introduction {
    private String greeting = "Hie outside"; // Outer class instance variable

    /**
     * An inner class, also called a member inner class,
     * is a non-static type defined at the member level of a class
     * (the same level as the methods, instance variables, and constructors)
     * <p>
     * Properties :
     * Can be declared public, protected, package, or private
     * Can extend a class and implement interfaces
     * Can be marked abstract or final
     * Can access members of the outer class, including private members
     */
    protected class InnerClass { // Inner class declaration
        public int repeat = 3;
        private String greeting = "Hie inside";

        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }

        public static void greet(String message) {
            System.out.println(message);
        }

        public  void main(String[] args) {
            System.out.println(greeting); //Accessing inside variable
            System.out.println(this.greeting); //Accessing inside variable
            System.out.println(Introduction.this.greeting); //Accessing outside variable
        }
    }

    void returnInner(){
        var inner = new InnerClass();
    }

    public static void main(String[] args) {
        //Instantiating an Instance of an Inner Class
        //nb  Since an inner class is not static, it has to be called using an instance of the outer class
        var intro = new Introduction();
        InnerClass innerClass = intro.new InnerClass(); // Accessing inner class
        innerClass.enter();


    }


}
