import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lecture_106_forEach_Method {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,6,7,3,2,9);

        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {

                System.out.println(n);
            }
        };

        nums.forEach(cons);

    }

}
