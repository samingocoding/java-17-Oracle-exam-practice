package class_design.overiding;

public class FinalOver {
//    public final String getName(){
//        return "Samuel";
//    }


    /** Unless they are using the private keyword hence thye
     *  will be redclared than being overriden or hidden*/
    private final String getName(){
        return "Samuel";
    }

}
