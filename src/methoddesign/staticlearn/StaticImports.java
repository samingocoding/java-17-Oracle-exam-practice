package methoddesign.staticlearn;
/**
 * static imports help in reducing code to specify where you are calling the method or variabkle
 * the right order is import static then path.method/varible
 * */
import java.util.List;
//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE
/**
 * You can import all static methods and members using wild cards also
 * */

//import static java.util.Arrays.asList;

public class StaticImports {
    public static void main(String[] args) {
        /**
         * We call the static import b the name of the variabl;e or method
         * */
        List<String> samNames= asList("samuel","samingo");

    }
}
