package collections_and_generics.collections_apis.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{
    private String name;

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        var duck = new Duck();
        duck.name = "Samuels";
        var duck2 = new Duck();
        duck2.name="Pamuel";
        var collect = new ArrayList<Duck>();
        collect.add(duck);
        collect.add(duck2);
        System.out.println(duck.compareTo(duck2));
        Collections.sort(collect);
        collect.forEach((v)-> System.out.println(v.name));

    }
}
