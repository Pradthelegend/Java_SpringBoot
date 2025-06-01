class Practice{
    String brand;
    int price;
    static String name;
    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class Lecture_41_Static_Variable {

    public static void main(String args[]){

        Practice obj1 = new Practice();
        Practice obj2 = new Practice();

        obj1.brand ="Apple";
        obj1.price=12;
        obj1.name = "iphone";

        obj2.brand ="Samuboy";
        obj2.price=127;

        obj1.show();
        obj2.show();
    }
}
