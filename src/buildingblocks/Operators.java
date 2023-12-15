package buildingblocks;

public class Operators {
    public static void main(String[] args) {
        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y;
        System.out.println(z);
        String s = "4";
        short d = 5;
        var f = d+s;
        System.out.println(f);

        short sam = 3;
        byte sims = 6;
        int added= sam+sims; //the sum takes all int variables(Float, double, int, long)

        long test = 2432;
        float test2= 2345;
        double test3 = y+test2;
        int pig = (byte)4.4;
        int ahh = pig+4;
        System.out.println(ahh);
        boolean test4 = test3==test2;

        int note = 2 + 3;
        short melody = (byte)(double)(note *= 2);
        double song = melody;
        float symphony = (float)((song == 1_000f) ? song * 2L : song);

    }
}
