import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lecture_101_ArrayList {

    public static void main(String[] args) {

        //Collection only works with objects.
        // The Collection interface does not support index-based access (like get(index)).
        // If you need to access elements by index, use the List interface instead.

        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(7);
        // nums.add(8);
        // nums.add(9);
        // nums.add(3);
        // nums.add(1);
        // nums.add("5"); // Compiles without generics, but will cause runtime ClassCastException during casting.

        // When using a raw Collection (no generics), all values are treated as Object.
        // Even if you add numbers, they are autoboxed into Integer objects and stored as Object type.
        // You have to cast them back when retrieving.

        //You're using a raw type, so the compiler treats nums as Collection<Object>
        // for (Object n : nums) {
        //     int num = (Integer) n; // Manual cast required.Internally, ArrayList stores elements in an Object[] array.
                                    //So even though you added Integer, it's stored as an Object.
                                    // That’s why you need a cast when retrieving:
        //     System.out.println(num * 2);
        // }

        // Using List with generics enables index access and type safety.
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(3);
        nums.add(1);

        System.out.println("The index of value 8 is: " + nums.indexOf(8));  // returns 1
        System.out.println("Element at index 2: " + nums.get(2));           // returns 9

        // Looping without the need for casting
        for (Integer n : nums) {
            System.out.println(n * 2); // doubles the number
        }
    }
}
