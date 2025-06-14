@FunctionalInterface // This annotation tells the compiler that this interface is intended to be a functional interface (i.e., it should have exactly one abstract method).
// If more than one abstract method is added, the compiler will throw an error.
interface A7{

    void show();

    // You can declare a class inside an interface.
// All inner classes in an interface are implicitly public and static.
// Since they are static, they belong to the interface itself (not to any instance).
// So you can create an object using: A7.B7 obj = new A7.B7(); obj.show();

    class B7 {
        public void show() {
            System.out.println("21");
        }
    }


}

public class Lecture_82_Functional_Interface {

    public static void main(String args[]) {

//        A7.B7 obj = new A7.B7();
//        obj.show();

         A7 obj = new A7() { // we are just creating an annonymous inner class of interface A7 and providing the implimentation.
             @Override
             public void show() {
                 System.out.println("In Show");
             }
         };

         obj.show();

         /*
         Another way to do the same thing would be to create another class that impliments A7 and declare the method there and create an object of
         that class and call the method.
          */


    }

}
