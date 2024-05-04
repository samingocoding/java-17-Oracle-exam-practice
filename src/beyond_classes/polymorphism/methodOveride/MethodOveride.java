package beyond_classes.polymorphism.methodOveride;


class Penguin {
    public int getHeight() {
        return 3;
    }

    public void printInfo1() {
        System.out.print(this.getHeight());
    }
}

public class MethodOveride extends Penguin {
    /**
     * polymorphism states that when you override a method,
     * you replace all calls to it, even those defined in the parent class
     */


    public int getHeight() {
        return 8;
    }

    public static void main(String[] fish) {
        new MethodOveride().printInfo1(); //Prints 8 as :
        /**
         * getHeight() method is overridden in the subclass,
         * meaning all calls to it are replaced at runtime
         *
         * Polymorphism’s ability to replace methods at runtime via overriding
         * is one of the most important properties of Java
         * */

        new MethodOveride().printInfo(); //Prints 3 as :

    }

    //To call super method getHeight() use super here
    public void printInfo() {
        System.out.print(super.getHeight()); //get from penguin class
    }

}
