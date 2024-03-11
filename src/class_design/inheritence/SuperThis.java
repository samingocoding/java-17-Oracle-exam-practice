package class_design.inheritence;

public class SuperThis {
    protected String name="Samuel";
    public int age = 9;
}
class Child extends SuperThis{
    protected String name="Mahembe";
    public int size = 9;
    public void printData() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(super.name);
        //System.out.println(super.size); this will not compile as the variable is not in super class
        System.out.println(name); // takes the closer variable
    }
    public static void main(String[] args) {
     new Child().printData();
    }
}

