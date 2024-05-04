package beyond_classes.sealing_classes;

/***
 * Omitting the permits Clause
 * 1. Can omit permit clause if the class is in the same class file  or nested in the class that is seald
 *2. In a different file from the sealed class permit clause is required
 * */
public sealed class OmmitP {
    non-sealed class Cobra1 extends OmmitP {}
}
final class Cobra2 extends OmmitP{

}