//Handling Exceptions in Java: Advanced Exercise: Try-Catch, Throw, and Throws in Action
class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}
public class Coding_Excercise_10 {

    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"

        try {
            if (age < 18) {
                throw new InvalidAgeException("This is a InvalidAgeException");
            } else {
                System.out.println("Access granted");
            }
        } finally {
            System.out.println("Finally got executed!!");
        }

    }

    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks

        try {
            checkAge(2);
        } catch (InvalidAgeException e) {
            System.out.println("The catche block got executed!!");
        }
    }

}
