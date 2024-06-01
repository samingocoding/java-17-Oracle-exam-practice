package collections_and_generics.collections_apis.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntro {
    public static void main(String[] args) {
        ListIntro init = new ListIntro();
        //Converting List to an array
        init.convertingToArray();
    }

    public void convertingToArray(){
       /**
        *  Converting from List to an Array
        *
        * NB : Using the list.toArray(); defaults to an array of class Object
        *
        * NB : Using the list.toArray(new String[x]);  specifying a size of the array to be created
        * If the list doesn't have variable to reach it places default values eg null
        *It gives priority to list size elements
        *
        *  */

       List<String> list = new ArrayList<>();
       list.add("Sam");
       list.add("Mahe");
       var data = list.toArray();
        System.out.println(data.getClass());  //Defaulted to OBJECt
        var data2 = list.toArray(new String[1]);
        System.out.println(data2.getClass());
        System.out.println(data2.length);
        System.out.println(Arrays.toString(data2));
    }
}
