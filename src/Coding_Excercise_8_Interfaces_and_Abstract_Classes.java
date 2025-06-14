// TODO: Create an interface called Machine with one method: String start()
interface Machine{

    String start();
}
// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface

abstract class Appliance implements Machine{

    String name;

    public Appliance(String name){

        this.name = name;


    }
}
// TODO: Create a class Fan that:
// - Extends Appliance

class Fan extends Appliance{
    /*
    When a class extends an abstract class, it inherits all the non-private members (like fields and methods) from the abstract class.

    But constructors are never inherited in Java.

    If the abstract class has a constructor that takes parameters, then the subclass must explicitly call that constructor using super(...).
     */
    public Fan(String name) {
        super(name);
    }

    public String start(){

        return "Fan is running";
    }
}


// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance{

    public WashingMachine(String name) {
        super(name);
    }

    public String start(){

        return "Washing Machine is operating";
    }
}

public class Coding_Excercise_8_Interfaces_and_Abstract_Classes {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        Machine objFan = new Fan("Fan");
        Machine objWashingMachine = new WashingMachine("Washer");

        // TODO: Print the result of start() for each object
        System.out.println(objFan.start());
        System.out.println(objWashingMachine.start());
    }
}
