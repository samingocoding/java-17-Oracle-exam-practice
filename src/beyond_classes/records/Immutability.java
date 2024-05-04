package beyond_classes.records;

import beyond_classes.interfaces.Methods;

/**
 *
 * Just as interfaces are implicitly abstract,
 * records are also implicitly final. The final modifier is optional but assumed
 *
 * Hence you can not extend a record
 *
 * a record can implement a regular or sealed interface, provided it
 * implements all of the abstract methods
 * */
public final record Immutability(int numberEggs, String name) implements Methods {

}


//You can not extend a record
//public record BlueCrane() extends Immutability {} // DOES NOT COMPILE