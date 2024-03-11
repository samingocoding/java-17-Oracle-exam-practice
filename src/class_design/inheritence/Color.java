package class_design.inheritence;

public class Color {
    protected String name;
    public int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name; //No change here to class variable green
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Graphic extends Color{
    public static void main(String[] args) {
        var green = new Color();
        green.setName("Green");
        System.out.println(green.name); //Prints null because of lack using this

    }
}
