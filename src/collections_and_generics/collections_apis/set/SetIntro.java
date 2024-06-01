package collections_and_generics.collections_apis.set;

import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {

    }
    public void setMethods(){
        Set<Character> letters = Set.of('a','z','b');
        Set<Character> copy = Set.copyOf(letters);

    }

}
