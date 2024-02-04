package methoddesign.staticlearn;

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
    }

    private static void newNumber(int num) {
        num =9;
    }
    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}
