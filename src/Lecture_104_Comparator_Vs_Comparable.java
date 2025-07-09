import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture_104_Comparator_Vs_Comparable {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(31);
        nums.add(82);
        nums.add(53);
        nums.add(39);

        Collections.sort(nums);//Collections is a class whch has multiple methods.
        System.out.println(nums);


    }

}
