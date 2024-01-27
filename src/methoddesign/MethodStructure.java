package methoddesign;

public class MethodStructure {
    public static void main(String[] args) {

    }

    /***
     * Method Name should start with letters, or underscore _ , $
     * Cants satrt with number or any other special chars or single _
     * Contains numbers and letters and underscore _ , $
     * **/
    public static void _samuel$(){

    }

    /**
     * Local Vribale Modifires is only final **/
    public  static void samuel(boolean isGood){
        final int sam ;
        if (isGood) sam=4; else sam = 9;
//        sam=4;  You cant initilise a final varible if it has been initilise
        System.out.println(sam);
    }

}
