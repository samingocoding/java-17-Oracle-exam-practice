package beyond_classes.records;


/***
 * A POJO, which stands for Plain Old Java Object,
 * is a class used to model and pass data around, often with few or no complex methods
 *
 * Encapsulation is a way to protect class members by restricting access to them
 * */
public class Encapsulation {
    int numberEggs;
    String name;

    public Encapsulation(int numberEggs, String name) {
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

// encapsulated (and immutable)  class now can be defined with final etc here :

final class Crane {
    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
        else throw new IllegalArgumentException();
        this.name = name;
    }

    // accessor method or a getter
    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}


class Poacher {
    public void badActor() {
        var mother = new Encapsulation(5, "Cathy");
        mother.numberEggs = -100;
        //We do not want the mother Crane to have a negative number
        //of eggs! Encapsulation to the rescue
    }
}