//This code explains runtime prlymorphism and Dynamic method dispatch is an example of runtime polymorphism.

class a{

    public void show(){

        System.out.println("In 'a' show");
    }
}
class b extends a{
    public void show(){

        System.out.println("In 'b' show");
    }
}
class c extends b{
    public void show(){

        System.out.println("In 'c' show");
    }
}

class d{

    public void show(){

        System.out.println("In 'd' show");
    }
}

public class Lecture_60_Dynamic_Method_Dispatch {
    public static void main(String args[]){

        a obj = new a();
        obj.show();

        a obj1 = new b(); // This means i have a reference variable of type a but I'm storing an object of type b.
                          // This is only allowed if b is a subclass of a, i.e., b extends a. This is also called upcasting.
        obj1.show();

        a obj3 = new c();
        obj3.show();

        //a obj2 = new d(); This line won't work cause "d" is not extending.

    }

}
