import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture_93_Try_with_resources {

    public static void main(String args[]) throws IOException {

        int num;
        int j = 12;

        // ======= OLD STYLE: try + finally (Commented out below) =======
        /*
        // You need to uncomment the below line if you're using the old try-finally style
        // BufferedReader bf = null; // Declare outside try so finally can access it

        try {
            // InputStreamReader in = new InputStreamReader(System.in); // This can be shortened as below
            // BufferedReader bf = new BufferedReader(in);

            // BufferedReader is a resource that needs to be closed after use
            // It can take input from the keyboard, file, etc.
            bf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bf.readLine());
            j = j / num;
            System.out.println("Executed!!");
        } finally {
            // Always use finally to close resources in older Java versions (before Java 7)
            bf.close(); // Make sure to check for null before closing to avoid NullPointerException
        }
        */

        // ======= MODERN STYLE: try-with-resources (Java 7 and above) =======
        // This is a cleaner way to manage resources like BufferedReader, FileReader, etc.

        // The resource (BufferedReader here) is declared inside the parentheses of try
        // It will be automatically closed at the end of the try block — no need for finally!

        // This works because BufferedReader implements the AutoCloseable interface,
        // which has a close() method. Any class that implements AutoCloseable can be used in try-with-resources.

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter a number: ");
            num = Integer.parseInt(bf.readLine()); // Read a line of input and convert to int
            j = j / num; // Might throw ArithmeticException if num is 0
            System.out.println("Executed!!");

        } // bf.close() is called automatically here, even if an exception is thrown inside try

    }

}
