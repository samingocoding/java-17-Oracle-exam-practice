package methoddesign.modifiers.packageaccess;

public class PackegeClass {
    private int roomNumber;
    protected static String teacherName;
    static int globalKey = 54321;
    public static int floor = 3;

    PackegeClass(int r, String t){
        System.out.println("In PackeClass");
        roomNumber = r;
        teacherName = t;

    }
    public static void main(String[] args) {

    }
}
