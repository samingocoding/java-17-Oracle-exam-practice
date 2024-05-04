package beyond_classes.polymorphism.methodOveride;


class PenguinHide {
    public static int getHeight() {  //static method hence not overriden
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight()); //calls Penguibe hide getheight as itr is not overriden
    }
}

public class HidingMembers extends PenguinHide {
    /**
     * hiding members is not a form of polymorphism
     * since the methods and variables maintain their individual properties
     */

    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        new HidingMembers().printInfo();
    }
}
