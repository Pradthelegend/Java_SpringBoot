import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lecture_108_Map_Filter_Reduce_Sorted {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 6, 7, 3, 2, 9);

        //filter() needs an object of Predicate and inside the inner class we need to specify the logic for filtering. Later you can do this ".filter(p)"
        Predicate<Integer> p = new Predicate<Integer>() { //Predicate is an interface.
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0) {
                    return true;
                }else
                return false;
            }
        };

//        //Another way of doing it
//        Predicate<Integer> p1 = new Predicate<Integer>() { //Predicate is an interface.
//            @Override
//            public boolean test(Integer n) {
//                return n%2==0;
//            }
//        };

        //Using Lambda
//         Predicate<Integer> p2 = n -> n%2==0;

        //Map needs an object of type Function and here we are specifying the logic.
        Function<Integer,Integer> fun = new Function<Integer, Integer>() { //The first integer specifies what value its gonna take in and the second
                                                                         // one specifies the type of the value that will be returned.
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        //Same ting in lambda:
//         Function<Integer,Integer> fun1 =n ->  n*2;


        int result1 = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (c, e) -> c + e); //If you forgot this just AskchatGPT. "0" means we are tellingit to start at zero.

        System.out.println(result1);

        Stream<Integer> sortedValues = nums.stream()
                .filter(p)
                .sorted();//Will sort the values in the stream.

        //Note :There is nums.parallelstream() aswell which allows us it run it on multiple threads.

        System.out.print("Sorted values : ");
        sortedValues.forEach(n -> System.out.print(n + " "));

    }

}
