package beyond_classes.interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestTakeAways implements Walk {
    Integer move() {
        return null;
    }

    String notInherited() {
        return "I am private i am not inherited baba";
    }

    @Override
    public String iamInherited() {
        return null;
    }
}

interface Walk {
    //Final not allowed as modifiers on methods
    // private and static varibales should have a body

    private static List move() {
        return null;
    }

    private String notInherited() {
        return "I am private i am not inherited baba";
    }

    String iamInherited();
}

interface Run extends Walk {
    public ArrayList move();
}

interface Omnivore2 {
    int amount = 10;
    static boolean gather = true;

    static void eatGrass() {
    }

//    int findMore() {
//        return 2;
//    }
    //NB Abstract methods have no body

    default float rest() {
        return 2;
    }

//    protected int chew() {
//        return 13;
//    }
    //NB  protected modifiers not required


    private int chew() {
        return 13;
    }
    public int chewed();

    private static void eatLeaves() {
    }
}

interface Swim {
    default void perform() {
        System.out.print("Swim!");
    }
}

interface Dance {
    default void perform() {
        System.out.print("Dance!");
    }

     abstract void testing();
//     private abstract void testing(); // DOES nOT COMPILE as pruivate and abstract dont go hand in hand

 //final never allowed

}

class Penguin implements Swim, Dance {
    public void perform() {
        System.out.print("Smile!");
    }

    @Override
    public void testing() {
        
    }

    private void doShow() {
        Swim.super.perform(); //this calls super class Swim and method perform
    }

    public static void main(String[] eggs) {
        new Penguin().doShow();
    }
}