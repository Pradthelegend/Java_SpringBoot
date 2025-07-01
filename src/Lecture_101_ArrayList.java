import java.util.ArrayList;
import java.util.Collection;

public class Lecture_101_ArrayList {

    public static void main(String[] args) {

        Collection nums = new ArrayList();
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(3);
        nums.add(1);

        for(Object n : nums) {
            System.out.println(n);
        }
    }
}
