// A12 is a class that implements Runnable.
// This means it defines a task (not a thread itself).
/*
When we create a class that implements Runnable, we are creating a task
A class that implements Runnable just defines a run() method — that’s the task logic.
It’s not a thread yet — it’s just instructions for what to do.
 */
class A12 implements Runnable {

    // The run() method contains the task logic — what this "task" will do when executed by a thread.
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

// B12 is another task class — also not a thread, just a task definition.
class B12 implements Runnable {

     public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
public class Lecture_95_Runnable_VS_Thread {

    public static void main(String[] args) {

        //This also words or you can also create the reference variable of type A12 as shown below that also words.
//        Runnable obj = new A12();
//        Runnable obj1 = new B12();

        A12 obj = new A12();
        B12 obj1 = new B12();

        /*
        "To run the task on a thread, we need to create a Thread object and pass the task object as an argument."
        The Thread object is what creates the actual thread of execution.
        You pass the task (your Runnable) into the Thread constructor.

        EX:
        Runnable task = new MyRunnable();
        Thread t = new Thread(task); // bind task to thread
        When you call t.start(), the JVM creates a new thread and runs: task.run(); on that thread.

         */
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

    }
}
