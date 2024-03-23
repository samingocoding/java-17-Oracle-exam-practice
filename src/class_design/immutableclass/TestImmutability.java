package class_design.immutableclass;

public class TestImmutability {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.getFavoriteFoods()); // Apples

        animal.getFavoriteFoods().clear();
        System.out.println(animal.getFavoriteFoods()); // empty

        animal.getFavoriteFoods().add("Added hence not immutable");
        System.out.println(animal.getFavoriteFoods()); // Added hence not immutable

        /**
         * Solution to this is
         * 1. by using delegate or wrapper methods to read the data
         * 2. Costly one creating return copies
         * */

        //1. by using delegate or wrapper methods to read the data

        System.out.println(animal.protectedFoodsItem(animal.protectedFoodsCount())); //  Mutable reads the data

        //2 . ``costly returning new Copy
        System.out.println(animal.getCostyFoods()); // Apples

        animal.getCostyFoods().clear();
        System.out.println(animal.getCostyFoods()); // returns original copy

        animal.getCostyFoods().add("Added hence not immutable"); // No change to original copy
        System.out.println(animal.getCostyFoods()); // returns original copy

    }
}
