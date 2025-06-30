/*
A race condition happens when two or more threads try to access or modify the same shared resource at the same time,
and the result depends on the timing or order in which they run.
Using threads with shared mutable data (like the 'count' variable here) without proper synchronization
can lead to incorrect or unpredictable results. It's generally unsafe unless access is properly managed.
*/
class A13 {

    int count;
    /*
     * This method is synchronized to prevent race conditions.
     * Without the synchronized keyword, two threads may try to update 'count' at the same time,
     * which can lead to lost updates and an incorrect final value.If two threads call the method at the same time the method get executed only once.
     */
    public synchronized void incriment() {
         count++;
     }
}
public class Lecture_98_Race_Condition {

    public static void main(String[] args) {

        A13 obj = new A13();

        /*
         * Thread task defined using a lambda expression.
         * Each thread will call obj.incriment() 10,000 times.
         */
        Runnable r1 =() ->
        {
            for(int i=0;i<10000;i++){
                obj.incriment();
            }
        };

        /*
         * Another thread task defined using an anonymous inner class.
               */
        Runnable r2 = new Runnable() {

            public void run() {
                for (int i = 0; i < 10000; i++) {
                    obj.incriment();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        /*
         * The join() method ensures that the main thread waits for t1 and t2 to complete.
         * Without join(), the main thread may print obj.count before the threads finish,
         * resulting in an incorrect or partial count value being printed.
         */
        try{
            t1.join();
        }catch (InterruptedException e){}

        try{
            t2.join();
        }catch (InterruptedException e){}

        /*
         * At this point, both threads have completed execution.
         * Since each thread increments count 10,000 times,
         * the expected final value is 20,000.
         * Synchronization ensures that all increments are safely and correctly applied.
         */
        System.out.println(obj.count);
    }

}

/*
Summary of key concepts:

1. Avoid shared mutable data across threads unless absolutely necessary.
2. If shared data must be used, protect it using synchronization mechanisms like 'synchronized', 'ReentrantLock', etc.
3. The 'synchronized' keyword prevents multiple threads from executing incriment() simultaneously.
4. The join() method is critical when the main thread depends on the result of background threads.
5. Without synchronization, you will likely see a count less than 20000 due to race conditions.

This is a classic example to illustrate how thread safety is essential when working with shared data.
*/

