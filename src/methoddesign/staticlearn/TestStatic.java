package methoddesign.staticlearn;

public class TestStatic {
    private String instanceVariable = "Samuel";
    private static String staticVariable = "Mahembe";

    private static int total ;
    private  int number ;
    /**
     * You cant access a instance variable on a static variable
     * */
//    private static int avarage = total/number ; // Does not compile


    public static void main(String[] args) {
        MainStatic mainStatic= new MainStatic();
        System.out.println(mainStatic.testStatic);
        mainStatic=null;
        /**
         * You can use an instance of the object to call a static method.
         * The compiler checks for the type of the reference and uses that instead of the object
         * No null pointer s
         * **/
        System.out.println(mainStatic.testStatic);


    }

    public static void sampleStatic(){
        /**
         * A static method cant access an instance method
         * because instance methods do require an object.
         * */
//        sampleInstance(); // DOESNT compile
        TestStatic testStatic = new TestStatic();
        testStatic.sampleInstance();
        System.out.println(staticVariable);
        /**
         * Non-static field 'instanceVariable' cannot be referenced from a static context
         * You need to instantiate
         * */
//        System.out.println(instanceVariable); //DOESNT COMPILE
        System.out.println(testStatic.instanceVariable);
    }
    public void sampleInstance(){
        /**
         * An instance method can call a static method and static variable
         * because static methods don’t require an object to use. */
        sampleStatic();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }
}
