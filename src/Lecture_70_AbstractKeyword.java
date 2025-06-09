abstract class Car{ // We cannot create an object of an abstract class but we can create a reference variable and use Dynamic methods dispatch to access the methods.

    abstract public void drive(); // Declaring a method. When a method is marked as "abstract" the class should also me marked as "abstract". But an abstract class
                                  // can have methods that are not "abstarct". There is no compulsion that an abstaract class should have abstract methods.
    abstract public void shalom();

    public void playMusic(){ // Defining a method
        System.out.println("In  Play Music class");
    }
}

abstract class RollsRoyce extends Car{

    public void  drive(){ // If a class extends an abstract class it must define the abstract methods of the parent/abstract class or else it will throw an error.
        System.out.println("In drive class");

    }

    public void shalom(){
        System.out.println("Shalom");
    }
}

class BMW extends RollsRoyce{  // These are called conrete class

    public void bmdX1(){

        System.out.println("In BMD Class");
    }
}


public class Lecture_70_AbstractKeyword {

    public static void main(String args[]) {

        //Car obj = new Car(); // Cannot create an object of an abstract class will throw an error.
        //Car obj = new RollsRoyce(); // This is also not possible
        Car obj = new BMW(); // Dynamic Methods Dispatch or UpCasting
        BMW obj1 = new BMW();
        obj.drive();
        obj.playMusic();
        obj1.drive();
        obj1.bmdX1();
    }

}
