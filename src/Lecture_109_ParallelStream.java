import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lecture_109_ParallelStream {

    public static void main(String[] args) {

        int size = 10000;

        List<Integer> data = new ArrayList<>(size);//specifying the size of the list.

        Random rand = new Random();
        for (int i = 1; i < size; i++) {
            data.add(rand.nextInt(100));
        }

        int result = data.stream()
                 .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

        long sequentialStreamStartTime = System.currentTimeMillis();
        int result1 = data.stream()
                .map(n -> {
                    try{
                        Thread.sleep(1);//Ading a manual delay
                    }catch (Exception e){}
                    return n * 2;
                })
                .mapToInt(n -> n)
                /* This converts the stream to an IntStream, which is a special stream for int values.
                Even though .map(n -> n * 2) gives integers, it still produces a Stream<Integer> (a stream of objects).
                But sum() only exists on IntStream, not Stream<Integer>.

                This is what the lambda expression is doing:

                ToIntFunction<Integer> doubleIt = new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer n) {
                return n;
            }
        }; At the end  .mapToInt(doubleIt)
*/
                .sum();
        System.out.println("Sequentail Stream Result : " + result1);

        long sequentialStreamEndTime = System.currentTimeMillis();
        System.out.println("Time taken by sequentialal Strem : " + (sequentialStreamEndTime -sequentialStreamStartTime ));

        System.out.println("--------------------------------------------------------------");

        long parallelStreamStartTime = System.currentTimeMillis();
        int result2 = data.parallelStream()
                .map(n -> {
                    try{
                        Thread.sleep(1);//Ading a manual delay
                    }catch (Exception e){}
                    return n * 2;
                })                .mapToInt(n -> n)
                .sum();
        System.out.println("Parallel Stream result " + result2);
        long parallelStreamEndTime = System.currentTimeMillis();
        System.out.println("Time taken by parallel Strem : " + (parallelStreamEndTime - parallelStreamStartTime));


    }
}