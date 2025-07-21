import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class Coding_Excercise_13 {

    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println("Original List: " + products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        Predicate<String> p = new Predicate<String>() { //Predicate is an interface.
            @Override
            public boolean test(String  names) {
                if (names.length() > 5) {
                     return true;
                }else {
                    return false;
                }
            }
        };
        Stream prods = products.stream()
                .filter(p);

        prods.forEach(n -> System.out.println(n));

        // TODO: Print the filtered list
    }
}
