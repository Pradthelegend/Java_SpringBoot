class A10 {

    public void show() throws ClassNotFoundException {

        Class.forName("Stude");
        // This line will throw a checked exception and you need to handle it using try/catch
        // or use the throws keyword to duck the exception.
        // If we use the throws keyword, then the method that is calling this one (in this case, main)
        // must handle the exception either using try/catch or continue to throw it further up.
        //Note: main() should never use throws cause jvm will call the method and jvm cannot handle it.
    }
}

public class Lecture_91_Ducking_Exception_using_throws_keyword {

    public static void main(String args[]) {

        A10 obj = new A10();
        try {
            obj.show(); // If you don't use try/catch here, it will throw an exception.
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
    }
    /*
    | **Exception Type**                                     | **Needs `throws` or try-catch?** | **Can use `throws` anyway?** | **Will code run?** |
| ------------------------------------------------------ | -------------------------------- | ---------------------------- | ------------------ |
| Checked (like `IOException`, `ClassNotFoundException`) | ✅ Yes                            | ✅ Yes                        | ✅ If handled       |
| Unchecked (like `ArithmeticException`)                 | ❌ No                             | ✅ Yes                        | ✅ Will run         |

     */
}
