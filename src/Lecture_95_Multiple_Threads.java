// Class A11 extends Thread, making it a thread class.
class A11 extends Thread { // This is now a thread, not just a regular class.

    // The run() method defines what this thread will do when it runs.
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi"); // This thread prints "Hi" 100 times.
        }
    }
}

// Another thread class
class B11 extends Thread {

    // run() defines the task for this thread.
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello"); // This thread prints "Hello" 100 times.
        }
    }
}

public class Lecture_95_Multiple_Threads {

    public static void main(String[] args) {

        // Create objects of thread classes A11 and B11.
        A11 obj = new A11();   // This is thread 1
        B11 obj1 = new B11();  // This is thread 2

        // Start both threads by calling start().
        // This internally calls the run() method on a new thread.
        obj.start();  // Tells the JVM: "Run obj's run() method on a separate thread". When we call start(), it will look for a run() method to execute.
        obj1.start(); // Same here for obj1

        // Both threads will now run independently and may interleave outputs.
        // You might see output like:
        // Hi
        // Hello
        // Hi
        // Hello
        // ...
        // Order is not guaranteed — depends on thread scheduling by JVM
    }

    /*
    There's another concept called Thread Priority:

    Thread priority is a suggestion to the scheduler.
    It ranges from 1 (lowest) to 10 (highest).
    Use it when you want one thread to be more likely to get CPU time over another — but don't depend on it for correctness.

    | Constant               | Value | Description      |
| ---------------------- | ----- | ---------------- |
| `Thread.MIN_PRIORITY`  | 1     | Lowest priority  |
| `Thread.NORM_PRIORITY` | 5     | Default/Normal   |
| `Thread.MAX_PRIORITY`  | 10    | Highest priority |


Setting Priority in Java:
Thread t1 = new Thread();
t1.setPriority(10)=; // Highest priority
Thread t2 = new Thread();
t2.setPriority(1);  // Lowest priority

You can also get a thread's current priority:
int p = t1.getPriority();




     */
}
