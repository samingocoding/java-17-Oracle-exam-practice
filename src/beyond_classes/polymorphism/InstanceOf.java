package beyond_classes.polymorphism;


class Rodent {}
class Unrelated{}
public class InstanceOf extends Rodent {
    /**
     * The instanceof operator can be used to check whether an object belongs to a particular class or interface and
     * to prevent a ClassCastException at runtime
     * */

    public static void main(String[] args) {
        InstanceOf instanceOf = new InstanceOf();
        Rodent rodent = instanceOf;

        Rodent rodent1 = new Rodent();
        var instanceOf1 = (InstanceOf) rodent1;  ///Compiles but throws a classcast Exception

        if (rodent1 instanceof InstanceOf a){
            //Do some cast here
        }
        /**
         * Just as the compiler does not allow casting an object to unrelated types,
         * it also does not allow instanceof to be used with unrelated types*/

      //  if (rodent1 instanceof Unrelated d){}// does not compile


    }

}
