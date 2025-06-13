enum Status1{ // Status is a class
    Running, Failed, Pending, Success;
}
public class Lecture_78_Enum_If_and_switch {

    public static void main(String args[]) { // Using if else and switch with enum.

        Status1 s1 = Status1.Success;

        if (s1 == Status1.Running){ // here we are saying s1 == Status.running because if we just saw Running java won't know what running you are talking about.
            System.out.println("Running");

        } else if (s1 == Status1.Failed) {
            System.out.println("Failed");

        } else if (s1 == Status1.Pending) {
            System.out.println("Pending");

        }else {
            System.out.println("Success");
        }
        System.out.println("===========================");

        switch(s1){
            case Running : //Java knows the enum type (Status1) from s1, so inside switch, you don’t have to write Status1. before every constant.
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Success");
        }
    }





}
