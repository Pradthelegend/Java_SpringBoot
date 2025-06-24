//Handling Arithmetic Exceptions in Java: Divide by Zero Safely

public class Coding_Excercise_9 {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        // TODO: Handle division using try-catch
        try{
            numerator = numerator/denominator;

        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{

            System.out.println("Program completed");

        }
    }
}
