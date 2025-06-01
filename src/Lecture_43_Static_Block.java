class Practice2{
    String brand;
    int price;
    static String name;

    static {
        name="Chin Chin";
        System.out.println("In static block");
    }
    public void Practice2(){
        brand ="";
        price=200;
        System.out.println(brand+" : "+price+" : "+name);
    }

    public void show() {  // Instance Methods

        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Practice1 obj){ // static methods belong to the class itself.

        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
public class Lecture_43_Static_Block {
    public static void main(String args[]) {

        Practice2 practice2 = new Practice2();

    }
}
