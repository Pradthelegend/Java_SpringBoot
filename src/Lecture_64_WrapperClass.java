//What is a wrapper class?
//In Java, wrapper classes are used to wrap (or box) primitive data types (like int, char, boolean, etc.) into objects.
//
//Java is an object-oriented language, but primitives are not objects. So when you need an object instead of a primitive (like in Collections
// which only work with objects), wrapper classes are used.


//Yes, exactly! Every primitive data type in Java has a corresponding wrapper class. Here's the quick rundown:
//
//Primitive Type	Wrapper Class
//byte	              Byte
//short	              Short
//int	              Integer
//long	              Long
//float	              Float
//double	          Double
//char	              Character
//boolean	          Boolean


public class Lecture_64_WrapperClass {

    public static void main(String args[]) {

        int num1 = 5; // This is a primitive value; data is stored on the stack.

        // Integer num2 = new Integer(4);
        // This constructor usage is deprecated (not recommended anymore).
        // Instead, we use autoboxing like below:

        Integer num2 = 4;
        // Here, Java automatically creates an Integer object wrapping the primitive value 4. This is called "Boxing".

        Integer num3 = num1;
        // This is called auto-boxing because Java automatically converts the primitive int to an Integer object.
        // "Implicit" means it happens behind the scenes without explicit code from the programmer.
        // Integer is a class and provides multiple useful methods like parsing strings into integers.

        System.out.println(num1);  // Prints the primitive int value
        System.out.println(num2);  // Prints the Integer object value (auto-unboxed here)
        System.out.println(num3);  // Prints the Integer object value (auto-unboxed here)

        String str = "7";
        int num4 = Integer.parseInt(str);
        // Parses the string "7" into the primitive int value 7.
        System.out.println(num4);
    }
}

