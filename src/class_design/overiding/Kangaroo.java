package class_design.overiding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Rules {
    public double getAverageWeight() {
        return 50; }
    private int getNumberOfHumps() {
        return 1;
    }
    protected void sleep() throws IOException {}
    protected void hide() {}
    protected void exitShell() throws FileNotFoundException {}

    protected CharSequence getName() {
        return "rhino"; }
    protected String getColor() { return "grey, black, or white";
    }

    private String getSurname(){
      return "Surname";
    }
}
public class Kangaroo extends Rules {

    /**Rules of Overidding
     *
     * Rule #1 Method Signature
     * If two methods have the same name but different signatures, the methods are overloaded, not overridden
     * **/
    public double getAverageWeight() {
        //Use super to refrence parent class method
        //if parent has no then cylic loop eg (return getAverageWeight() + 20;)
        return super.getAverageWeight() + 20;
    }
    //OVER LOAD
    public double getAverageWeight(int age) {
        //Use super to refrence parent class method
        //if parent has no then cylic loop eg (return getAverageWeight() + 20;)
        return super.getAverageWeight() + 20;
    }

    /**Rules of Overidding
     *
     * Rule #2  Access Modifiers
     * access modifiers that are as accessible or more accessible than the version in the inherited method.
     * cant assign private it restricts
     * **/



//    private int getNumberOfHumps() {
//        return 1;
//    }

         int getNumberOfHumps() {
        return 1;
    }


    /**Rules of Overidding
     *
     * Rule #3: Checked Exceptions
     * The third rule says that overriding a method cannot declare new checked
     * exceptions or checked exceptions broader than the inherited method
     * **/

    public void sleep() throws FileNotFoundException {} //Compiles because it is narrower than the exception declared in the parent class.
//    public void hide() throws FileNotFoundException {} // DOES NOT COMPILE  because new exception from parent method
//    public void exitShell() throws IOException {} // DOES NOT COMPILE because the checked exception is broad than that of parrent

    /**Rules of Overidding
     *
     * Rule #4: Covariant Return Types
     * The overriding method must use a return type that is covariant with
     * the return type of the inherited method.
     * **/
    @Override  // You can use or not use compiler auto pick that its overiden
    public String getName() {
        return "javan rhino"; }
//    public CharSequence getColor() {  return "grey"; }
//
// DOES NOT COMPILE because String implements the
//    CharSequence interface, making String a subtype of CharSequence
    //Hence CharSequence is not a subtype of String
//    }


    //Overriding private members
    /**
     * NB You cant overide private methods
     * **/
//    @Override
//    private String getSurname(){
//        return "Sam";
//    }


    public static void main(String[] args) {
        System.out.println(new Rules().getAverageWeight()); // 50.0
        System.out.println(new Kangaroo().getAverageWeight()); // 70.0

    }



}