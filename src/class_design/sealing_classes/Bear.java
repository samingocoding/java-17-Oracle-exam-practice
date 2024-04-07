package class_design.sealing_classes;

/**
 * A sealed class is a class that restricts which other classes may directly extend it
 *
 *
 * Definition
 * 1. sealed keyword required
 * 2. permits keyword permitted or can be omitted can be
 * 3. For subclasses, they should have either final, sealed, or non-sealed subclass modifier
 * **/
public sealed class Bear permits Kodiak, Panda, WhitePanda, Bear.ChildBear {
    //Mentioning a nested subclass requires proper referencing in the permit clause eg mention the  Bear.ChildBear
    final class ChildBear extends Bear{}
}
