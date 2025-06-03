class A{

    public A(){
        super();// By default every constructor will have a super method which cannot be seen
        // and it is responsible for calling the constructor of the super class.
        System.out.println("In A constructor");
    }
    public A(int A){ //Perimeterized constructor
        super();
        System.out.println("In int A constructor");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("In B constructor");
    }
    public B(int B){
        this(); // The this method will execute the default constructor of the same class
        //super(B); //Its gonna call the perimeterized constructor of class A. If you
        System.out.println("In int B constructor");
    }
}
public class Lecture_55_Super_Method {

    public static void main(String args[]){

        B obj = new B(); // When we create an object of B the default constructor of B gets executed and default constructor of A also gets executed.
        System.out.println("************************");
        System.out.println();
        B obj1 = new B(4);
        System.out.println("************************");
        System.out.println();
        B obj2 = new B();
        System.out.println("************************");
        System.out.println();
    }
}
