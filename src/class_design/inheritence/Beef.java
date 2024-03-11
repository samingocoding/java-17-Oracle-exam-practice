package class_design.inheritence;

class Beef {
    protected String name;
    public static int quantity;
    double cost;
    private static String expDate ="23/23/23";
    public static String getExpDate() {
        return expDate;
    }

    public static void setExpDate(String expDate) {
        Beef.expDate = expDate;
    }

}
class Chicken extends Beef{
    public static void main(String[] args) {
        /**
         * Variable should be static **/

        System.out.println(quantity);
        System.out.println(getExpDate());

        var beef = new Beef();
        beef.setExpDate("24/24/24");
        System.out.println(getExpDate());
    }
}
