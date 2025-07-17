import java.util.Arrays;
import java.util.List;

public class Lecture_111_Method_Reference {

    public static void main(String[] args ){

        List<String> names = Arrays.asList("John","Mega Do DO","Ghost","General Shepard");

        List<String> uNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(uNames);
        uNames.forEach(n -> System.out.println(n));
        System.out.println("------------------------------------------------------");

        //Doing the same thing using Method Reference

        List<String> names1 = Arrays.asList("John","Mega Do DO","Ghost","General Shepard");

        List<String> uNames1 = names.stream()
                .map(String::toUpperCase)/*
                .map(String::toUpperCase) means
                For every element in the stream (which in this case is expected to be a String),
                Call the toUpperCase() method that belongs to the String class,
                And return the result (the uppercase version) as the new value in the stream.
                Syntax:<ClassName or object>::<methodName>
                */
                .toList();
        System.out.println(uNames1);
        uNames1.forEach(System.out::println);
    }
}
