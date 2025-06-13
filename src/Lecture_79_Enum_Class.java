enum Laptop1{
/*
public static final Laptop1 MacBook = new Laptop1(2000);
public static final Laptop1 Asus = new Laptop1(3000);
public static final Laptop1 ThinkPad = new Laptop1;
public static final Laptop1 Dell = new Laptop1(500);

So, each constant is a singleton object of the Laptop1 enum, and each one is created by calling the private constructor with the respective price.

 */
    MacBook(2000),Asus(3000),ThinkPad,Dell(1500);

    private int price; // Instance variable

    private Laptop1(){ //default constructor and since the object is created within the same class thats why its private. Enum constructors are always private
                       // by design; you cannot make them public.

        this.price = 500;
    }
    private  Laptop1(int price){ // Note : A consturctor doesn't have a return type. If you specify a return type it's no longer a constructor.
         this.price = price; //perimeterize constructor
    }

    public int getPrice(){
        return this.price;
    }

}

//class A6 extends Laptop1{ // This will throw an error. We cannot extend an enum class.
//
//}
public class Lecture_79_Enum_Class {

    public static void main(String args[]) {

        Laptop1 lap = Laptop1.Asus;// We're assigning the reference of the enum constant Asus to the variable lap. No new object is created.
        System.out.println("This is the super class : " + lap.getClass().getSuperclass()); // By default every enum class extends another class.
        System.out.println(lap.getPrice());

        lap= Laptop1.ThinkPad;
        System.out.println(lap +" " + lap.getPrice());

        System.out.println("===========================");

        for (Laptop1 lapTemp : Laptop1.values()){

            System.out.println("The laptop is : " + lapTemp + " and price is " + lapTemp.getPrice());
        }
    }

}
