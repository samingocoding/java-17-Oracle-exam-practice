package class_design.immutableclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Mark a class to be Immutabele here are the strategies
 * <p>
 * common strategy for making a class immutable:
 * 1. Mark the class as final or make all of the constructors private.
 * 2. Mark all the instance variables private and final.
 * 3. Don’t define any setter methods.
 * 4. Don’t allow referenced mutable objects to be modified.
 * 5. Use a constructor to set all properties of the object, making a copy if needed.
 **/

/**
 * 1. Mark the class Final
 * */
public final class Animal { // Not an immutable object declaration
    /**
     * 2. Mark variables to be final and private
     * */
    private final ArrayList<String> favoriteFoods;
    private final ArrayList<String> protectedFoods;
    private final ArrayList<String> costyFoods;

    /**
     * 3. Make sure to define every varibale in a constructor
     * */
    public Animal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
        this.protectedFoods = new ArrayList<String>();
        this.protectedFoods.add("Apples");
        this.costyFoods = new ArrayList<String>();
        this.costyFoods.add("Apples");
    }

    /**
     *Defensive copy because the copy is being made in case other code does something unexpected
     * */
    public Animal(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
        this.protectedFoods = new ArrayList<String>(favoriteFoods);
        this.costyFoods = new ArrayList<String>(favoriteFoods);
    }
    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public int protectedFoodsCount() {
        return protectedFoods.size();
    }

    public String protectedFoodsItem(int index) {
        return protectedFoods.get(index-1);
    }
    public List<String> getCostyFoods() {
        return new ArrayList<String>(this.costyFoods);
    }

}
