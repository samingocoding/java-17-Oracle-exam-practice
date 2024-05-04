package beyond_classes.sealing_classes;

/***
 *
 * A static nested class is a static type defined at the member level
 *
 *
 *
 *
 */

public class StaticNested {
    private static int outerStaticField = 10;
    public String name ="Samuel";

    //the class It can additionally be marked private or protected.
   private static class Ride{
        private static int innerStaticField = 10;
        public int getSpeed(){
            return 1;
        }
        // Access to Outer Class Members: Despite being static, a nested class
        // has access to all static members (fields and methods) of its outer class,
        // including private ones.
        void printOuterStaticField() {
            System.out.println("Outer static field: " + outerStaticField);
            // it can’t access instance variables or methods declared in the outer class.
           // System.out.println("Name is "+ name); No compile
        }

    }

    public void callInnerThings(){
//        The enclosing class can refer to the fields and methods of the static nested class.
        System.out.println("Inner things" + Ride.innerStaticField);
    }

    public static void main(String[] args) {
        /***
         *
         * can be instantiated without an instance of the enclosing class
         *
         * can be acceseed by referencing the outer class
         */
        var ride = new Ride();

         // can be acceseed by referencing the outer class
        var ride2 = new StaticNested.Ride();


    }
}