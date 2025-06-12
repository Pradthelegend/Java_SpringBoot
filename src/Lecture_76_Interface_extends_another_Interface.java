/*
We can have multiple interfaces and a class can also impliment multiple interfaces and the class should also "impliment/declare" all the methods of
both the interfaces.

Interfaces can also extend each other.
 */
interface x{
    void show();
}

interface y extends x { // Interface extending another interface.
    void config();
}

interface z{
    void pagani();
}

class A5 implements z,y{ // Implimenting multiple interfaces and we must declare all the methods of both interface. Here since "y" extends "x" we are defining "show()" methos aswell.

    public void show(){
        System.out.println("Inside show of class A5");
    }

    public void config(){
        System.out.println("Inside config of class A5");
    }

    public void pagani(){
        System.out.println("Inside Pagani of A5");
    }
}

class B5 implements y{ // Here "interface y" is extending "Interface x" so we must "declare/implimet" both the show() and config() methods.

    public void show(){
        System.out.println("Inside show of class B5");
    }

    public void config(){
        System.out.println("Inside config of class B5");
    }
}

public class Lecture_76_Interface_extends_another_Interface {

    public static void main(String args[]) {

        A5 obj = new A5();
        obj.show();
        obj.config();
        obj.pagani();

        System.out.println();

        B5 obj1 = new B5();
        obj1.show();
        obj1.config();



    }

}
