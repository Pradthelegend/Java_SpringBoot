public class Lecture_87_try_with_multiple_catch {
    public static void main(String args[]) {

        int i = 2;
        int j = 0;

        int[] num = {1, 4, 6, 3, 7};

        try {
            j = 10 / i; // This will succeed since i = 2.
            /*
            If we devide by zero.
            Java detects the division by zero at runtime.
            It creates an object of type ArithmeticException.
            Then it "throws" that object.
            The catch block catches that object if there's a matching catch clause.
            */

            System.out.println(j);

            System.out.println(num[1]); // Accessing valid index

            System.out.println(num[5]); // This will throw ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) { // "e" is a reference variable and it holds an object that try throws when there is an exception also
                                      // toString() is overridden in the Throwable class (which is the superclass of all exceptions).
            System.out.println("Arithmetic Exception" + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound Exception" + e);
        }
        catch (Exception e) {
            // This is the parent class of all exceptions.
            // It must always be the last catch block, otherwise the compiler will throw an error.
            // The 'catch (Exception e)' block must always be placed after all specific exception types.
            // This is because 'Exception' is the superclass of all checked and unchecked exceptions.
           // If placed earlier, it would catch all exceptions before the specific ones get a chance,
          // making the other catch blocks unreachable and causing a compile-time error.

            System.out.println("Something went wrong");
        }

    }
}
