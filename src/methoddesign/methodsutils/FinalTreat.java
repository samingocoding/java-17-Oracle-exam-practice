package methoddesign.methodsutils;

public class FinalTreat {
    public static void main(String[] args) {
        finalMethod();
        /**
         * Local variable can be set to final */
        final int monkey = 0;

    }
    /**
     * A method can  have an optional specifier final
     * this states that the method cant be overridden
     * also it can be called by subclass*/
    static final void finalMethod(){
        System.out.println("final method");

    }

}
