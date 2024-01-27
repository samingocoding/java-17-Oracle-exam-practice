package javaapis;

public class MathApis {
    public static void main(String[] args) {
        /**
         * Round method rounds up double values and returns int/long
         * Compiles iff you pass int  and return any integral number
         * **/
        int sam = Math.round(123.6f);
        System.out.println(sam);
        /***
         * Ceil method that returns the next whole number to double
         * and floor method return the whole number after discarding decimals
         * */
        double me = Math.ceil(2);
        System.out.println(me);
        double xn =Math.floor(89.3);
        System.out.println(xn);
        double p= 5;
        double dat = Math.pow(2,5);
        double get = Math.random();
        int one = Math.min(5, 3);
        long two = Math.round(5.5);
        double three = Math.floor(6.6);
        var doubles = new double[] {one, two, three};
    }
}
