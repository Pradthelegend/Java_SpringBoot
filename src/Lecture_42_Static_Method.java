class Practice1{
    String brand; // Instance Variable -It's an instance variable — defined per object.
    int price;  // Instance Variable
    static String name;  // this is a static variable or a class level variable.
                         // Only one copy exists, shared among all objects.
                         //It belongs to the class, not to any particular object.



    public void show() {  // Instance Methods

        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Practice1 obj){ // static methods belong to the class itself.

        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}

// Note : We always need an object to access an istance variable or a method and we cannot access an instance vatable
// inside a static method that's why we are passing an object as an argument.
public class Lecture_42_Static_Method {

    public static void main(String args[]){
        Practice1 obj1 = new Practice1();
        Practice1 obj2 = new Practice1();

        obj1.brand ="Apple";
        obj1.price=12;
        obj1.name = "iphone";

        obj2.brand ="Samuboy";
        obj2.price=127;

        obj1.show();
        obj2.show();
        System.out.println("---------------------");
        Practice1.show1(obj1);
        Practice1.show1(obj2);

    }
}
