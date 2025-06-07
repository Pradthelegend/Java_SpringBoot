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

        a2 obj = new b2(); // This is upcasting
        a2 obj1 = (a2) new b2(); // Above/Both the line do the same thing.

        b2 obj2 = (b2) obj1; // This is downcasting. Here we are creating a reference variable "obj2" which is of type "b2" and
                             // we are downcasting an object which is actually a "b2" object but the reference is of "a2" and this is explicit type casting.

        a2 obj3 = new a2();
        //b2 obj4 = (b2) obj3; // This line will throw an error at runtime.Compiles fine (compiler trusts you when you cast).

        obj3.show1();
        obj2.show2();
    }
}
