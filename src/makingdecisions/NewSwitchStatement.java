package makingdecisions;

public class NewSwitchStatement {
    public static void main(String[] args) {
        int samValue = 3;
        //can run on empty switch
        switch (samValue){}
        //only accepts following
        // int and Integer byte and Byte short and Short char and Character String
        //enum values
        //var (if the type resolves to one of the preceding types)
        //

        switch (samValue){
            case 2:
                System.out.println("Number is 2");
            case 3:
            case 4:
                System.out.println("Number is 4");
               // break;
            case 7:
                System.out.println("Number is 7");
        }
        // the moment it gets a match it executes all cases be it there is no break

        /***
         * New feature in java 17
         * Use of multiple values in case statement
         * ***/
        int mahValue = 9;
        switch (mahValue){
            case 2,3,4:
                System.out.println("Number is 2");
            case 8,9:
                //break;
            case 5*6:
                System.out.println("Number is 4");
                // break;
            case 7:
                System.out.println("Number is 7");
            default:
                System.out.println("hie sam");
        }

        /***
         * New feature in java 17
         * New Switch expression
         * ***/
        int month = 5;

        int season = switch(month) {
            case 1, 2, 3 -> 3;
            case 4, 5, 6 -> {
                System.out.println("4 baba");
                yield 4;
            }
            case 7, 8, 9 -> 5;
            case 10, 11, 12 -> 7;
            default -> {
                yield 4;
            }
        };

        System.out.println(" practise  new switch expression");
        /**
         * the new switch expresion has a default break in it than previous switch stament which would execute
         * **/
        switch(month) {
            case 1, 2, 3 -> System.out.println("3 baba");
            case 4, 5, 6 -> {
                System.out.println("4 baba");
            }
            case 7, 8, 9 ->System.out.println("7 baba");
            case 10, 11, 12 -> System.out.println("10 baba");
            default -> {
                System.out.println("default baba");
            }
        };



        final char a = 'A', e = 'E';
        char grade = 'G';
        switch (grade) {
            default:
            case a:
            case 'B', 'C': System.out.print("great "); case 'D': System.out.print("good "); break; case e:
            case 'F': System.out.print("not good ");
        }
        byte amphibian = 1;
        String name = "Frog";
        String color = switch(amphibian) {
            case 1 -> { yield "Red"; }
            //case 2 -> { if(name.equals("Frog")) yield "Green"; } you need to check conditions for else to return the value
            case 3 -> { yield "Purple"; }
            default -> throw new RuntimeException();
        };



    }
}
