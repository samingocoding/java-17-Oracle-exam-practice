package makingdecisions;

import java.util.List;

public class PatternMatching {
    public static void main(String[] args) {
        System.out.println("Rule: if output 0 = match  output 1 = value above output =-1 value below ");
        System.out.println("Checking if number is equal to 5");
        getIfNumberEqualTo5(2);
        System.out.println("Checking if number is > 5");
        getIfNumberGreaterThan5(8);

        Number value = 123;
        if(value instanceof List) {}
        if(value instanceof List data) {
            System.out.println(data);
        }
    }

    private static void getIfNumberGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5)>0){
            System.out.println(data);
        }
    }

    private static void getIfNumberEqualTo5(Number number){
        if (number instanceof Integer data){
            System.out.println(data.compareTo(5));
        }
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)){
            return;
        }
        System.out.print(data.intValue());
    }

    void getFish(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.print("Eat!");
//        else if (!(fish instanceof String guppy)) {  you cant use same variable above
//            throw new RuntimeException(); }
        System.out.print("Swim!"); }

    void tryReturn(Number number){
        if(!(number instanceof Integer data)){

            return;
        }
        int a =7;
        System.out.println(data);
    }
}
