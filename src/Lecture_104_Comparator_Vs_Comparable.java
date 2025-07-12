import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students1{

    int age;
    String name;

    public Students1(int age,String name){
        this.name = name;
        this.age  = age;
    }

    @Override
    public String toString(){

        return "Student name : " + name + " and age is " + age;
    }
}
public class Lecture_104_Comparator_Vs_Comparable {

    public static void main(String[] args) {

        /*
        Comparator is an interface that allows custom sorting logic. Pass the Comparator reference to sort() when you want to sort using your own rule.
         */
        Comparator<Integer> comp = new Comparator<Integer>() {
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
                    return 1; //If you return 1 it will swap, opposite for -1.Returning 1 tells Java that the first element is "greater",
                              // so it should come after the second one (swap them). Returning -1 means keep them as is.
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

        //Comparator<T> is a generic interface that compares two objects of type T.
        //So Comparator<Students1> means you're creating a comparator for comparing two Students1 objects.
        List<Students1> studs = new ArrayList<>();
        studs.add(new Students1(1,"Chin"));
        studs.add(new Students1(19,"John"));
        studs.add(new Students1(21,"Ney"));
        studs.add(new Students1(32,"Messi"));

        Comparator<Students1> comp2 = new Comparator<Students1>() {
            @Override
            public int compare(Students1 i, Students1 j) {
                if(i.age > j.age){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(studs,comp2);
        // Collections.sort(studs); // ❌ Won’t work because Students1 doesn't implement Comparable.
        // Either use Collections.sort(studs, comp2) OR implement Comparable in Students1.

        for (Students1 s : studs){
            System.out.println(s);
        }









    }

}
