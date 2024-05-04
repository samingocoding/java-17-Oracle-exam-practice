package beyond_classes.enums;

public enum SeasonComplex {
    //Loded once and compile java will use already loaded enum
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private final String expectedVisitors;

    //We mark the instance variable private and final on line 3
    // so that our enum properties cannot be modified.

    private SeasonComplex(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        System.out.println("this season is "+ expectedVisitors);
    }
    //enum constructors are implicitly private, with the modifier being optional
    /***
     *Java constructs all of the enum values
     *vcalls the constructor only once:
     */


    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

class PrintTheOne {
    public static void main(String[] args) {
        System.out.print("begin,");
        //JAVA CALLS ALL CONSTRUCTIRS printing
        SeasonComplex firstCall = SeasonComplex.SUMMER; // Prints constructing, OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything System.out.print("end");
    } }
