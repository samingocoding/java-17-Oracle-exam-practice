package beyond_classes.records;

/**
 * A record is a special type of data-oriented class in which the compiler inserts boilerplate code for you.
 *
 * compiler inserts useful implementations of the Object methods equals(), hashCode(), and toString().
 *
 * Members Automatically Added to Records
 * Constructor: A constructor with the parameters in the same order as the record declaration
 * Accessor method: One accessor for each field
 * equals(): A method to compare two elements that returns true if each field is equal in
 * terms of equals()
 * hashCode(): A consistent hashCode() method using all of the fields
 * toString(): A toString() implementation that prints each field of the record in a convenient, easy-to-read format
 * */
public record Record(int numberEggs, String name) {
    public static void main(String[] args) {
        var father = new Record(0, "Craig"); //should have same order
        System.out.println(father); // Crane[numberEggs=0, name=Craig]
        //methods added by compiler :
        System.out.println(father.name());
        System.out.println(father.numberEggs());

        var copy = new Record(0, "Craig");
        System.out.println(copy); // Crane[numberEggs=0, name=Craig]


         System.out.println(father.equals(copy)); // true
         System.out.println(father.hashCode() + ", " + copy.hashCode()); // 1007, 1007  checks equal values
    }
}

/***
 * Tests Take away
 *
 * 1. Declartions of records
 * **/

record Iguana(int age) {
   // private static final int age = 10; // Dont use same variable name age
}

//abstract record Chameleon() { private static String name; }   //Abstract modifier not allowed on declaring record

record Newt(long size) {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
//    public void setSize(long size) {
//        this.size = size;
//    }   Record does not have mutator methods   that modify fields are not permitted not allowed.
}
