package beyond_classes.nestedclasses;

public class LocalClass {
    /**
     * A local class is a nested class defined within a method
     * */
    private int length = 5;
    public void calculate() {
        final int width = 20;
        int height = 2;
        class Calculator {
            public void multiply() {
                /**
                 * NB local variable references are allowed if they are final or effectively final
                 * eg length does not change
                 * */
                System.out.print(length * width);
                //System.out.print(length * width*height);//// DOES NOT COMPILE height is not final
            }
        }
        height =4;  // this makes height not effective final

        var calculator = new Calculator();
        calculator.multiply();
    }// class’s scope ends here


    public static void main(String[] args) {
        var localClass = new LocalClass();
        localClass.calculate();

    }
}
