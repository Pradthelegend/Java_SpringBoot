/*
A race condition happens when two or more threads try to access or modify the same shared resource at the same time,
and the result depends on the timing or order in which they run.
 */
class A13 {

    int count;
    public void incriment() {
         count++;
     }
}
public class Lecture_98_Race_Condition {

    public static void main(String[] args) {

        A13 obj = new A13();

        Runnable r1 =() ->
        {
            for(int i=0;i<1000;i++){
                obj.incriment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

        System.out.println(obj.count);
    }
}
