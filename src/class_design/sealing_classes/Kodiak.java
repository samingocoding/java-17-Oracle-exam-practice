package class_design.sealing_classes;
/**
 *Subclasses of a sealed class
 * they should have either final, sealed, or non-sealed subclass modifier
 *
 *
 * Non-sealed modifier is used to open a sealed parent class to potentially unknown sub- classes
 * **/

public non-sealed class Kodiak extends Bear {
}
 class MyKodiak extends Kodiak {
    /**
     * We are able to create an indirect subclass of Kodiak, called MyKodiak,
     * not named in the declaration of Bear.
     *
     * */
 }
