/*
 * Note : Lambda expressions can only be used with functional interfaces also verbose means have to type everything or being specific.
 * Before Java 8, Java was considered verbose, especially for functional-style operations.
 * Writing even small behaviors (like passing logic to a method) required creating full anonymous inner classes.
 *
 * To make code more concise and readable, Java 8 introduced **lambda expressions**.
 * A lambda expression allows you to represent a functional interface's single abstract method in a compact form.
 * It enables treating behavior as data (i.e., you can pass methods as arguments or store them in variables).
 *
 * Syntax: (parameters) -> expression or { statements }
 */

@FunctionalInterface // This annotation tells the compiler that this interface is intended to be a functional interface (i.e., it should have exactly one abstract method).
// If more than one abstract method is added, the compiler will throw an error.
interface A8 {
    void show(int i);
}

public class Lecture_83_Lambda_Expressions {

    public static void main(String args[]) {

        // Creating an anonymous inner class implementing A8 and providing implementation for show()
        A8 obj = new A8() {
            @Override
            public void show(int i) {
                System.out.println("In Show " + i);
            }
        };

        /*
         * Using a lambda expression to implement the A8 interface.
         * This is a more concise way of providing the same functionality as above.
         * Behind the scenes, the compiler generates code similar to the anonymous inner class,
         * but using lambda makes the code cleaner and shorter.
         */
        A8 obj1 = i -> System.out.println("In Show " + i);
        // This lambda expression does NOT create an anonymous inner class.
        /*
        When we use a lambda expression like this:
        A9 obj1 = (i, j) -> i + j;

        Here's what actually happens behind the scenes:

        1. The JVM automatically creates a class at runtime.
        This class implements the A9 interface.
        2. It creates an object of that generated class.
        3. The lambda expression provides the implementation for the 'add' method.
        4. The object is assigned to the reference variable 'obj1'.
        5. We can then use obj1 to call the method (add) as usual.

        So even though we don't write the class ourselves, Java still builds it internally.
        This is more efficient and cleaner than writing a full anonymous inner class.
*/





        obj.show(5);
        obj1.show(7);
        /*
                  | Case                | Syntax                                                          |
                  | ------------------- | --------------------------------------------------------------- |
                  | 1 parameter, 1 line | `i -> System.out.println(i);` ✅                                 |
                  | Multiple parameters | `(x, y) -> System.out.println(x + y);`                          |
                  | Multiple lines      | `(i) -> { System.out.println(i); System.out.println("Done"); }` |

         */
    }
}
