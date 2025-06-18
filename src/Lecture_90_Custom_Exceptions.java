// Creating a custom exception by extending the Exception class.
// You can also extend RuntimeException if you want it to be unchecked.


class PradException extends Exception { // An exception class must have certain features (like the ability to store an error message, a stack trace, etc.)
// Instead of writing all that from scratch, we extend an existing class (like Exception or RuntimeException)
// because those classes already have all the built-in features that make a class behave like an exception.


    // Constructor that passes the message to the base Exception class
    public PradException(String msg){
        super(msg); // Call the parent constructor with the message
    }
}

public class Lecture_90_Custom_Exceptions {

    public static void main(String args[]) {

        int i = 20;
        int j = 0;

        try {
            // This will not cause an ArithmeticException because i is 20 (not zero)
            j = 10 / i;

            // Check if the result is 0, and if so, throw a custom exception
            if(j == 0){
                // Throwing our custom exception with a message
                throw new PradException("The exception was thrown");
            }

        } catch (PradException e) {
            // Catching the custom exception
            System.out.println("Custom Exception: " + e);
            // Note: e.toString() is called here by default which prints: exceptionClassName: message
        }

        catch (Exception e) {
            // This will catch all other exceptions like ArithmeticException, NullPointerException, etc.
            System.out.println("Something went wrong");
        }

        // This will always execute, unless the program exits or crashes before this line
        System.out.println("The value of j is : " + j);
    }
}
