package methoddesign.staticlearn;

public class TestStatic {
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
}
