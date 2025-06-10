class A1{ // Outer class and it cannot be static.

    public void show(){
        System.out.println("In show method");
    }

    class B1{ //Inner Class

        public void methodInsideBClass(){

            System.out.println("In B1 class");
        }

    }

    static class C1{ //Inner static Class.

        public void methodInsideClass_C(){

            System.out.println("In C1 class");
        }

    }

}
public class Lecture_71_InnerClass {

    public static void main(String args[]) {

        A1 obj = new A1(); //Creating object of outer class
        obj.show();

        A1.B1 obj1 = obj.new B1(); // This is how we create an object of an inner class. We need the object of the outer
                                   // class i.e "A1" in onorder to create an object of the inner class i'e "B1". The "."
                                   // between "A1.B1" means "B1" belongs to "A1". Just like how we create an object to
                                   // access non static methods of a class the same rule applies here thats why we are creating an
                                   // object of the outer class to create an object of the inner class.
        obj1.methodInsideBClass();

        A1.C1 obj2 = new A1.C1(); //For a static Inner class we don't need an object of the outer class.
        obj2.methodInsideClass_C();

    }


}
