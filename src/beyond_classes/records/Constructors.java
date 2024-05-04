package beyond_classes.records;

public class Constructors {

}

/**
 * Long constructort
 *
 * The compiler normally inserts automatically the long constructor :
 * not good practise to define on your own hence boilerplate code
 *
 * */
record LongConstructor(int numberEggs, String name) {
    public LongConstructor(int numberEggs, String name) {
        //You have to initialise every field
        if (numberEggs < 0) throw new IllegalArgumentException(); this.numberEggs = numberEggs;
        this.name = name;
    }

    //if ypou define like this
    //    public LongConstructor(int numberEggs, String name) {} // DOES NOT COMPILE
}

/***
 * A compact constructor is a special type of constructor used for
 * records to process validation and transformations succinctly
 *
 * It takes no parameters and implicitly sets all fields
 *
 * */

record CompactConstructor(int numberEggs, String name) {
    public CompactConstructor{
        if (numberEggs<0) throw new IllegalArgumentException();
        name = name.toUpperCase();

        //You can Transforming Parameters
        if (name == null || name.length() < 1) throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        //NB : compact constructors can modify the constructor parameters,
        // they cannot modify the fields of the record
       // this.numberEggs = 10; // DOES NOT COMPILE

    }
    //Java will execute the full constructor after the compact constructor
}

record OverLoadConstructor(int numberEggs, String name){
    public OverLoadConstructor(String firstName, String lastName){
        // The first line of an overloaded constructor must be an explicit call to another
        // constructor via this()
        this(0, firstName + " " + lastName);

        //After the this() the fields are now immutable
//        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
//        this.numberEggs = 20; // DOES NOT COMPILE
        //Hence no edit happen here

        //NB You also can’t declare two record constructors that call each
        //other infinitely or as a cycle.
    }

}

record OtherUses(){
    private static int type = 10;
    //Instance field is not allowed in record
    //public int size; // DOES NOT COMPILE
    //private boolean friendly; // DOES NOT COMPILE
}