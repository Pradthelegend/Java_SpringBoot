//Collection API Hierarchy
/*
/*
Collection (Interface)
├── List // Interface
│   ├── ArrayList       // Class - implements List
│   ├── LinkedList      // Class - implements List & Deque
│   ├── Vector          // Class - legacy, synchronized
│   │   └── Stack       // Class - extends Vector
│
├── Set // Interface
│   ├── HashSet         // Class - implements Set
│   ├── LinkedHashSet   // Class - maintains insertion order
│   └── TreeSet         // Class - implements NavigableSet (extends SortedSet)
│
└── Queue // Interface
    ├── PriorityQueue   // Class - implements Queue
    ├── ArrayDeque      // Class - implements Deque
    └── LinkedList      // Class - also in List, Queue, and Deque hierarchies

Map (Interface)
├── HashMap             // Class - implements Map
│   └── LinkedHashMap   // Class - maintains insertion order
├── TreeMap             // Class - implements NavigableMap (extends SortedMap)
└── Hashtable           // Class - legacy, synchronized
    └── Properties      // Class - extends Hashtable, used for configuration
*/
/*
Additional Notes:
LinkedList appears under both List and Queue, and also implements Deque.

TreeSet implements NavigableSet, which extends SortedSet, which in turn extends Set.

TreeMap and TreeSet maintain natural ordering or can use a comparator.

Hashtable and Vector are legacy synchronized classes.

Properties is a subclass of Hashtable, mainly used for storing config key-value pairs as strings.
 */
import java.util.*;

public class Lecture_102_Set {
    public static void main(String[] args) {


        Set<Integer> nums = new HashSet<Integer>();
        nums.add(71);
        nums.add(82);
        nums.add(94);
        nums.add(30);
        nums.add(94);// This duplicate value is not stored in the Set, the size of the set is 4 nor 5.

        System.out.println("Printing values from HashSet : "+nums);

        Set<Integer> nums1 = new TreeSet<Integer>(); //TreeSet can be used when you want the values to be sorted in Ascending order.
        nums1.add(71);
        nums1.add(82);
        nums1.add(94);
        nums1.add(30);
        nums1.add(94);// This duplicate value is not stored in the Set, the size of the set is 4 nor 5.

        System.out.println("Printing values from TreeSet : " + nums1);

        //It can also be of type Collection.
        Collection<Integer> nums2 = new HashSet<Integer>();
        nums2.add(71);
        nums2.add(82);
        nums2.add(94);
        nums2.add(30);
        nums2.add(94);// This duplicate value is not stored in the Set, the size of the set is 4 nor 5.

        System.out.println("nums2 elements : " + nums2);

        //Using Iterator:

        /*

        The Collection Interface extends Iterator.
        Iterator is a tool to loop through collections in a uniform, type-safe way, and also allows safe element removal during traversal.

        Why not use a for-loop?
        For-each loop doesn't allow you to safely remove elements.
        Iterator gives more control, especially when modifying the collection during iteration.

        */

        Collection<String> nums3 = new HashSet<String>();
        nums3.add("John");
        nums3.add("Levi");
        nums3.add("Luke");
        nums3.add("Andrew");
        nums3.add("Chin Chin");// This duplicate value is not stored in the Set, the size of the set is 4 nor 5.

        System.out.println("--------------------------------------------");
        System.out.println();

        Iterator<String> it = nums3.iterator();//Calling .iterator() on a collection returns an Iterator object that allows you to traverse the elements of that collection.

        while (it.hasNext()) {//hasNext() method will tell you if we have a next element. Itreturns a boolean.

            String names = it.next();//next() will give you the next element.
            System.out.println("nums3 elements : " + names);
        }







    }
}
