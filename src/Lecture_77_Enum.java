enum Status{ // Status is a class
    Running, Failed, Pending, Success; // These are called "Named Constants" they are objects aswell. They also have thier own index numbers which starts from "0".
/*
In the above line Java internally does something like:
final class Status extends Enum<Status> {
    public static final Status Running = new Status();
    public static final Status Failed = new Status();
    public static final Status Pending = new Status();
    public static final Status Success = new Status();
}
So when we say:
❝Running, Failed, etc. are constant objects of that class.❞

We mean:
They are static (shared across all instances),
final (cannot be changed),
And each is an object of the enum class (Status in this case).

 */
}

public class Lecture_77_Enum {

    public static void main(String args[]) {

        Status s = Status.Success;
        System.out.println(s);
        s = Status.Failed;
        System.out.println(s);
        s = Status.Pending;
        System.out.println(s);
        s = Status.Running;
        System.out.println(s);
        System.out.println();
        System.out.println(s.ordinal()); // This will print their index number.

        // We can also create an array and store all the objects.
        Status[] s1 = Status.values(); // The 'values()' method will return an array containing all the constants of the enum in the order they are declared.

        for (Status temp : s1){

            System.out.println("Status is " + temp + " and the index number is : " + temp.ordinal());
        }
    }

}
