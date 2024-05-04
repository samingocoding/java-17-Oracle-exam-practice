package beyond_classes.nestedclasses;

public class AnonymousClass {
    /**
     * An anonymous class is a specialized form of a local class that does not have a name.
     *
     * Anonymous classes must extend an existing class or implement an existing interface.
     *
     * declared and instantiated all in one statement using the new keyword,
     * a type name with parentheses, and a set of braces {}
     * */

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    interface SaleToday {
        int dollarsOff();
    }

    /**
     * You can define an anonymous class outside method body
     *
     * we are instantiating an interface as an instance variable,
     * but the {} after the interface name indicates that this is an anonymous class
     * implementing the interface
     * */

    interface Climb {}
    Climb climbing = new Climb() {};


    private int sam =6;
    public int admissionAbstract(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { //
            int dollarsOff() {
                System.out.println(sam);
                return 3;
            }
        }; // Don't forget the semicolon!

        return basePrice - sale.dollarsOff();

    }

    public int admissionInterface(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { //instance of a class
            public int dollarsOff() {  //
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    /***
     *  implement an interface and extend a class? You can’t do so with an anonymous class
     * */
}
