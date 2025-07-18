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
        return "Studs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Lecture_112_Constructor_Reference {

    public static void main(String[] args ){

        List<String> names = Arrays.asList("John","Mega Do DO","Ghost","General Shepard");

        List<String> uNames1 = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uNames1);
        uNames1.forEach(System.out::println);


    }
}
