class a2{
    void show1(){
        System.out.println("In 'a' show");
    }
}
class b2 extends a2{
    void show2(){
        System.out.println("In 'b' show");
    }
}
public class Lecture_63_Upcasting_and_Downcasting {

    public static void main(String args[]) {

        a2 obj = new b2(); // This is down casting

    }
}
