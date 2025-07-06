import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lecture_102_Set {
    public static void main(String[] args) {


        Set<Integer> nums = new HashSet<Integer>();
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(3);
        nums.add(9);// This duplicate value is not stored in the Set, the size of the set is 4 nor 5.

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}
