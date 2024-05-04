package beyond_classes.sealing_classes;


/**
 * Well, remember that interfaces are implicitly abstract and cannot be marked final.
 * For this reason, interfaces that extend a sealed interface can only be marked sealed or non-sealed.*/

// sealed or non-sealed not final
public non-sealed interface ExtendInterface extends InterfaceSealed{
}
