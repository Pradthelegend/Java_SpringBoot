class A12 implements Runnable {

     public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

// Another thread class
class B12 implements Runnable {

     public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}
public class Lecture_95_Runnable_VS_Thread {

    public static void main(String[] args) {

        A12 obj = new A12();
        B12 obj1 = new B12();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

    }
}
