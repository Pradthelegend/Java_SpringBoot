import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lecture_110_Optional_Class {

    public static void main(String[] args){

        List<String> names = Arrays.asList("John Maktavish","Ghost","Shepard","Prince");

        //When you don't want to get a "NullPointerException" use "Optional class".
        Optional<String> opt = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst(); // returns the first element if present as an Optional.findFirst() returns an Optional<T>, which is a container that may or may not contain a value.
                            // Use .orElse(...), .ifPresent(...), or .isPresent() to work with it safely.

       // System.out.println(opt.get());// If the Optional is empty (meaning: no element matched), then .get() will throw an exception:

        System.out.println(opt.orElse("Not Found")); //Will return the value of Optional if its not empty. If its empty it will print Not Found.

        System.out.println("------------------------------------------------");

        //Same code written differently:

        String s = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");//.orElse() is a method of the Optional class in Java.

        System.out.println(s);



    }
}
