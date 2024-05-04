package beyond_classes.nestedclasses;

public class StaticNested {
    /***
     *
     * A static nested class is a static type defined at the member level
     *
     *a static nested class can be instantiated without an instance of the enclosing class
     *
     *
     * Properties
     * 1. The nesting creates a namespace because the enclosing class name must be used to refer to it.
     * 2. It can additionally be marked private or protected.
     * 3. The enclosing class can refer to the fields and methods of the static nested class.
     *
     * */

    private static class StaticClass{
        private int place = 4;
    }

    public static void main(String[] args) {
        var staticNested = new StaticClass(); //Accessing the class requires non initialisation of outer class
        System.out.println(staticNested.place);  //Accessing static fields
    }

}
