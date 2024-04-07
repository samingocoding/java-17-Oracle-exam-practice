package class_design.sealing_classes;

/**
 *Subclasses of a sealed class
 * they should have either final, sealed, or non-sealed subclass modifier
 *
 *
 * **/

public sealed class WhitePanda extends Bear {
    final class ChildPanda extends WhitePanda{
       // Sealed class sub class also creates indirect classes to  the parent class
        //eg  ChildPanda not mentioned in the Bear list
    }
}
