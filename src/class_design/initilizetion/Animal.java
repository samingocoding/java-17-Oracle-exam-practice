package class_design.initilizetion;

public class Animal {
    static{
        System.out.println("Samuel 1");
    }

    public static void main(String[] args) {
        System.out.println("Samuel 4");
    }
}
/**
 * Rules
 * 1. Super class loaded initialiesd again  first
 * 2. static varibles declared
 * 3. static initializers next
 *
 * */
class Donkey extends Animal{
    public static void main(String[] args) {
        System.out.println("Samuel 3");
        new Donkey(); //Thsse are already loaade hence wont print extra
        new Donkey();
        new Donkey();
    }
    static {
        System.out.println("Samuel 2");
    }
}
