package methoddesign.questions;

public class RevisionTest {
    public static  Revision revision = new Revision();
    public static  Revision revision1 = new Revision();
    {
        /***
         *
         */

        System.out.println("Cant Print me You have not Constructed the main class RevisionTest");
        System.out.println(revision.length);
    }
    public static void main(String[] args) {
        revision.length=3;
        revision1.length=10;
        System.out.println(revision.length);

        //Float variable requires a f prifix hence it is implicitly casted to Object
        float num = 6.7f;
    }
}
