package beyond_classes.interfaces;

public interface Methods {


    /**
     * Default Interface Method
     *
     * A default method is a method defined in an
     * interface with the default keyword and includes a method body
     *
     * One use of default methods is for backward compatibility
     * */

    default double getTemperature() { //implicitly public
        return 10.0; }

    /***
     * Default Interface Method Definition Rules
     * 1. A default method may be declared only within an interface.
     * 2. A default method must be marked with the default keyword and include a method body.
     * 3. A default method is implicitly public.
     * 4. A default method cannot be marked abstract, final, or static.
     * 5. A default method may be overridden by a class that implements the interface.
     * 6. If a class inherits two or more default methods with the same method signature,
     * then the class must override the method.
     * */

    //Inheriting Duplicate default Methods
    public default int getSpeed() { return 5; }

    public default int getSpeedPace() { return 9; }


    /**
     * Static Interface Methods
     *
     * Static Interface Method Definition Rules
     * 1. A static method must be marked with the static keyword and include a method body.
     * 2. A static method without an access modifier is implicitly public.
     * 3. A static method cannot be marked abstract or final.
     * 4. A static method is not inherited and cannot be accessed in a class implementing
     * the interface without a reference to the interface name.
     *
     *
     * */

    static int getJumpHeight() {
        return 8;
    }

    /**
     *
     * Private Interface Method Definition Rules
     *
     * 1. A private interface method must be marked with the private modifier and include a method body.
     * 2. A private static interface method may be called by any method within the interface definition.
     * 3. A private interface method may only be called by default and other
     * private non- static methods within the interface definition.
     * */

    private void haveBreakfast() { checkTime(9); }
    private static void checkTime(int hour) {
        if (hour> 17) { System.out.println("You're late!");
        } else {
            System.out.println("You have "+(17-hour)+" hours left "
                    + "to make the appointment"); }}


}

interface Methods2 {
    //Inheriting Duplicate default Methods
    public default int getSpeed() { return 5; }
    public default int getSpeedPace() { return 5; }

}




class Snake implements Methods, Methods2 {
    public double getTemperature() { // Optional override
        return 12;
    }

    //If the class implementing the interfaces
    // overrides the duplicate default method, the code will compile without issue.
    public int getSpeed() {
        return 6;
    }

    @Override
    public int getSpeedPace() {
        //To get explicitly from one of the classes use
        // return Methods.super.getSpeed();
        //  but we use the super keyword to show that we are following instance inheritance, not class inher- itance.
        // return Methods.getSpeed(); //Does not compile use super to show that its instance inheritance

        return Methods.super.getSpeedPace(); //9
    }

    //Accessing a static interface method
    public void printDetails() {
        System.out.println(Methods.getJumpHeight());
        //System.out.println(getJumpHeight()); // DOES NOT COMPILE need reference
    }

}
