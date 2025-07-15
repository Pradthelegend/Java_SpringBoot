import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lecture_107_Stream_API {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 6, 7, 3, 2, 9);

        Stream<Integer> s1 = nums.stream(); //The stream() will return an object of Stream interface.

        s1.forEach(n -> System.out.println(n));

    }
}
