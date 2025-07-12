import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//When you implement Comparable<T>, Java expects you to define how one object compares to another of the same type — so it knows how to sort or compare them.
class Students2 implements Comparable<Students2>{ // Comparable will give the class the power to compare its object to itself. Thats whay we've done in compareTo().

    int age;
    String name;

    public Students2(int age,String name){
        this.name = name;
        this.age  = age;
    }

    @Override
    public String toString(){

        return "Student name : " + name + " and age is " + age;
    }

    @Override
    public int compareTo(Students2 that){ // We have to define this method if our class impliments Comparable. We have to specify the logic to sort in this method.
        if(this.age > that.age){
            System.out.println();
            return 1;
        }else {
            return -1;
        }
    }

}
public class Lecture_104_Comparable {

    public static void main(String[] args) {


        List<Students2> studs = new ArrayList<>();
        studs.add(new Students2(1,"Chin"));
        studs.add(new Students2(19,"John"));
        studs.add(new Students2(21,"Ney"));
        studs.add(new Students2(32,"Messi"));

        Comparator<Students2> comp2 = new Comparator<Students2>() {
            @Override
            public int compare(Students2 i, Students2 j) {
                if(i.age > j.age){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

//       Collections.sort(studs,comp2);


        Collections.sort(studs);//sort() will work if the class object that you're passing extends Comparable interface or else you need to use Comparator interface.

        for (Students2 s : studs){
            System.out.println(s);
        }

    }
}
