import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lecture_92_BufferReader_and_Scanner {

    // Note : Just watch the tururial you'll understand better.
    public static void main(String args[]) throws IOException {

        // System.out is a static final PrintStream object in the System class.
        // println() is a method of the PrintStream class.
        // System.out.println prints the argument and moves to the next line.
        System.out.println("Yes");

        // EXAMPLE:
        // int num = System.in.read();
        // This would read a single byte of data from the input (typically keyboard).
        // It returns the ASCII value of the character entered, so it only reads one character at a time.
        // System.out.println(num);

        // System.in is an InputStream (of type InputStream)
        // It reads bytes from the standard input (keyboard) as raw data.
        // It cannot directly read Strings or numbers properly.
        // So we wrap it using InputStreamReader to convert bytes to characters.

        InputStreamReader in = new InputStreamReader(System.in);
        // InputStreamReader is a bridge from byte streams to character streams.
        // It takes an InputStream (here, System.in) and reads it as characters.

        BufferedReader bf = new BufferedReader(in);
        // BufferedReader reads text from a character-input stream efficiently.
        // It buffers characters for efficient reading of characters, arrays, or lines.

        // bf.readLine() reads a full line of input and returns it as a String.
        // We parse this string into an integer using Integer.parseInt().
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num); // Print the integer back to the console.

        bf.close(); // Always good practice to close resources to free memory.

        // BufferReader was used earlier to take inputs from the user but now we have a new way to do it i.e Scanner class.

    }

}
