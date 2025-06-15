@FunctionalInterface
interface A9 {
    int add(int i, int j); // Functional interface with a single abstract method
}

public class Lecture_84_Lambda_Expressions_with_return {

    public static void main(String args[]) {

        // ✅ Using an anonymous inner class (before Java 8 style)
        A9 obj = new A9() {
            @Override
            public int add(int i, int j) {
                return i + j; // return keyword used with a full method body
            }
        };

        System.out.println(obj.add(3, 4));

        // ✅ Using a lambda expression (Java 8+)
        // Since this is a single-line expression, we can omit both return and curly braces.
        // The expression result is automatically returned.
        A9 obj1 = (i, j) -> i + j; // This will automatically return the value.

        System.out.println(obj1.add(1, 2));

        // ❌ This would throw an error:
        // A9 obj2 = (i, j) -> return i + j; // ERROR: 'return' cannot be used without braces

        // ✅ Correct way to use 'return' in a lambda:
        // If you use 'return', you must enclose the body in curly braces. return is a statement and statements need to be in curly braces.
        A9 obj3 = (i, j) -> {
            return i + j; // return used correctly inside a block
        };

        System.out.println(obj3.add(10, 20));

        /*
          // Rule 1: Single expression? -> No need for 'return' or curly braces
         // (i, j) -> i + j      ✅

        // Rule 2: Want to use 'return'? -> Use curly braces
       // (i, j) -> { return i + j; }   ✅

      // Rule 3: Using 'return' without braces? ❌ Not allowed
     // (i, j) -> return i + j;       ❌ Compiler Error

         */
    }
}
