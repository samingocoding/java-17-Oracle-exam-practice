package class_design.overiding;

public class FinalUnder extends FinalOver{
    /**
     * Rule of final methods is that you can not override a final method
     * */
//    public final String getName(){
//        return "Samuel";
//    }

     /** Unless they are using the private keyword hence thye
      *  will be redclared than being overriden or hidden
      *  */

        private final String getName(){
        return "Samuel";
    }

}
