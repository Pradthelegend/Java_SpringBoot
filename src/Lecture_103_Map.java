import java.util.HashMap;
import java.util.Map;

public class Lecture_103_Map {

    public static void main(String[] args) {

        Map<String,Integer> points = new HashMap<>(); // A Map is a collection of key/value pairs. We have to specify the type of the Key and value.

        //Note: Keys are unique if we try to add two keys with the same name the second one is gonna override the first one.
        points.put("Barcelona",9);//"put" is similar to "add" that is used in list to add elements to the list/Arraylist.
        points.put("Man City",6);
        points.put("Bayern Munich",5);
        points.put("PSG",4);
        //Note: Keys are unique if we try to add two keys with the same name the second one is gonna override the first one.
//        points.put("Barcelona",15); this will override "points.put("Barcelona",9);"

        System.out.println("Printing all the elements : " + points);

        System.out.println(points.get("Barcelona"));
        System.out.println("-------------------------------------");
        System.out.println();

        points.replace("Barcelona",9,10);
        System.out.println(points.get("Barcelona"));
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.println(points);
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.println(points.keySet());//keyset() will return all they keys.
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.println(points.values());//values() will return all the values.
        System.out.println("-------------------------------------");
        System.out.println();

        for(String clubs : points.keySet()){

            System.out.println(clubs + " : " + points.get(clubs));
        }

        //There is another concept called Hashtable look into that too.






    }
}
