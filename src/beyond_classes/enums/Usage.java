package beyond_classes.enums;

import beyond_classes.sealing_classes.Bear;

public class Usage {
    public static void main(String[] args) {
        System.out.println(Seasons.ATOM);  //Calls the toString() method as its type based
        var summer = Seasons.SUMMER;
        System.out.println("SUMMER".equals(Seasons.SUMMER));// false as enum not a string but class
        System.out.println(summer.equals(Seasons.SUMMER));  // true
        System.out.println(summer.getClass()); //Enum is a class type

        /***
         * Calling the values(), name(), and ordinal() Methods
         *
         * values() => calls the value of the enum
         * name()=> calls the name of enum to string
         * ordinal()=> calls the in value of position in order of enum
         * */
        for (var season : Seasons.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        /**
         * Calling the valueOf () Method
         *valueOf (X)=> CALLs the value of season type with name equal to passed name
         * */
        Seasons s = Seasons.valueOf("SUMMER"); // SUMMER returns the enum with matching name
        //Seasons t = Seasons.valueOf("summer"); // IllegalArgumentException as enum is caps
        //No enum constant beyond_classes.interfaces.enums.Seasons.summer
        System.out.println(s);
        //System.out.println(t);

        /***
         * Using Enums in switch Statements
         *
         * */

        Seasons summer2 = Seasons.SUMMER;

        switch (summer2) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER: // only call with enum value only
                System.out.print("Time for the pool!");
                break;
        //   case Seasons.SUMMER:  dont use enum name but value SUMMER
               //          case Seasons.valueOf("SUMMER"): cant resolve value of
//                System.out.println("This wont work as compiler looks for name of enum not class type");
//            case Seasons.valueOf("SUMMER"):  wont resolve for valueOf()
//            case 0:
//                System.out.println("Cant compare with primitive integer ");
            default:
                System.out.print("Is it summer yet?");
        }

    }
}
