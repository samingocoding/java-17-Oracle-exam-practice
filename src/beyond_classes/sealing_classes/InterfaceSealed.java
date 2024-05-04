package beyond_classes.sealing_classes;

/***
 * Sealing Interfaces
 *
 * 1.the sealed interface must appear in the same package or named module as the
 * classes or interfaces that directly extend or implement it
 *
 * 2. the permits list can apply to a class that implements
 * the interface or an interface that extends the interface.
 *
 * 3. Well, remember that interfaces are implicitly abstract and cannot be marked final.
 * For this reason, interfaces that extend a sealed interface can only be marked sealed or non-sealed.
 */

public sealed interface InterfaceSealed permits ExtendInterface,Duck {
}

//sealed or non-sealed.
non-sealed class Duck implements InterfaceSealed {}


