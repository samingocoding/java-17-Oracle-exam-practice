package class_design.testtakeaways;

public class Corrections extends Testing {

    static String name;

    void setName(String w) {
        System.out.println("You only Call me my guy thats overridden");
        name = w;
    }

    public static void main(String[] p) {
        final Corrections m = new Corrections();
        final Testing t = m;
        m.name = "Elysia";
        t.name = "Sophia";
        m.setName("Webby");
        t.setName("Olivia");
        System.out.println(m.name + " " + t.name);
    }

}

class Testing {
    static String name;

    void setName(String q) {
        System.out.println("You cant Call me my guy i am overridden");
        name = q;
    }
}
