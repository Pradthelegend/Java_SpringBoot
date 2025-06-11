interface Computer{
    /* With the help of interface we can make our code more dynamic.  if we don't use interface we need to create an abstarct class of
       "Computer" and then we need "Desktop" and "Laptop" to extend it and define the "code()" method and call it by creating an object of the respective classes.
*/
    void code();
}

class Desktop implements Computer{

    public void code(){
        System.out.println("In Desktop class");
    }
}

class Laptop implements Computer{

    public void code(){
        System.out.println("In Lattop class");
    }
}

class Developer{

    public void developApplication(Computer object){

        object.code();
    }
}
public class Lecture_75_Need_For_Interface {

    public static void main(String args[]) {

        // Computer obj = new Computer(); Cannot create an object of an interface.
        Computer obj  = new Desktop();
        Computer obj1  = new Laptop();
        Developer dev = new Developer();
        dev.developApplication(obj); // By using interface our code has become dynamic.
        dev.developApplication(obj1);

    }
}

