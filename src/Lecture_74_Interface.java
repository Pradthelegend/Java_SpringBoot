interface A4{ //Interface is not a class.

    //int a; Will throw an error

    int a = 10; // By-default every variable in an interface is final and static. We cannot define variable as shown above, we can only declare them.
    String name = "Prad"; //final and static.

    public abstract void show(); // By-default all methods in an interface are public abstract so no need to mention it refer the config method.
    void config();
}

class B4 implements A4{ // If a class impliments an interface it must declare/implement all its methods. If you are only implimenting few methods you need
                        // to mark the class as abstract. Ex : "abstract class B4 implements A4"

    public void show(){ // This is a concrete method cause it has both method definition and declaration.
        System.out.println("In Show Method");
    }

    public void config(){ // The method as to be public cause the every method in an interface is public. If you don't specify anything it will be considered
                         // default access and compiler will throw an error.
        System.out.println("In Config Method");
        System.out.println(A4.a);
    }

}
public class Lecture_74_Interface {

    public static void main(String args[]) {

        //A4 obj = new A4(); We cannot create an object of an interface but we can create a reference variable as shown below.
        A4 obj;
        obj = new B4();
        obj.show();
        System.out.println(A4.name);
        obj.config();

    }
}
