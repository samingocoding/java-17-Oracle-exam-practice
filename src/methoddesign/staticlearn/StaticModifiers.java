package methoddesign.staticlearn;

public class StaticModifiers {
    private static final int NUMBER_STATIC;
    private static final int NUMBER_STATIC2;
    private static final int NUMBER_STATIC3 =9;
    private int myNumber;

    /**
     * Static initializer runs when class is initialised or called
     * */
    static {
        System.out.println("I am the one who starts STatic initialser block");
        System.out.println("I dont run again when an instance is initialized ");
        NUMBER_STATIC=4;
        NUMBER_STATIC2=9;
        /**
         * You can only initialise a constant variable once
         * */
       // NUMBER_STATIC3 =10; //DOES not compile
        /**
         * You cant assign an instance method in a static initialer block
         * */
        // myNumber =4; //DOESNOT compile
    }

    /**
     *Instance Initializer block
     * */
    {
        /**
         * Initilizing a static variable in an instance initializer bock
         * does not work the main varible won't be initialized
         * */
//        NUMBER_STATIC2=4;  // Does not Compiles but do
        System.out.println("I am the one who starts second Instance initialser block");
        System.out.println("I run only when an instance is initialized ");
        myNumber= 4;
    }
    public static void main(String[] args) {
        /**
         * You cant assign a final variable constant
         * */
        //NUMBER_STATIC = 5; // DOESNT compile
        System.out.println(NUMBER_STATIC2);
        StaticModifiers staticModifiers = new StaticModifiers();
        StaticModifiers staticModifiers2 = new StaticModifiers();
        System.out.println(staticModifiers2.myNumber);
    }
}
