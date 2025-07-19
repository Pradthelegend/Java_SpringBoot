import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Studs{

    private String name;
    private int age;

    public Studs(){

    }

    public Studs(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Lecture_112_Constructor_Reference {

    public static void main(String[] args ){

        List<String> names = Arrays.asList("John","Mega Do DO","Ghost","General Shepard");

        List<Studs> students = new ArrayList<>();

//        for(String name : names){
//            students.add(new Studs(name));
//        }

        //Performing the same operation as the foreach loop but using streams().
//        students = names.stream()
//                        .map(n -> new Studs(n))
//                        .toList();

        //Same code using Constructor Reference.

        students = names.stream()
                .map(Studs::new)//Constructor reference.
                .toList();


        System.out.println(students);
    }
}
