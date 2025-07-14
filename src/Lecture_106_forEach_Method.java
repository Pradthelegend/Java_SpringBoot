import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lecture_106_forEach_Method {

    public static void main(String[] args) {

        // Creating a List of integers using Arrays.asList
        List<Integer> nums = Arrays.asList(4, 6, 7, 3, 2, 9);

        // Creating a Consumer object that defines what to do with each integer
        // The accept method is overridden to print the given number
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                // This block will run for each element in the list
                // 'n' is the current value being passed to the accept method
                System.out.println(n);
            }
        };

        // forEach takes each element from the list 'nums' one by one
        // and calls cons.accept(element) for each value
        // Note: cons is not storing or holding any value itself — it simply processes the current value
        // The accept method handles one value at a time temporarily using its parameter 'n'

        nums.forEach(cons);//Yes. For each element in the list, Java calls accept(element) using your cons object.
                           // You don’t need to manually call accept() — forEach does that for you.
                           //"forEach needs the cons object so that it can call the accept method, and it will automatically pass the element as an argument."


        //Same code using labmda expression.

        //You can either follow this method and later pass the cons1 to forEach() or you can directly pass the expression as shown below.
//        Consumer<Integer> cons1 =n -> System.out.println(n);
//        nums.forEach(cons1);

        nums.forEach(n -> System.out.println(n));



    }
}
