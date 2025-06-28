public class Lecture_95_Runnable_VS_Thread_using_anonymous_inner_class_and_lambda_expression {

    public static void main(String[] args) {

        //Note: An anonymous inner class must either extend a class or implement an interface — but not both.
        //Here the below anonymous inner class impliments Runnable.
        Runnable obj = new Runnable() {

            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi from anonymous inner class");
                }
            }
        };

        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from anonymous inner class");
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();


    }

    //Making the above code simpler using Lambda expression.

//    public static void main(String[] args) {
//
    // We use a lambda expression here because Runnable is a functional interface.
// It has only one method: run()
// So the lambda () -> { ... } is treated as the body of the run() method.
// Java knows exactly which method we're implementing — no ambiguity allowed.
// Lambdas cannot have multiple methods; they can only implement a single abstract method.

//        Runnable obj = () ->{
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi from anonymous inner class");
//                }
//            };
//
//
//        Runnable obj1 =() ->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Hello from anonymous inner class");
//            }
//        };
//
//        Thread t1 = new Thread(obj);
//        Thread t2 = new Thread(obj1);
//
//        t1.start();
//        t2.start();
//
//
//    }
}
