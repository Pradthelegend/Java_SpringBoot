// TODO: Define PrinterTask class that implements Runnable

class PrinterTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
            //System.out.println(Thread.currentThread().getName() + ":" + "Running Task " + j);
        }
    }
}

public class Coding_Excercise_11_Multithreading {
    public static void main(String[] args) {
        // TODO: Create a single PrinterTask object
        PrinterTask obj = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread Worker1 = new Thread(obj);
        Thread Worker2 = new Thread(obj);
        Worker1.setName("Worker-1");
        Worker2.setName("Worker-2");


        // TODO: Start both threads
        Worker1.start();
        Worker2.start();

        // TODO: Use join() to wait for both threads to finish
        try{
            Worker1.join();
        }catch (InterruptedException e){}

        try{
            Worker2.join();
        }catch (InterruptedException e){}



    }
}


