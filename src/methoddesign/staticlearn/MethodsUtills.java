package methoddesign.staticlearn;

import java.util.List;

public class MethodsUtills {
    public static void main(String[] args) {
        int num = 4;
        /***Pass by Value
         * this does not change the main primitive value
         *after being assigned **/
        newNumber(num);
        System.out.println(num);

        /**Pass by Object
        this will change the main object if the object is mutable
         **/
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name);

        /**Auto boxing =>  primitive to Wrapper class
         * Unboxing => wrapper class to primitive */

        Integer e = Integer.valueOf(9);
        long ears = e; // Unboxing implicit cast
        long sam = 4;
        /**There is need for explicit cast java won't implicitly cast */
//        Long bigValue = e;


    }

    private static void newNumber(int num) {
        num =9;
    }
    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }

    /**
     * Method overloading  having same methods with same name but different method signature
     * */
    public void fly(int numMiles) {
        System.out.println("int"); }
    public void fly(short numFeet) { System.out.println("short");
    }
    /**
     * Method overloading should not have the same parameter list with same variable type in same order*/
//    public int fly(int numMiles) { return 1; }
//    public static void fly(int numMiles) {}
//    public void fly(int numKilometers) {}


    /**
     * Reference types
     * JAVA LOOKS AT THE MOST SPECIFIC method to use
     * Same as primitives it does the same
     * */

    public void fly(String s) {
        System.out.print("string"); }
    public void fly(Object o) { System.out.print("object");
    }
    public static void fly(List<Integer> i) { System.out.print("I");
    }
    public static void fly(CharSequence c) {
        System.out.print("C"); }


    /**
     * For arrays and vargs
     * Java treate=s them as same  hence any same method signature declared in one class cause an error
     * **/
    public void fly(int[] lengths) {}
//    public void fly(int... lengths) {}  //DOES not compile

    /**
     * But on calling the
     * fly(new int[]{1,2,3})
     * this one use both vargs and array
     *
     * fly(1,2,3)
     * this one uses vargs only
     *
     * */

}
