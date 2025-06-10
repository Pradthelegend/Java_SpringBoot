abstract class A3{

    public abstract void show();

    public abstract void config();


}

public class Lecture_73_Abstract_and_Anonymous_Inner_Class {

    public static void main(String args[]) {

        //A3 obj = new A3(); // Cannot create an object of an abstract class. This will throw an error.

        A3 obj = new A3(){ // Here we are not creating an object of an abstract class. We are creating an obhect of anonymous inner class.

            public void show(){ // We are providing the implimentation for the abstract here. When we want to use the abstarct class only once in those situations we can use anonymous inner class.
                System.out.println("In A show");
            }

            public void config(){
                System.out.println("In config");
            }

        };

        obj.show();
        obj.config();

    }

}
