class Practice2{
    String brand;
    int price;
    static String name;

    static { // This gets executed when a class is loaded into "Class loader"(Class loader is an area inside the jvm which will contain
        // all the classes which are loaded and class loads only once and hence static methods gets called only once).
        // This block is gonna get executed only one. Whenever we do this  "ClassName objectName = new Practice2();" the class
        // gets loaded into the class loader.
        name="Chin Chin";
        System.out.println("In static block");
    }

    public Practice2(String brand, int price){
        brand = brand;
        price= price;
        System.out.println(brand+" : "+price+" : "+name);
        System.out.println("This is a constructor");
    }
}

public class Lecture_43_Static_Block {
    public static void main(String args[]) throws ClassNotFoundException {

        Practice2 practice1 = new Practice2("Prad",123);
        Practice2 practice2 = new Practice2("Chin",2);

//        Class.forName("Practice2");

    }
}
