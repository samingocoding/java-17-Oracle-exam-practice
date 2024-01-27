package stringmanipulation;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        var block = """
                    a
                     b
                    c""";
        var concat = " a\n"
                +"  b\n"
                +" c";
        System.out.println(block.length()); //6
        System.out.println(concat.length()); //9
        System.out.println(block.indent(1).length()); //10
        /**
         Ident method adds blank spaces n on start of text
         Also add a new line (blank) at the end (count as blank)
         on a text block next line count 1 line (blank)
         ***/
        System.out.println(concat.indent(-1).length());
        /**
         Ident method with negative n remove n spaces at start (tries)
         ***/
        System.out.println(concat.indent(-4).length());
        System.out.println(concat.stripIndent().length());
        /**
         Strip Ident method removes all incidental white spaces
         ***/

        System.out.println("Trying my Own on block ");
        var block2 = """
                    a      
                      b      
                     c""";
        System.out.println(block2.length());//8
        System.out.println(block2.stripIndent().length()); // 8
        System.out.println("Trying my Own on concat");
        var concat2 = " a\n"
                     +"  b\n"
                     +" c";
        System.out.println(concat2.length());//10
        /**
         * Reminder the length method does not add line at end as the ident hence read correct
         * **/
        System.out.println(concat2.stripIndent().length()); //7
        /**
         * Reminder the stripIdent method does not add as the line at end hence read correct
         * **/

        System.out.println("Translating Escapes +++++++++++++");
        var str = "1\\t2";
        var str2 = "1\t4";
        System.out.println(str); // 1\t2
        /**
         * The \\t the first makes the  character to be escaped hence \t is printed
         * */
        System.out.println(str2); // 1    2
        System.out.println(str.translateEscapes()); // 1 2
        System.out.println(str2.translateEscapes()); // 1 2


        System.out.println("!!!!!!!!!!!!FORMATTING NUMBERS !!!!!!!!!!!!!!!!!!");
        var pi = 893.14159265359;
        System.out.format("[%f]",pi);// [3.141593]
        System.out.format("[%016.8f]",pi); // [ 3.14159265]

        var x = "Hello World";
        var z = " Hello     World".trim();
        //trim method remove edges spaces
        System.out.println(z);
        System.out.println(x.equals(z));

        var name = "a";
        var builder = new StringBuilder("a");

        //compiler notifies early that you cant use == on diferent references
        // System.out.println(name == builder);

        var birds = new String[6];
        System.out.println(birds.length);

        String trying = "er";
        trying +=false;
        System.out.println(trying);

        if (trying == "erfalse".intern()) System.out.println("took from string pool");
        if (trying == "erfalse") System.out.println("string not from string pool");

        String[] s3 = { "Camel"};
        String[] s4 = { "Samel"};
        System.out.println(Arrays.mismatch(s3,s4));


    }
}
