// the collections frameworrk is defined in the java.util package
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add( "Rabbit");
        System.out.println("Printing current array");
        System.out.println(animals);
        animals.clear();
        System.out.println("Printing array after clearing");
        System.out.println(animals);
        animals.add("Dog");
        animals.add("Cat");
        animals.add( "Rabbit");
        System.out.println("The size of the array is: " + animals.size());
        System.out.println("Adding another animal to the array: " + animals.add("Horse"));
        System.out.println(animals);
        animals.remove(1);
        System.out.println("Printing array after removing an element");
        System.out.println(animals);
    }
    
}
