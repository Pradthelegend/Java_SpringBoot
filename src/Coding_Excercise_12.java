import java.util.*;

public class Coding_Excercise_12 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        // TODO: Print the original list
        System.out.println("Original List: " + names);

        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order
        Set<String> set = new LinkedHashSet<>(names);//this is the common and correct way to "convert" between collection types like List, Set, Map, etc., in Java.
        // TODO: Print the set of unique names
        System.out.println("Unique Names: " + set);


    }

}