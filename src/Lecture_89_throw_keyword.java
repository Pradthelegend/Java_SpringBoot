
public class Lecture_89_throw_keyword {
    public static void main(String args[]) {

        int i = 20; //if devided by zero will give you a zero.and we are trying to handle it in the catch.
        int j = 0;


        try {
            j = 10 / i;

            if(j==0){
                throw new ArithmeticException("The exception was throne "); //throw new ArithmeticException("The exception was thrown"); // Manually throws an ArithmeticException with a custom message.
                                                                           // This message ("The exception was thrown") will be passed to the constructor of ArithmeticException.
                                                                          // Later, when we catch this exception and print it using System.out.println(e),
                                                                          // it will display: java.lang.ArithmeticException: The exception was thrown
                                                                         // This helps in understanding what exactly caused the exception.

            }

           // System.out.println("");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e);
        }

        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("The value of j is : " + j);


    }
}
