import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lecture_107_Stream_API {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 6, 7, 3, 2, 9);

        // Step 1: Create a stream from the list
        // This doesn't process any elements yet, just sets up the pipeline
        Stream<Integer> s1 = nums.stream(); // stream() returns a Stream object connected to 'nums'. Ex: Creating a conveyor belt.

        // Step 2: Apply a filter operation
        // This adds a step to only allow even numbers (n % 2 == 0) to pass through
        // Still lazy — no actual filtering happens yet
        //filter() will also give you a new stream.
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);//think filter() as a person standing in a conveyor belt he will
                                                              // only let even numbers pass through. map() is also similar.

        // Step 3: Apply a map operation
        // This transforms each even number by multiplying it by 2
        // Again, nothing runs yet — this just builds the next step in the pipeline
        //map() will also give you a new stream.
        Stream<Integer> s3 = s2.map(n -> n * 2);

         int result = s3.reduce(0, (c, e) -> c + e); // reduce() won't return a new stream it will return a value.

        // Step 4: forEach is a terminal operation — it starts the stream pipeline
        // The stream now pulls elements from nums one by one:
        //  - filters even numbers
        //  - doubles them
        //  - prints them
//        s3.forEach(n -> System.out.println(n));
        System.out.println(result);

        //Performing the same operation but with a different syntax.

        int result1 = nums.stream()
                .filter(n -> n % 2 == 0) //filter() will return a new stream.
                .map(n -> n * 2)//map() is gonna use the stream returned by filter() and return a new stream.
                .reduce(0, (c, e) -> c + e);// result() will sue the stream returned by map and return a value/result.


        System.out.println("====================================================");
        System.out.println(result1);

    }

}
