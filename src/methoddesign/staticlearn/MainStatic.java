package methoddesign.staticlearn;

public class MainStatic {
    public static long testStatic = 6;
    private static int count;
    public MainStatic() { count++; }

    public static void main(String[] args) {
        /**
         * Also static variables help in counting number of instances  created*/
        MainStatic mainStatic= new MainStatic();
        MainStatic mainStatic1 = new MainStatic();
        MainStatic mainStatic2 = new MainStatic();
        System.out.println(count);
    }
}
