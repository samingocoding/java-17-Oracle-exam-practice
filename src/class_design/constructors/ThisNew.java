package class_design.constructors;

public class ThisNew {
    private int age;
    private String name;
    public ThisNew() {
    }
    public ThisNew(String name, int age) {
        this(age);
        this.name=name;
    }
    public ThisNew(int age) {
        this.age= age;
        //this(); //Must be first Statement
    }

    public static void main(String[] args) {

    }

}
