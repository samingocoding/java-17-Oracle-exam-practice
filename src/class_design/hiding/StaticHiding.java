package class_design.hiding;

public class StaticHiding {
    public static void sneeze() {
        System.out.println("Bear is sneezing"); }
    public void hibernate() { System.out.println("Bear is hibernating");
    }
    public static void laugh() {
        System.out.println("Bear is laughing"); }

    public static void laugh(String name) {
        System.out.println("Bear is laughing"); }

}
class SunBear extends StaticHiding {
//    public void sneeze() {
//        System.out.println("Sun Bear sneezes quietly"); }
//// DOES NOT COMPILE as it should have a static keyword
//    public static void hibernate() {  System.out.println("Sun Bear is going to sleep");
//    }
    //// DOES NOT COMPILE  parent has no static

//    protected static void laugh() {  System.out.println("Sun Bear is laughing");
//    }
    // // DOES NOT COMPILE rule 2 of over ridding should have a access modifier

    //   public  void laugh(String name) {
    //        System.out.println("Bear is laughing");
    //    }
   // DOES not compile as it should have a static keyword

    public static void laugh(String name) {
        System.out.println("Bear is laughing");
    }

}