import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lecture_104_Comparator_Vs_Comparable {

    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {//Comparator is an interface which allows us to use our own logic for sorting we just need
                                                             // to pass the ref variable as an argument to the sort().
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(31);
        nums.add(82);
        nums.add(53);
        nums.add(39);

        //sort() will sort it in ascending order.
        Collections.sort(nums,comp);//Collections is a class whch has multiple methods.Pass comp(which is an object of Comparator) if you want to sort using your own logic.
        System.out.println(nums);

        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String one,String two){
                if((one.length())>(two.length())){
                    return 1; //If you return 1 it will swap, opposite for -1.
                }else {
                    return -1;
                }

            }
        };

        List<String> str = new ArrayList<>();
        str.add("John");
        str.add("Abhishek");
        str.add("Michael");
        str.add("Chin Chin");
        str.add("Messi");

        Collections.sort(str,comp1);
        System.out.println(str);







    }

}
