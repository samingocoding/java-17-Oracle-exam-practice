package class_design.constructors;

public class DogBreed {
    //Java auto put empty constructor with super() calling Object parent
    public DogBreed(int age){
        super(); //auto placed by compiler
    }
}

 // class Bulldog extends DogBreed{ }
// Thiss does not compile because the default constriuctor doies not
// explicity call the argumented constructor of parent with a parameter int

class PitBulldog extends DogBreed{
    public PitBulldog(int age, String name){
        super(2); //This compiles
    }
    public PitBulldog(int age){
        this(0, "Sam");
    }
}
