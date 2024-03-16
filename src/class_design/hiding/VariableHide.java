package class_design.hiding;

public class VariableHide {
    protected String sam= "Me";

    //
}
class SubClass extends VariableHide{
    /**
     * Variable Cant be overidedn in java but can be hidden
     * */
    protected String sam= "You";
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        VariableHide variableHide= subClass;
        System.out.println(subClass.sam); // You
        System.out.println(variableHide.sam); //Me
    }
}
