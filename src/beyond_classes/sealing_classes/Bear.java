package beyond_classes.sealing_classes;

/**
 * A sealed class is a class that restricts which other classes may directly extend it
 *
 * The subclasses fshould be from same packjage eg Testing in enums
 * error: Class is not allowed to extend sealed class from another package
 *
 * Definition
 * 1. sealed keyword required
 * 2. permits keyword permitted or can be omitted can be
 * 3. For subclasses, they should have either final, sealed, or non-sealed subclass modifier
 *
 * Sealed Class Rules
 *
 * 1. Sealed classes are declared with the sealed and permits modifiers.
 * 2. Sealed classes must be declared in the same package or named module as their direct subclasses.
 * 3. Direct subclasses of sealed classes must be marked final, sealed, or non-sealed.
 * 4. The permits clause is optional if the sealed class and its direct subclasses are declared within the same file or the subclasses are nested within the sealed class.
 * 5. Interfaces can be sealed to limit the classes that implement them or the interfaces that extend them.
 * **/
public sealed class Bear permits Kodiak, Panda, WhitePanda, Bear.ChildBear {
    //Mentioning a nested subclass requires proper referencing in the permit clause eg mention the  Bear.ChildBear
    final class ChildBear extends Bear{}
}
